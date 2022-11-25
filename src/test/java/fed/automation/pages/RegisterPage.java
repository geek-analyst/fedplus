package fed.automation.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fed.automation.constants.Message;
import fed.automation.stepdefinitions.Hooks;
import io.cucumber.datatable.DataTable;

public class RegisterPage {

	public WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(10));

	public RegisterPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(id = "first-name")
	WebElement txtFirstName;

	@FindBy(id = "last-name")
	WebElement txtLastName;

	@FindBy(id = "country")
	WebElement optCountry;

	@FindBy(id = "address")
	WebElement txtAddress;

	@FindBy(xpath = "//div[@class='pac-container pac-logo hdpi']/div[1]")
	WebElement selectAddress;

	@FindBy(id = "phone")
	WebElement txtPhone;

	@FindBy(id = "email")
	WebElement txtEmail;

	@FindBy(xpath = "//*[@data-test-id='contactFormSubmitButton']")
	WebElement btnLoginDetails;

	@FindBy(className = "subheading")
	WebElement txtLoginMessage;

	@FindBy(id = "password")
	WebElement txtPwd;

	@FindBy(id = "confirmPassword")
	WebElement txtConfirmPwd;

	@FindBy(css = "#PP_AND_TAC-label")
	WebElement chkOne;

	@FindBy(css = "#MARKETING_EMAILS-label")
	WebElement chkTwo;

	@FindBy(xpath = "//button[contains(text(),'Create my User ID')]")
	WebElement btnCreateUserId;

	@FindBy(xpath = "//label[contains(text(),'Create my own User ID')]")
	WebElement rdbtnCreateOwnUserId;

	@FindBy(id = "userId")
	WebElement txtUserID;

	@FindBy(tagName = "h1")
	WebElement txtCreateAcc;

	public void enterFirstName(String frstName) {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtFirstName));
		txtFirstName.sendKeys(frstName);
	}

	public void enterLastName(String lstName) {
		txtLastName.sendKeys(lstName);
	}

	public void enterAddress(String address) {
		txtAddress.sendKeys(address);
	}

	public void selectFirstAddressOption() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(selectAddress));
		selectAddress.click();
	}

	public void enterPhoneNumber(String phn) {
		txtPhone.sendKeys(phn);
	}

	public void enterEmailID(String emailId) {
		txtEmail.sendKeys(emailId);
	}

	public void submitEnterLoginDetails() {

		Hooks.getWait().until(ExpectedConditions.visibilityOf(btnLoginDetails));
		btnLoginDetails.click();
	}

	public void verifyLoginPageMessage() {

		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtLoginMessage));
		String loginActualMsg = txtLoginMessage.getText();
		String loginExpctdMsg = "Next up, create your FedEx user ID";
		Assert.assertEquals(loginExpctdMsg, loginActualMsg);
	}

	public void enterPass(DataTable data) {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtPwd));
		List<List<String>> obj = data.asLists();
		txtPwd.sendKeys(obj.get(0).get(0));
		txtConfirmPwd.sendKeys(obj.get(0).get(1));
	}

	public void checkfirst() {
		chkOne.click();
	}

	public void checkTwo() {
		chkTwo.click();
	}

	public void enterCreateUserID() {
		btnCreateUserId.click();
	}

	public void checkUserIDButton() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(rdbtnCreateOwnUserId));
		rdbtnCreateOwnUserId.click();
	}

	public void enterUserID() {
		txtUserID.sendKeys("testnew123");
	}

	public void verifyCreateAccountScreenMessage() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtCreateAcc));
		String createAccountActualMsg = txtCreateAcc.getText();
		Assert.assertEquals(Message.CREATE_ACCOUNT_EXPECTED_MSG, createAccountActualMsg);
	}

}
