package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class pomLoginStepDefinition {
/*	public LoginPage lp;
	public WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("user enters valid username and password")
	//public void user_enters_valid_username_and_password() 
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password)
	{
	   lp= new LoginPage(driver);
	   lp.enterusername(username);
	   lp.enterpassword(password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   lp.ClickLogin();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		
		lp.IsLogoDisplayed();
	    //Assert.assertTrue(driver.findElements(By.xpath("//div[@class='header_label']")).size()>0);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
 */
}
