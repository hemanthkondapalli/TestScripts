package Academy;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.youtube.com/");
		System.out.println(driver1.getTitle());
		
		Thread.sleep(4000);
		driver1.findElement(By.name("search_query")).sendKeys("IRONMAN 4");
		Thread.sleep(4000);
		driver1.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(4000);
		

		
		TakesScreenshot screenshot = (TakesScreenshot)driver1;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\HK\\git\\Automation\\Screenshots\\.png"));
		System.out.println("Screenshot is captured");
		Thread.sleep(4000);
		
//		driver1.close();
		
//https://github.com/YadaGiriReddy/HYR-Tutorials/tree/master/Selenium%20Java%20in%20Telugu		
//https://github.com/RoshanGhadge20/Rahul_Shetty_Selenium_Assignments/blob/main/src/test/java/Rahul_Shetty_Code_Practice/Section_15_122.java	
		
	}

}
