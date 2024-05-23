package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookClasses extends BaseClass {

@Given("User has  to launch the browser and maximize the window")
public void user_has_to_launch_the_browser_and_maximize_the_window() {
	launchBrowser();
	WindowMaximize();
    
}

@When("User has to hit the facebook url")
public void user_has_to_hit_the_facebook_url() {
	launchUrl("https://en-gb.facebook.com/");
  
}

@When("user has to pass the data {string}in email field")
public void user_has_to_pass_the_data_in_email_field(String em) {
	FbLoginPojo f = new FbLoginPojo();
	passText(em, f.getEmail());
    
}

@When("User has to pass the data {string}in password field")
public void user_has_to_pass_the_data_in_password_field(String pass) {
	FbLoginPojo f = new FbLoginPojo();
	passText(pass, f.getPassword());
   
}

@When("User has to click the login button")
public void user_has_to_click_the_login_button() {
	FbLoginPojo f = new FbLoginPojo();
	clickBtn(f.getLoginbtn());
  
}

@Then("User has To close the browser")
public void user_has_To_close_the_browser() {
	closeEntireBrowser();
    
}

}
