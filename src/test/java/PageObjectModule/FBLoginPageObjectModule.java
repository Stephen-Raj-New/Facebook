package PageObjectModule;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPageObjectModule {
	WebDriver driver;
	
	@FindBy(xpath= "//input[@id='email']")
	WebElement Email_Locator;
	@FindBy(xpath= "//input[@id='pass']")
	WebElement Password_Locator;
	@FindBy(xpath= "//button[@name='login']")
	WebElement Login_Locator;
	@FindBy(xpath= "//div[@aria-label='Your profile']")
	WebElement Account_Locator;
	@FindBy(xpath= "(//span[@dir='auto'])[8]")
	WebElement Logout_Locator;
	@FindBy(xpath= "   ")
	WebElement Click_on_Setting_Locator;
	@FindBy(xpath= "   ")
	WebElement Click_on_Remove_Account;
	@FindBy(xpath= "   ")
	WebElement Confirm_Remove_from_the_Browser;
	
	
	public FBLoginPageObjectModule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
public void Enter_Email(String email) throws InterruptedException{
	Email_Locator.sendKeys(email);
	//Thread.sleep(5000);
	}
public void Enter_Password1(String Password) {
	Password_Locator.sendKeys(Password);
}
public void Click_Login() {
	//Login_Locator.click();
	Password_Locator.sendKeys(Keys.TAB);
	Password_Locator.sendKeys(Keys.TAB);
	Password_Locator.sendKeys(Keys.ENTER);
}
public void Click_on_Account() throws InterruptedException{
	Account_Locator.click();
	Thread.sleep(10000);
}
public void CLick_Logout() {
	Logout_Locator.click();
}
public void Click_on_Setting() {
	Click_on_Setting_Locator.click();
}
public void Click_on_Remove_Account() {
	Click_on_Remove_Account.click();
}
public void Click_on_Confirm_Remove() {
	Confirm_Remove_from_the_Browser.click();
}
public void Close_the_Browser() {
	driver.quit();
}


public void Enter_Password(String password) {
	// TODO Auto-generated method stub
	
}
}
