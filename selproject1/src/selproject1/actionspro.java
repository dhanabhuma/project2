package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys("testing");
		Thread.sleep(1000);
		WebElement autosuggessions=driver.findElement(By.xpath("//ul[@class='erkvQe']//li[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(autosuggessions).click().perform();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
