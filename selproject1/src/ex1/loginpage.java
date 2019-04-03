package ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	final WebDriver driver;
	
	@FindBy(id="ap_email")
	
	public WebElement username;
	
	@FindBy(id="ap_password")
	
	public WebElement password;
	
	@FindBy(id="continue")
	
	public WebElement continuebutton;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterusername()
	{
		username.sendKeys("satya_gupta@hotmail.com");
	}
	
	
}
