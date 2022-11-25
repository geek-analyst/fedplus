package fed.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import fed.automation.constants.Message;
import fed.automation.stepdefinitions.Hooks;

public class OpenAccountPage {

	public OpenAccountPage() {
		// This initElements method will create all WebElements
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Open an account')])[1]")
	WebElement btnOpenAccnt;

	@FindBy(xpath = "//h1[contains(text(),'Welcome to FedEx')]")
	WebElement txtOpenAccntMessage;

	public void openAccountButton() {
		btnOpenAccnt.click();
	}

	public void verifyOpenAccountMessage() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtOpenAccntMessage));
		String openAccntActualMsg = txtOpenAccntMessage.getText();
		Assert.assertEquals(openAccntActualMsg, Message.OPEN_ACCOUNT_EXPECTED_MSG);
	}

}
