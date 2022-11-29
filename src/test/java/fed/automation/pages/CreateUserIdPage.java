package fed.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import fed.automation.constants.Message;
import fed.automation.stepdefinitions.Hooks;
import io.cucumber.datatable.DataTable;

public class CreateUserIdPage {

	public CreateUserIdPage() {
		// This initElements method will create all WebElements
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(xpath = "//font[contains(text(),'fedex.com Login Registration')]")
	WebElement loginRegistrationTitle;

	@FindBy(id = "uid")
	WebElement txtCreateUserId;

	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(id = "retypePassword")
	WebElement txtRetypePassword;

	@FindBy(id = "reminderQuestion")
	WebElement drpSecretQuestion;

	@FindBy(id = "reminderAnswer")
	WebElement txtSecretAnswer;

	@FindBy(id = "firstName")
	WebElement txtFirstName;

	@FindBy(id = "lastName")
	WebElement txtLastName;

	@FindBy(id = "zip")
	WebElement txtZip;

	@FindBy(id = "address1")
	WebElement txtAddress1;

	@FindBy(id = "city")
	WebElement txtCity;

	@FindBy(id = "state")
	WebElement txtState;

	@FindBy(id = "email")
	WebElement txtEmail;

	@FindBy(id = "retypeEmail")
	WebElement txtReTypeEmail;

	@FindBy(id = "phone")
	WebElement txtPhone;

	@FindBy(id = "iacceptbutton")
	WebElement btnIAccept;

	@FindBy(xpath = "//td[contains(text(),'This fedex.com service requires a nine-digit FedEx')]")
	WebElement txtContactInfo;

	public void verifyLoginRegistrationTitle() {
		String actualRegistrationTitle = loginRegistrationTitle.getText();
		Assert.assertEquals(Message.LOGIN_REGISTRATION_PAGE_TITLE, actualRegistrationTitle);
	}

	public void enterLoginInformation(DataTable loginData) {

		List<List<String>> obj = loginData.asLists(String.class);
		txtCreateUserId.sendKeys(obj.get(0).get(0));
		txtPassword.sendKeys(obj.get(0).get(1));
		txtRetypePassword.sendKeys(obj.get(0).get(2));
	}

	public void selectSecretQuestion() {

		Select secretQues = new Select(drpSecretQuestion);
		secretQues.selectByIndex(2);
	}

	public void enterSecretAnswer() {

		txtSecretAnswer.sendKeys(Message.SECRET_ANSWER);
	}

	public void enterContactInformation(DataTable contactData) {
		List<List<String>> obj = contactData.asLists(String.class);

		txtFirstName.sendKeys(obj.get(0).get(0));
		txtLastName.sendKeys(obj.get(0).get(1));
		txtZip.sendKeys(obj.get(0).get(2));
		txtAddress1.sendKeys(obj.get(0).get(3));
		txtCity.sendKeys(obj.get(0).get(4));
		txtState.sendKeys(obj.get(0).get(5));
		txtEmail.sendKeys(obj.get(0).get(6));
		txtReTypeEmail.sendKeys(obj.get(0).get(7));
		txtPhone.sendKeys(obj.get(0).get(8));
	}

	public void submitIAccept() {
		btnIAccept.click();
	}

	public void verifyContactInfoTitle() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtContactInfo));
		String actualContactInfo = txtContactInfo.getText();
		Assert.assertEquals(Message.LOGIN_CONTACTT_INFO_TITLE, actualContactInfo);
	}

}
