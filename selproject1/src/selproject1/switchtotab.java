package selproject1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtotab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lenskart.com//");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		ArrayList<String> handles=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(handles.get(1));
		driver.get("https:www.google.com//");
		WebElement txtbox=driver.findElement(By.name("q"));
		txtbox.sendKeys("testing");
		txtbox.sendKeys(Keys.ENTER);
		driver.switchTo().window(handles.get(0));
		Thread.sleep(3000);
		driver.close();
	driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
