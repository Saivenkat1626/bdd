package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]")
	private	WebElement myAccountDRopmenu;
		@FindBy(linkText="Login")
	private WebElement LoginButton;
	@FindBy(id="input-email")
	@CacheLookup
	WebElement emailField;
	@FindBy(id="input-password")
	@CacheLookup
	WebElement passwodField;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	@CacheLookup
	WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]/i")
	@CacheLookup
	WebElement Errormessage;
	@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[1]/a")
	WebElement edityouaccountinfomationoption;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	WebElement forgetpassword;
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement forgetmessage;
	@FindBy(xpath="//*[@placeholder='E-Mail Address']")
	WebElement emailplaceholdertext;
	@FindBy(xpath="//*[@placeholde]r='Password'")
	WebElement passwordplaceholdertext;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clickonMyAccount() {
	myAccountDRopmenu.click();
}
public void clickonLoginOption() {
	LoginButton.click();
}
public void enteremail(String emailText,String passwodText) {
	
	emailField.sendKeys(emailText);
	passwodField.sendKeys(passwodText);
}

public void clickloginbutton() {
	
	loginbutton.click();
	
}
public boolean getdisplayedEmailandPasswodWarningmessage() {
	
	boolean errormessage=Errormessage.isDisplayed();
	return errormessage;	
}
public boolean getDisplayStatusofeditaccountinf() {
	boolean displayStatus=edityouaccountinfomationoption.isDisplayed();
	return displayStatus;
}
public void forgetpassword() {
	forgetpassword.click();
}
public boolean getDisplayforgetpassword() {
	boolean displayStatus=forgetmessage.isDisplayed();
	return displayStatus;
}
public boolean getDisplayemailplaceholdertext() {
	boolean displayStatus=emailplaceholdertext.isDisplayed();

	return displayStatus;
}
public boolean getDisplaypasswordplaceholdertext() {
	boolean displayStatus=passwordplaceholdertext.isDisplayed();
	return displayStatus;
}
}
