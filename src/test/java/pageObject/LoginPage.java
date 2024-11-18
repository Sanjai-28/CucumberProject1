package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By txt_username= By.xpath("//input[@id='user-name']");
	By txt_password= By.xpath("//input[@id='password']");
	By btn_Login= By.xpath("//input[@id='login-button']");
	By lp_Logo= By.xpath("//div[@class='header_label']");
	
	public void enterusername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void ClickLogin()
	{
		driver.findElement(btn_Login).click();
	}
	
	public void IsLogoDisplayed()
	{
		driver.findElement(lp_Logo).isDisplayed();
	}
}
