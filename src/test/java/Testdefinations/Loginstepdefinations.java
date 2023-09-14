package Testdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

import pageobjects.LoginPage;

public class Loginstepdefinations {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("^user Launch Chrome Browser$")
	public void user_launch_chrome_browser() {
		
	    driver=new FirefoxDriver();
	    lp=new LoginPage(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.manage().window().maximize();
	   driver.get(url);;
	}

	@When("click on myaccount")
	public void click_on_myaccount() {
	    lp.clickonMyAccount();
	}

	@When("click Login")
	public void click_login() {
	    lp.clickonLoginOption();
	}

	@When("user enter email as {string} and password {string}")
	public void user_enter_email_as_and_password(String email, String password) {
		
	   lp.enteremail(email, password);
	   
	}

	@When("click on login")
	public void click_on_login() {
	    lp.clickloginbutton();
	}

	@Then("page  should be\"Edit your account information\"")
	public void page_should_beEdit_your_account_information(){
	    lp.getDisplayStatusofeditaccountinf();
	}
	@Then("page  should be\"Warning No match for E-Mail Address and or Password\"")
	public void page_should_be_warning_your_account_information(){
	    lp.getdisplayedEmailandPasswodWarningmessage();
	}
	
	

	@And("close browser")
	public void close_browser() {
	   driver.quit();
	}
	 @When("click on forgetpassword")
	 public void click_on_forgetpassword() {
		 lp.forgetpassword();
	 }
	 @Then("page should be\"Forgot Your Password?\"")   
	 public void page_should_beForgot_Your_Password() {
		 lp.getDisplayforgetpassword();
	 }
	 @When("verify email address field place holder text visible or not")
	 public void verify_email_address_field_place_holdertext_visible() {
		 
	 }
	 @And("verify password field place holder text visivle or not")
	 public void verify_password_field_place_holdertext_visivle() {
		 
	 }
}
