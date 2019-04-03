package ex1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {

	@Test
	public void testcase_01() {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", ".\\browseddriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.com/");
			driver.manage().window().maximize();

			Thread.sleep(3000);
			homepage hpage = new homepage(driver);
			loginpage page2 = new loginpage(driver);
			// hpage.linklogin.click();

			Thread.sleep(2000);
			hpage.login();
			Thread.sleep(2000);
			page2.enterusername();
			driver.close();

			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void testcase_02() {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", ".\\browseddriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.com/");
			driver.manage().window().maximize();

			Thread.sleep(3000);
			homepage hpage = new homepage(driver);
			loginpage page2 = new loginpage(driver);
			// hpage.linklogin.click();

			Thread.sleep(2000);
			hpage.login();
			Thread.sleep(2000);
			page2.enterusername();
			driver.close();

			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	

}
