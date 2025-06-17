package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjectModule.FBLoginPageObjectModule;

public class FBLoginStepDefinition {
	
	public static WebDriver driver;
	
	FBLoginPageObjectModule Create;
	
	@Given("Launch the browser and open the Facebook page")
	public void launch_the_browser_and_open_the_facebook_page() {
		System.setProperty("webdriver.edge.driver","C:\\\\WebDriver\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Create = new FBLoginPageObjectModule(driver);
	}

@When("I Enter the Email {string}")
public void i_enter_the_email(String UserName)throws InterruptedException{
	    Create.Enter_Email(UserName);
	   
	}

@When("I Enter the Facebook Password {string}")
public void i_enter_the_facebook_password(String Password) {
	   Create.Enter_Password(Password);
	}
	@When("I click on Login")
	public void i_click_on_login() {
	    Create.Click_Login();
	}
	@Then("Click on Account")
	public void click_on_account()throws InterruptedException {
	    Create.Click_on_Account();
	}
	@Then("I click on Logout")
	public void i_click_on_logout() {
	    Create.CLick_Logout();
	}
	@Then("Click on Setting")
	public void click_on_setting() {
	    Create.Click_on_Setting();   
	}
	@Then("Remove the Account")
	public void remove_the_account() {
	     Create.Click_on_Remove_Account();
	}
	@Then("Confirm Remove from the browser")
	public void confirm_remove_from_the_browser() {
	    Create.Click_on_Confirm_Remove();
	}
	@Then("Close the browser")
	public void close_the_browser() {
	     Create.Close_the_Browser();
	}



}
