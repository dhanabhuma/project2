package selproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locusingpartiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subodh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement todaysdeal=driver.findElement(By.partialLinkText("Today's"));
		todaysdeal.click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		}

	}


