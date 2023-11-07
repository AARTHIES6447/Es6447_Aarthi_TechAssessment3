package com.Aarthi.TechAssessment3;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class RegisterLocators {
	@FindBy(xpath ="//a[@class='ico-register']")
	WebElement clickRegister;
	
	@FindBy(xpath ="//input[@id='gender-female']")
	WebElement radioButton;
	
	@FindBy(xpath ="//input[@name='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastName;
	
	@FindBy(xpath ="//input[@name='Email']")
	WebElement email;
	
	@FindBy(xpath ="//input[@name='Password']")
	WebElement passWord;
	
	@FindBy (xpath = "//input[@name='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerButton;
 
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logOut;
}

