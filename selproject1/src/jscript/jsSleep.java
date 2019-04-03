package jscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", ".\\browseddriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement txtbox = driver.findElement(By.name("q"));
			txtbox.sendKeys("testing");
			Thread.sleep(2000);
			List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='sbtc']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.setTimeout(arguments[arguments-1], 3000);");
			js.executeScript("arguments[0].click()", autosuggestions.get(0));
			js.executeScript("window.setTimeout(arguments[arguments-1], 5000);");
			String url=js.executeScript("return document.URL;").toString();
			System.out.println(url);
			js.executeScript("window.scrollBy(0, 800)");
			Thread.sleep(5000);
			js.executeScript("window.setTimeout(arguments[arguments-1], 5000);");
			
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
