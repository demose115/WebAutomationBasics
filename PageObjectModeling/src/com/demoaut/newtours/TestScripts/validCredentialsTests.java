package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.HomePage;

public class validCredentialsTests extends BaseTest {
	
	//Method
	@Test
	public void validlogin(){		
		HomePage hp = new HomePage(driver);
		hp.login("mercury", "mercury");
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);		
	}
}
