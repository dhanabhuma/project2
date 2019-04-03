package selproject1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	System.setProperty("webdriver.chrome.driver",".\\browseddriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        //Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement txtbox=driver.findElement(By.name("q"));
        txtbox.sendKeys("testing");
        Thread.sleep(2000);
        List<WebElement> results= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        System.out.println(results.size());
        results.get(4).click();
        Thread.sleep(2000);
//        
//        int size=resuls.size();
//        System.out.println(size);
//        Thread.sleep(4000);
       
//     List<WebElement> autosuggetions= driver.findElements(By.cssSelector("//li[@class='sbct']"));
//        autosuggetions.get(0).click();
       
 //       Thread.sleep(3000);
        
        driver.close();
        driver.quit();
     
        } 
		
	catch(Exception e)
        {
		System.out.println(e);
        }
        
	}
}
