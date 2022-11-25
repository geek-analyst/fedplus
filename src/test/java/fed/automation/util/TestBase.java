
package fed.automation.util;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	private static Logger logger = Logger.getLogger(TestBase.class.getName());
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeTest
	public void setUp() {
		getDriver();
	}
	
	public static WebDriver getDriver() {
		logger.info("Initializing Driver...");
		if (driver != null) {
			return driver;
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Browser started ...");
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			return driver;
		}
	}

	public static WebDriverWait getWait() {
		return wait;
	}

	@AfterSuite
	public static void closeDriver() {
		logger.info("Suite completed, closing browser...");
		driver.quit();
		driver = null;
	}
}
