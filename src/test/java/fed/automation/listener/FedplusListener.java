package fed.automation.listener;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import fed.automation.exception.FedPlusException;
import fed.automation.util.TestBase;

public class FedplusListener extends TestBase implements ITestListener {
	
	private static final Logger logger =  Logger.getLogger(FedplusListener.class.getName());

	public void onTestFailure(ITestResult result) {
		try {
			screenShot(result);
		} catch (FedPlusException e) {
			logger.log(Level.SEVERE, "Exception while taking screenshot");
		}
	}
	
	public void screenShot(ITestResult result) throws FedPlusException {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) getDriver();
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File(System.getProperty("user.dir")+ "\\screenshots\\" + result.getMethod().getMethodName() + System.currentTimeMillis() + ".png"));
				logger.log(Level.INFO, "Error screenshot taken...");
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Exception while taking screenshot");
				throw new FedPlusException(e.getMessage());
			}
		}
	}

}
