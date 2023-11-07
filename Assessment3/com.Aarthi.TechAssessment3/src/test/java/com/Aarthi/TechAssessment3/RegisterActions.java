package com.Aarthi.TechAssessment3;
 
import org.openqa.selenium.support.PageFactory;
 
public class RegisterActions {
	RegisterLocators registerlocatorsclass ;
	
	
	public RegisterActions(){
		registerlocatorsclass = new RegisterLocators();
		PageFactory.initElements(HelperClass.getDriver(), registerlocatorsclass);
	}
	public void clickRegister() {
		registerlocatorsclass.clickRegister.click();		
	}
	public void clickRadiobutton() {
		registerlocatorsclass.registerButton.click();
	}
	public void setFirstname(String firstName) {
		registerlocatorsclass.firstName.sendKeys(firstName);
	}
	public void setLastname(String lastName) {
		registerlocatorsclass.lastName.sendKeys(lastName);
	}
	public void setemail(String email) {
		registerlocatorsclass.email.sendKeys(email);
	}
	public void setPassword (String passWord) {
		registerlocatorsclass.passWord.sendKeys(passWord);
	}
	public void setconfirmPassword(String confirmPassWord) {
		registerlocatorsclass.confirmPassword.sendKeys(confirmPassWord);
	}
	public void clickRegisterbtn() {
		registerlocatorsclass.registerButton.click();
	}
	public void clickLogout() {
		registerlocatorsclass.logOut.click();
	}
	public void registerDetails(String firstName, String lastName, String email, String passWord, String confirmPassWord) {
		clickRegister();
		clickRadiobutton();
		setFirstname(firstName);
		setLastname(lastName);
		setemail(email);
		setPassword(passWord);
		setconfirmPassword(confirmPassWord);
		clickRegisterbtn();
		clickLogout();			
	}
 
}
 