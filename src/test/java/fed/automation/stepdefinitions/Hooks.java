package fed.automation.stepdefinitions;

import java.util.logging.Logger;

import fed.automation.util.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {
	
	private static Logger logger = Logger.getLogger(Hooks.class.getName());

	@Before
	public void startTest() {
		logger.info("Starting test...");
		TestBase.getDriver();
	}

	@After
	public void tearDown() {
		TestBase.closeDriver();
	}

}
