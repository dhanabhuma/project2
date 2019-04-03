package com.test;

import org.testng.annotations.Test;

public class testNgFeatures {
	
	
	@Test
	public void LoginTest()
	{
		System.out.println("logintest");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void homepageTest()
	{
		System.out.println("homepage test");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void serchpageTest()
	{
		System.out.println("searchpagetest");
	}
    @Test(dependsOnMethods="LoginTest")
    public void registrationTest()
    {
    	System.out.println("registration test");
    }
}
