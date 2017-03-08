package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser){
		
		if (browser.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		WebDriverWait wait = new WebDriverWait(driver, 100);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.navigate().to("http://newtours.demoaut.com");
	}
	
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}

}
