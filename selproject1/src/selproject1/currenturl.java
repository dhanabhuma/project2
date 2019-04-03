package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("Mobiles");
        text.sendKeys(Keys.ENTER);		
        String currenturl=driver.getCurrentUrl();
        System.out.println(currenturl);
        String currenttitle=driver.getTitle();
        System.out.println(currenttitle);
        driver.close();
        driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}


}
