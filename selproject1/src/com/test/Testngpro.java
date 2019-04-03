package com.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpro {

	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}

	@Test
	public void testcase1() {
		try {
			System.setProperty("webdriver.chrome.driver", ".\\browseddriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://google.com/");
			Reporter.log("1.launched google page");
			WebElement txtbox = driver.findElement(By.name("q"));
			txtbox.sendKeys("testing");
			Reporter.log("2.entred the keyword in search field");
			Thread.sleep(2000);
			List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='sbtc']"));
			autosuggestions.get(1).click();
			Reporter.log("navigated to search reults");
			Thread.sleep(2000);
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	

	@Test
	public void testcase2() {
		try {
			System.setProperty("webdriver.chrome.driver", ".\\browseddriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://google.com/");
			Reporter.log("1.launched google page");
			WebElement txtbox = driver.findElement(By.name("q"));
			txtbox.sendKeys("testing");
			Reporter.log("2.entred the keyword in search field");
			Thread.sleep(2000);
			List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='sbtc']"));
			autosuggestions.get(1).click();
			Reporter.log("navigated to search reults");
			Thread.sleep(2000);
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		    String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		    File screenshotname=new File("c:\\dhanaselenium\\shots\\"+timestamp+".png");
		    FileUtils.copyFile(srcfile,screenshotname);
		    String filepath=screenshotname.toString();
		    String path="<img src=\"file://"+filepath+"\"alt=\"\"/>";
		    Reporter.log(path);
		    driver.close();
		    driver.quit();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}

	@AfterMethod
	public void aftermethod() {

		

		System.out.println("aftermethod");
	}

}
