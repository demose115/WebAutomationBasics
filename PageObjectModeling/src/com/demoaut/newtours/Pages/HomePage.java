package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(name = "userName")
	@CacheLookup
	private WebElement username;
	
	@FindBy(name = "password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(name = "login")
	@CacheLookup
	private WebElement submit;
	
	//Constructor
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Method - describing logging in on the web page
	public void login(String user, String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}

}
