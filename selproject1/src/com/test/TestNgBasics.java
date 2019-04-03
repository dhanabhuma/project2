package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup system property for chrome");
	}
	
	
	
	
	@BeforeTest
	public void login()
	{
		System.out.println("launch browser");
	}
	@BeforeClass
	public void launchbrowser()
	{
	System.out.println("login toappp");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter url");
	}
	/*
	 @before method
	 @test1
	 @after method
	 @before method
	  @test 2
	  @after method
	 */
	
	@Test
	public void googletitletest()
	{
	System.out.println("google title test");
	}
	@Test
	public void searchTest()
	{
		System.out.println("search test");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from app");
	}
  
    @AfterClass
    public void closeBrowser()
    {
    	System.out.println("close browser");
    }
   @AfterTest
   public void deleteallcookies()
   {
	   System.out.println("delete all cookies");
   }
   
}
