package ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	final WebDriver driver;

	@FindBy(id = "nav-link-accountList")

	public WebElement linklogin;

	@FindBy(css = "input[@id='twotabsearchtextbox']")

	public WebElement searchbox;

	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {

		linklogin.click();
	}

}
