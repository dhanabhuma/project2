package selproject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locusingclassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Subodh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement signInLink=driver.findElement(By.id("nav-link-accountList"));
		signInLink.click();
		//Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("satya_gupta@hotmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("gupta78");
		//WebElement loginbutton=driver.findElement(By.className("a-button-input"));
		WebElement loginbutton=driver.findElement(By.cssSelector("input[id='signInSubmit']"));
		loginbutton.click();
		
		
		
		
				
	     Thread.sleep(3000);
	     
	    driver.close();
		driver.quit();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
