package fed.automation.test;

import fed.automation.pages.CreateUserIdPage;
import io.cucumber.datatable.DataTable;

public class CreateUserIdPageTest {

	CreateUserIdPage createUserIdPage;

	public CreateUserIdPageTest() {
		createUserIdPage = new CreateUserIdPage();
	}

	public void test_login_title_appears() {

		createUserIdPage.verifyLoginRegistrationTitle();
	}

	public void test_enter_login_information(DataTable loginData) {

		createUserIdPage.enterLoginInformation(loginData);
	}

	public void test_select_secret_question() {

		createUserIdPage.selectSecretQuestion();
	}

	public void test_select_secret_answer() {

		createUserIdPage.enterSecretAnswer();
	}

	public void test_enter_contact_information(DataTable contactData) {

		createUserIdPage.enterContactInformation(contactData);
	}

	public void test_submit_I_Accept_button() {

		createUserIdPage.submitIAccept();
	}

	public void test_contact_information_appears() {
		createUserIdPage.verifyContactInfoTitle();
	}

}
