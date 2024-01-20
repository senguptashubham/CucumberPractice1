package configDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfigDriver {
	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	@BeforeMethod
	public static void setUpDdriver() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		webDriver.set(driver);
		webDriver.get().manage().timeouts()
				.implicitlyWait(2, TimeUnit.SECONDS);
		
	}

	

	@AfterMethod
	public synchronized void afterSuite() {
		webDriver.get().close();
		webDriver.get().quit();
	}

}
