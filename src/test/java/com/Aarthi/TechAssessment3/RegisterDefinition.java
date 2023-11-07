package com.Aarthi.TechAssessment3;
 
import java.util.List;
import java.util.Map;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class RegisterDefinition {
	@Given("User lands in Opencart HomePage")
	public void user_lands_in_opencart_home_page() {
		  System.out.println("HomePage");
		   HelperClass.openPage("https://demowebshop.tricentis.com/");
	}
	@When("User clicks Register link")
	public void user_clicks_register_link() {
		System.out.println("Register Page opened");
	}
 
	@When("User enters Genter,Firstname,Lastname,E-Mail,Password and CPassword")
	public void user_enters_genter_firstname_lastname_e_mail_password_and_c_password(io.cucumber.datatable.DataTable dataTable, Object registerButton) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	data.get("radioButton");
	    	data.get("firstName");
	    	data.get("lastname");
	    	data.get("email");
	    	data.get("passWord");
	    	data.get("confirmPassword");   
	    }
	}
	@When("User click register button")
	public void user_click_register_button() {
		System.out.println("User got Registered"); 
	}
 
	@Then("User get successfully registerd message and log out")
	public void user_get_successfully_registerd_message_and_log_out() {
		System.out.println("Succesfully logged out");
	}
}
