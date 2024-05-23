package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostiviteOneandNegativeOne extends BaseClass {
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		WindowMaximize();

	}

	@When("To launch the url of the  facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field(String em) {
		FbLoginPojo f = new FbLoginPojo();
		passText(em, f.getEmail());

	}

	@When("To pass valid password in password field")
	public void to_pass_valid_password_in_password_field(String pass) {
		FbLoginPojo f = new FbLoginPojo();
		passText(pass, f.getPassword());

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		FbLoginPojo f = new FbLoginPojo();
		clickBtn(f.getLoginbtn());

	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("check and verify");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}
