package selproject1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.com/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("mobiles");
		text.sendKeys(Keys.ENTER);
		WebElement getkeyword=driver.findElement(By.xpath("//span[@id='s-result-count']"));
		String result=getkeyword.getText();
		System.out.println(result);
		WebElement link=driver.findElement(By.id("nav-link-accountList"));
		String txt=link.getText();
		System.out.println(txt);
		link.click();
		Robot robot=new Robot();
	
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyPress(KeyEvent.VK_A);
		
		
		
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
