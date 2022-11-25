package fed.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import fed.automation.constants.Message;
import fed.automation.stepdefinitions.Hooks;

public class LoginPage {
	
	public LoginPage() {
		// This initElements method will create all WebElements
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	@FindBy(css = "#title")
	WebElement loginTitle;
	
	@FindBy(id = "userId")
	WebElement userID;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-btn")
	WebElement btnLogin;
	
	@FindBy(css = "#reminderModelTitle")
	WebElement loginReminderModeTitle;
	
	@FindBy(css = "#confirm-btn")
	WebElement btnConfirm;
	
	@FindBy(xpath = "//p[contains(text(),' We are having trouble ')]")
	WebElement loginError;
	
	@FindBy(id = "requestCode-btn")
	WebElement btnForgotPassword;
	
	@FindBy(id = "loginSolutionsTitle")
	WebElement forgotPasswordTitle;
	
	
	@FindBy(id = "reset-btn")
	WebElement btnReset;
	
	@FindBy(id = "userId-title")
	WebElement resetPasswordTitle;
	
	
	@FindBy(xpath = "//span[contains(text(),'SUBMIT')]")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//h2[contains(text(),'How do you want to reset your password?')]")
	WebElement resetPasswordMsg;
	
	@FindBy(css = "#userId")
	WebElement txtUserName;
	
	
	public void verifyLoginTitle() {
		
		Hooks.getWait().until(ExpectedConditions.visibilityOf(loginTitle));
		String actualLoginTitle = loginTitle.getText();
		Assert.assertEquals(Message.LOGIN_PAGE_TITLE, actualLoginTitle);
	}
	
	public void enterUserId(String userId) {
		userID.sendKeys(userId);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void submitLogin() {
		
		Hooks.getWait().until(ExpectedConditions.visibilityOf(btnLogin));
		btnLogin.click();
	}
	
	public void verifyLoginReminderModeTitle() {
		String actualLoginReminderTitle = loginReminderModeTitle.getText();
		Assert.assertEquals(Message.REMINDER_MODE_TITLE, actualLoginReminderTitle);
	}

	public void submitConfirm() {
		btnConfirm.click();
	}
	
	public void verifyLoginError() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(loginError));
		String actualLoginError = loginError.getText();
		Assert.assertEquals(Message.LOGIN_ERROR_MSG, actualLoginError);
	}
	
	public void verifyFailed() {
		String actualLoginError = loginError.getText();
		String Expected="Hello";
		Assert.assertEquals(Expected, actualLoginError);
	}
	
	public void selectForgotPassword() {
		btnForgotPassword.click();
	}
	
	public void selectResetPassword() {
		Hooks.getWait().until(ExpectedConditions.elementToBeClickable(forgotPasswordTitle));
		btnReset.click();
	}
		
	public void verifyForgotPasswordTitle() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(forgotPasswordTitle));
		String actualForgotPswdTitle = forgotPasswordTitle.getText();
		Assert.assertEquals(Message.FORGOT_PASSWORD_TITLE, actualForgotPswdTitle);
	}
	
	public void clickSubmit()  {
		Hooks.getWait().until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
	}
		
	public void verifyResetPasswordTitle() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(resetPasswordTitle));
		String actualResetPswdTitle =  resetPasswordTitle.getText();
		Assert.assertEquals(Message.RESET_PASSWORD_TITLE, actualResetPswdTitle);
		
	}
	
	public void verifyResetPasswordMessage() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(resetPasswordMsg));
		String actualResetPswdMsg =  resetPasswordMsg.getText();
		Assert.assertEquals(Message.RESET_PASSWORD_MESSAGE, actualResetPswdMsg);
		
	}
	
	public void enterUserName(String name) {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtUserName));
		txtUserName.sendKeys(name);
	}
	
	
}
