package fed.automation.test;

import fed.automation.pages.OpenAccountPage;
import fed.automation.pages.RegisterPage;

public class OpenAccountPageTest {

	OpenAccountPage objOpenAccountPage;
	RegisterPage registerPage;

	public OpenAccountPageTest() {
		objOpenAccountPage = new OpenAccountPage();
		registerPage = new RegisterPage();
	}

	public void test_open_account_button() {
		objOpenAccountPage.openAccountButton();
	}

	public void test_enter_first_name(String frstName) {
		registerPage.enterFirstName(frstName);
	}

	public void test_enter_last_name(String lastName) {
		registerPage.enterLastName(lastName);
	}

	public void test_enter_address(String address) {
		registerPage.enterAddress(address);
	}

	public void test_open_account_page_message() {
		objOpenAccountPage.verifyOpenAccountMessage();
	}

}
