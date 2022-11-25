package fed.automation.test;

import fed.automation.pages.LoginPage;

public class LoginPageTest {
	
	
	LoginPage loginPage;

	public LoginPageTest() {
		loginPage = new LoginPage();
	}
	
	public void test_login_title_appears() {
		
		loginPage.verifyLoginTitle();
	}
	
	public void test_enter_user_id(String userId) {
		loginPage.enterUserId(userId);
	}
	
	public void test_enter_password(String pwd) {
		loginPage.enterPassword(pwd);
	}

	public void test_submit_login_id()  {
		
		loginPage.submitLogin();
		
	}
	
	public void test_login_reminder_title_appears() {
		loginPage.verifyLoginReminderModeTitle();
	}
		
	public void test_submit_confirm() {
		loginPage.submitConfirm();
	}
	
	public void test_login_error_appears() {
		loginPage.verifyLoginError();
	}
	
	public void test_login_failed_appears() {
		loginPage.verifyFailed();
	}
	
	
	public void test_submit_forgot_password()
 {
		loginPage.selectForgotPassword();
	}
	
	public void test_submit_reset_password() {
		loginPage.selectResetPassword();
		
			}
	
	public void test_forgot_password_Title()
	 {
			loginPage.verifyForgotPasswordTitle();
		}
	
	public void test_reset_password_Title()
	 {
			loginPage.verifyResetPasswordTitle();
		}
	
	public void test_submit_button() 
	 {
			loginPage.clickSubmit();
		}
	public void test_reset_password_message()
	 {
			loginPage.verifyResetPasswordMessage();
		}
	
	public void test_enter_user_name(String uName)
	 {
			loginPage.enterUserName(uName);
		}
	
	
	
}
