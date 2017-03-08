package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAFlight {
	
	private WebDriver driver;
	
	//Page objects
	@FindBy(name = "passFirst0")
	@CacheLookup
	private WebElement firstname;
	
	@FindBy(name = "passLast0")
	@CacheLookup
	private WebElement lastname;
	
	@FindBy(name = "pass.0.meal")
	@CacheLookup
	private WebElement meal;
	
	@FindBy(name = "creditnumber")
	@CacheLookup
	private WebElement ccnumber;
	
	@FindBy(name = "cc_exp_dt_mn")
	@CacheLookup
	private WebElement ccexpdate;
	
	@FindBy(name = "cc_exp_dt_yr")
	@CacheLookup
	private WebElement ccexpyear;
	
	@FindBy(name = "cc_frst_name")
	@CacheLookup
	private WebElement ccfirstname;
	
	@FindBy(name = "cc_last_name")
	@CacheLookup
	private WebElement cclastname;
	
	@FindBy(name = "buyFlights")
	@CacheLookup
	private WebElement securePurchase;
	
	//Method
	public void selectMeal(){
		meal.click();
		Select drpMeal = new Select(meal);
		drpMeal.selectByVisibleText("Diabetic");		
	}
	
	//Method
	public void selectExp(){
		ccexpdate.click();
		Select drpExpDate = new Select(ccexpdate);
		drpExpDate.selectByValue("4");
		
		ccexpyear.click();
		Select drpExpYear = new Select(ccexpyear);
		drpExpYear.selectByVisibleText("None");
	}
	
	//Constructor
	public BookAFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void TicketCheckout(String pFirstName, String pLastName, String vCC, String pccfirstname, String pcclastname){
		firstname.sendKeys(pFirstName);
		lastname.sendKeys(pLastName);		
		ccnumber.sendKeys(vCC);
		ccfirstname.sendKeys(pccfirstname);
		cclastname.sendKeys(pcclastname);
		securePurchase.click();		
	}

}
