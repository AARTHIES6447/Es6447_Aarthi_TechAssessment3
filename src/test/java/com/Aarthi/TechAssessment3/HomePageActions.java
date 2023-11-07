package com.Aarthi.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
HomePageLocators HomepageLocators ;
	
	public HomePageActions(){
		HomepageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), HomepageLocators);
	}
	
	public String verifyText() {
		return HomepageLocators.verifyText.getText();
	}
	public String VerifyErrorMessage() {
		return HomepageLocators.VerifyErrorMessage.getText();
	}
 
	
	}