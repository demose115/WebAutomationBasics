package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.HomePage;
import com.demoaut.newtours.Pages.SelectFlight;

public class FlightBookingTest extends BaseTest{
//	WebDriver driver;
	private String expected = "Your itinerary has been booked!";
	private String actual = "";
	
	// Method
	@Test
	public void bookTicket(){
		HomePage hp = new HomePage(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		hp.login("mercury", "mercury");
		ff.selectPreference();
		sf.FlightTrip();
		bf.TicketCheckout("Eddie", "Money", "45510410016005243", "Eddie", "Money");
		actual = driver.findElement(By
				.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		Assert.assertEquals(expected, actual);
	}
}
