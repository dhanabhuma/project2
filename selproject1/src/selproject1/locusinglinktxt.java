package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locusinglinktxt {

	public void testcase_01() {
		// TODO Auto-generated method stub
		try {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subodh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement linktxt=driver.findElement(By.linkText("Today's Deals"));
		linktxt.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		}
        catch(Exception e) {
	     System.out.println(e);
        }
}
	}


