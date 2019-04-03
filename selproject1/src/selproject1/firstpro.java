package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement txtbox=driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("mobiles");
		WebElement searchIcon=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		searchIcon.click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		}
		catch(Exception e) {
		System.out.println(e);
		
		}
}
}





