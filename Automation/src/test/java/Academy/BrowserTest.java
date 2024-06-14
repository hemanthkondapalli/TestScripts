package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HK\\git\\Automation\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
//		driver.close();
		
		
	
		
		
	}
}
