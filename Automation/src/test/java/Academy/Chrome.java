package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Chrome {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HK\\git\\Automation\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.youtube.com/");
		
		
	}

}
