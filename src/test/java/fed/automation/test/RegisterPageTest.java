package fed.automation.test;

import fed.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;

public class RegisterPageTest {

	RegisterPage registerPage;

	public RegisterPageTest() {
		registerPage = new RegisterPage();
	}

	public void test_enter_first_name(String frstName) {
		registerPage.enterFirstName(frstName);
	}

	public void test_enter_last_name(String lstName) {
		registerPage.enterLastName(lstName);
	}

	public void test_enter_address(String address) {
		registerPage.enterAddress(address);
		registerPage.selectFirstAddressOption();
	}

	public void test_enter_phone_number(String phnNumbr) {
		registerPage.enterPhoneNumber(phnNumbr);
	}

	public void test_enter_email_id(String emailId) {
		registerPage.enterEmailID(emailId);
		// Thread.sleep(3000);
	}

	public void test_submit_enter_login_details() {
		registerPage.submitEnterLoginDetails();
		// Thread.sleep(5000);
	}

	public void test_login_page_appears() {
		registerPage.verifyLoginPageMessage();
	}

	public void test_enter_password(DataTable passdata) {

		registerPage.enterPass(passdata);
	}

	public void test_check_one_box() {
		registerPage.checkfirst();
	}

	public void test_check_two_box() {
		registerPage.checkTwo();
	}

	public void test_submit_create_my_userID() {
		registerPage.enterCreateUserID();
	}

	public void test_check_userId() {
		registerPage.checkUserIDButton();
	}

	public void test_enter_userId() {
		registerPage.enterUserID();
	}

	public void test_verify_create_account_message() {
		registerPage.verifyCreateAccountScreenMessage();
	}

}
