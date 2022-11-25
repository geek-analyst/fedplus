package fed.automation.test;

import fed.automation.pages.FedExHomePage;

public class FedExHomePageTest {

	FedExHomePage objHomePage;

	public FedExHomePageTest() {
		objHomePage = new FedExHomePage();
	}

	public void test_select_language() {
		objHomePage.selectLanguage();
	}

	public void test_select_all_cookies() {

		objHomePage.selectAllCookies();
	}

	public void test_select_track_icon() {
		objHomePage.selectTrackIcon();
	}

	public void test_enter_track_id(String trckId) {
		objHomePage.enterTrackId(trckId);
	}

	public void test_submit_track_id() {
		objHomePage.submitTrackId();
	}

	public void test_track_alert_message() {
		objHomePage.verifyTrackAlertMessage();
	}

	public void test_signup_link() {
		objHomePage.selectSignUp();
	}

	public void test_create_user_id_link() {
		objHomePage.selectCreateUserIdOption();
	}

	public void test_open_account_option_link() {
		objHomePage.selectOpenAccountOption();
	}

	public void test_open_login_option_link() {
		objHomePage.selectLoginOption();
	}

	public void test_select_rate_transit_rate_icon() {
		objHomePage.selectRateTransitTimeIcon();
	}

	public void test_calculate_rate_and_transit_time_message() {
		objHomePage.verifyCalculateRateMessage();
	}

	public void test_select_from_location(String frmLoc) {
		objHomePage.selectFromLocation(frmLoc);
	}

	public void test_select_to_location(String toLoc) {
		objHomePage.selectToLocation(toLoc);
	}

}
