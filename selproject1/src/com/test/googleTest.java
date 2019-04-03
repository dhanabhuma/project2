package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://google.com/");
	}
	@Test(priority=1,groups="title")
	public void googletitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3,groups="logo")
	public void googleLogoTest()
	{
		//Boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=2,groups="linktest")
	public void mailLinkTest()
	{
		//Boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
//		if(b)
//			System.out.println(b);
//		else
//			System.out.println(b);
	}
	@Test(priority=4,groups="test")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=5,groups="test")
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=6,groups="test")
	public void test3()
	{
		System.out.println("test3");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	
	}

}
