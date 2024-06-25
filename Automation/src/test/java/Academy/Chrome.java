package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Chrome {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HK\\git\\Automation\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.youtube.com/");
		
// 		WebDriver driver = new FirefoxDriver();
// driver.get(“https://www.gmail.com”);
// driver.findElement(By.xpath(“xpath_of_element1”)).sendKeys(“Software Testing Material Website”);
// driver.findElement(By.xpath(“xpath_of_element1”)).clear();

	}

}
