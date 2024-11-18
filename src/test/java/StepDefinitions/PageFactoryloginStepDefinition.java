package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryloginStepDefinition 
{
	public WebDriver driver;
	public LoginPageFactory lpf;
	public HomePageFactory hpf;
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
		lpf=new LoginPageFactory(driver);
		lpf.enterusername(username);
		lpf.enterpassword(password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	   lpf.clickLogin();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		hpf =new HomePageFactory(driver);
		hpf.isLogodispaled();
	   // Assert.assertTrue(driver.findElements(By.xpath("//div[@class='header_label']")).size()>0);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    //driver.close();
		driver.quit();
	}


}
