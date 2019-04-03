package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class acprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
		System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		action.moveToElement(link).perform();
		Thread.sleep(3000);
		WebElement linkyouraccount=driver.findElement(By.xpath("//div[@class='nav-al-column nav-template nav-flyout-content nav-tpl-itemList']//span[contains(text(),'Your Account')]"));
		linkyouraccount.click();
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
		

	}

}
