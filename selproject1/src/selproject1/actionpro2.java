package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionpro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subodh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement closepop=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		//col-12-12 _1PBbw8 _26x3Jb
		closepop.click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("mobile cases");
		Thread.sleep(3000);
		
		WebElement autosuggetions=driver.findElement(By.xpath("//ul[@class='col-12-12 _1PBbw8 _26x3Jb']//li[2]"));
		Actions action =new Actions(driver);
		action.moveToElement(autosuggetions).click().perform();
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
