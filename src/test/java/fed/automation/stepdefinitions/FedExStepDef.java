package fed.automation.stepdefinitions;

import fed.automation.test.CreateUserIdPageTest;
import fed.automation.test.FedExHomePageTest;
import fed.automation.test.LoginPageTest;
import fed.automation.test.OpenAccountPageTest;
import fed.automation.test.RegisterPageTest;

import fed.automation.testrunner.TestNgRunner;
import fed.automation.util.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FedExStepDef extends TestNgRunner {

	public FedExHomePageTest homePageTest;
	public OpenAccountPageTest accountPageTest;
	public RegisterPageTest registerPageTest;
	public LoginPageTest loginPageTest;
	public CreateUserIdPageTest createUserIdPageTest;

	public FedExStepDef() {
		this.homePageTest = new FedExHomePageTest();
		this.accountPageTest = new OpenAccountPageTest();
		this.registerPageTest = new RegisterPageTest();
		this.loginPageTest = new LoginPageTest();
		this.createUserIdPageTest = new CreateUserIdPageTest();
	}

	@Given("^User navigates to the application$")
	public void user_navigates_to_the_application() throws Throwable {
		TestBase.getDriver().navigate().to("https://www.fedex.com/en-gb/home.html"); // TO do property file
		TestBase.getDriver().manage().window().maximize();

		homePageTest.test_select_language();
		homePageTest.test_select_all_cookies();
	}

	@When("^User clicks on Track icon$")
	public void user_clicks_on_Track_icon() throws Throwable {
		homePageTest.test_select_track_icon();
	}

	@And("^user enter the tracking id \"([^\"]*)\"$")
	public void enterTrackNumber(String trackId) throws Throwable {
		homePageTest.test_enter_track_id(trackId);
	}

	@And("^user clicks on Track button$")
	public void user_clicks_on_Track_button() throws Throwable {

		homePageTest.test_submit_track_id();
	}

	@Then("^user gets invalid tracking information on screen$")
	public void gets_invalid_tracking_information() throws Throwable {

		homePageTest.test_track_alert_message();
	}

	@When("^user click on Signup link$")
	public void user_click_on_Signup_link() {
		homePageTest.test_signup_link();
	}

	@When("^selects the option open an account$")
	public void selects_the_option_open_an_account() {
		homePageTest.test_open_account_option_link();
	}

	@When("^click on the button open an account$")
	public void click_on_the_button_open_an_account() {
		accountPageTest.test_open_account_button();
	}

	@Then("^user verifies a welcome message for creating a new account$")
	public void user_verifies_a_welcome_message_for_creating_an_account() {
		accountPageTest.test_open_account_page_message();
	}

	@And("^user enters first name \"([^\"]*)\"$")
	public void user_enters_first_name(String frstName) {
		registerPageTest.test_enter_first_name(frstName);
	}

	@When("^user enters last name \"([^\"]*)\"$")
	public void user_enters_last_name(String lstName) {
		registerPageTest.test_enter_last_name(lstName);
	}

	@When("^user enters address \"([^\"]*)\"$")
	public void user_enters_address(String address) {
		registerPageTest.test_enter_address(address);
	}

	@When("^user enter the phone number \"([^\"]*)\"$")
	public void user_enter_the_phone_number(String phnNumb) {
		registerPageTest.test_enter_phone_number(phnNumb);
	}

	@When("^user enter the email id \"([^\"]*)\"$")
	public void user_enter_the_email_id(String email) {
		registerPageTest.test_enter_email_id(email);
	}

	@When("^user clicks on the button Enter Login Details$")
	public void user_clicks_on_the_button_enter_login_details() {
		registerPageTest.test_submit_enter_login_details();
	}

	@When("^user is able to navigate to login page$")
	public void user_is_able_to_navigate_to_login_page() {
		registerPageTest.test_login_page_appears();
	}

	@When("^user clicks on Rate and Transit Time icon$")
	public void user_clicks_on_rate_and_transit_time_icon() {
		homePageTest.test_select_rate_transit_rate_icon();
	}

	@Then("^verify the message appears on screen$")
	public void verify_the_message_appears_on_screen() {
		homePageTest.test_calculate_rate_and_transit_time_message();
	}

	@When("^user selects from \"([^\"]*)\" location$")
	public void user_selects_from_location(String loc) {
		homePageTest.test_select_from_location(loc);
	}

	@When("^user selects to \"([^\"]*)\" location$")
	public void user_selects_to_location(String loc) {
		homePageTest.test_select_to_location(loc);
	}

	@When("^user select the option use my email as my User ID$")
	public void user_select_the_option_use_my_email_as_my_User_ID() {

	}

	@When("^user select the option create my own user Id$")

	public void user_select_the_option_create_User_ID() {
		registerPageTest.test_check_userId();
	}

	@When("^user fills the password details$")
	public void user_fills_the_password_details(DataTable data) {
		registerPageTest.test_enter_password(data);
	}

	@When("^user selects the checkbox I have read$")
	public void user_selects_the_checkbox_I_have_read() {
		registerPageTest.test_check_one_box();
	}

	@When("^user selects the checkbox I would like to receive$")
	public void user_selects_the_checkbox_I_would_like_to_receive() {
		registerPageTest.test_check_two_box();
	}

	@When("^user enters an new User Id$")
	public void user_enters_an_new_User_Id() {
		registerPageTest.test_enter_userId();
	}

	@Then("^an account gets created for the user$")
	public void an_account_gets_created_for_the_user() {
		registerPageTest.test_verify_create_account_message();
	}

	@When("^clicks on Create my User Id button$")
	public void clicks_on_Create_my_User_Id_button() {
		registerPageTest.test_submit_create_my_userID();
	}

	@When("^selects the option login$")
	public void selects_the_option_login() {
		homePageTest.test_open_login_option_link();
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() {
		loginPageTest.test_login_title_appears();
	}

	@When("^user enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String ursId) {
		loginPageTest.test_enter_user_id(ursId);
	}

	@When("^user enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String pass) {
		loginPageTest.test_enter_password(pass);
	}

	@When("^user clicks on LogIn button$")
	public void user_clicks_on_LogIn_button() {
		loginPageTest.test_submit_login_id();
	}

	@Then("^user logs in the account successfully$")
	public void user_logs_in_the_account_successfully() {
		loginPageTest.test_login_error_appears();
	}

	@Then("^user logs in the account$")
	public void user_logs_in_the_account() {
		loginPageTest.test_login_failed_appears();
	}

	@When("^select the option Create User ID$")
	public void select_the_option_create_user_id() {
		homePageTest.test_create_user_id_link();
	}

	@When("^user is on registration login page$")
	public void user_is_on_registration_login_page() {
		createUserIdPageTest.test_login_title_appears();
	}

	@When("^user enters the login information$")
	public void user_enters_the_login_information(DataTable data) {
		createUserIdPageTest.test_enter_login_information(data);
	}

	@And("^user selects the secret question$")
	public void user_selects_the_secret_question() {
		createUserIdPageTest.test_select_secret_question();
	}

	@And("^user answers the secret question$")
	public void user_selects_the_secret_answer() {
		createUserIdPageTest.test_select_secret_answer();
	}

	@And("^user fills in Contact Information$")
	public void user_fills_in_contact_information(DataTable contactInfo) {
		createUserIdPageTest.test_enter_contact_information(contactInfo);
	}

	@And("^user clicks on I Accept button$")
	public void user_clicks_on_I_accept_button() {
		createUserIdPageTest.test_submit_I_Accept_button();
	}

	@And("^thank you for registering message gets displayed$")
	public void thank_you_for_registering_message() {
		createUserIdPageTest.test_contact_information_appears();
	}

	@And("^user clicks the forgot password button$")
	public void user_clicks_the_forgot_password_button() {
		loginPageTest.test_submit_forgot_password();
	}

	@And("^user clicks on Reset button$")
	public void user_clicks_on_reset_button() {
		loginPageTest.test_submit_reset_password();
	}

	@And("^user navigates to forgot password screen$")
	public void user_navigates_to_forgot_password_screen() {
		loginPageTest.test_forgot_password_Title();
	}

	@And("^user navigates to password reset screen$")
	public void user_navigates_to_password_reset_screen() {
		loginPageTest.test_reset_password_Title();
	}

	@And("^user clicks on submit button in$")
	public void user_clicks_on_submit_button() {
		loginPageTest.test_submit_button();
	}

	@And("^user gets the message How do you want to reset your password$")
	public void user_gets_reset_password_message() {
		loginPageTest.test_reset_password_message();
	}

	@When("^user enters the userID \"([^\"]*)\"$")
	public void user_enters_the_userID(String ursId) {
		loginPageTest.test_enter_user_name(ursId);
	}

}
