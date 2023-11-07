package com.Aarthi.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocators {
		@FindBy(xpath="//a[text()=\"vinothbcr74@gmail.com\"]")
		WebElement verifyText;
		
		@FindBy(xpath="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
		WebElement VerifyErrorMessage;
 
	}
