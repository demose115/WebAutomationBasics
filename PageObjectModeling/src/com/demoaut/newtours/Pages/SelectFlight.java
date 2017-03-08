package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	private WebDriver driver;
	
	@FindBy(name="outFlight")
	@CacheLookup
	private WebElement outflight;
	
	@FindBy(name="inFlight")
	@CacheLookup
	private WebElement inflight;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement Continue;
	
	//Constructor
	public SelectFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Method - describing selecting Departure and Return flights
		public void FlightTrip(){
			outflight.click();
			inflight.click();
			Continue.click();
		}
	

}
