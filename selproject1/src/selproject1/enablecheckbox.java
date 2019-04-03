package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enablecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			WebElement text =driver.findElement(By.id("twotabsearchtextbox"));
			text.sendKeys("mobiles");
			text.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			//WebElement primechkbox=driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox']"));
			//WebElement primechkbox=driver.findElement(By.xpath("//li[@id='p_85/2470955011']"));
			WebElement primechkbox1=driver.findElement(By.xpath("//li[@id='p_85/2470955011']//input[@type='checkbox']"));
		   // System.out.println("Before click");
			primechkbox1.click();
		   // System.out.println("After click");
		   // Thread.sleep(2000);
		 // primechkbox.click();
		    Thread.sleep(2000);
		    if(primechkbox1.isSelected()) 
		    {
		    	System.out.println("check boxnis enabled");
		    }
		    else {
		    	System.out.println("not selected");
		    }
		   // WebElement delivery=driver.findElement(By.xpath("//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox']"));
		   // delivery.click();
		   // Thread.sleep(3000);
		    driver.close();
		    driver.quit();
		    }
		catch( Exception e) {
			System.out.println(e);
		}
		}

	}


