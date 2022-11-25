package fed.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import fed.automation.constants.Message;
import fed.automation.stepdefinitions.Hooks;

public class FedExHomePage {

	public FedExHomePage() {
		// This initElements method will create all WebElements
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(xpath = "//h4[contains(text(),'Netherlands')]/following-sibling::ul/li[2]")
	WebElement languageOpt;

	@FindBy(xpath = "//button[contains(text(),'ACCEPT ALL COOKIES')]")
	WebElement allCookies;

	@FindBy(id = "cubeTwoPar")
	WebElement eleTrackIcon;

	@FindBy(name = "trackingnumber")
	WebElement eleTrackId;

	@FindBy(id = "btnSingleTrack")
	WebElement btnTrack;

	@FindBy(xpath = "//div[@class='wtrk-wrapper']//div[@class='track-shared-wrapper']//div/div[2]")
	WebElement alertMsg;

	@FindBy(id = "fxg-dropdown-signIn")
	WebElement lnkSignUp;

	@FindBy(partialLinkText = "OPEN AN")
	WebElement lnkOpenAccount;

	@FindBy(partialLinkText = "CREATE USER ID")
	WebElement lnkCreateUserID;

	@FindBy(id = "cubeOnePar")
	WebElement eleRateTransitTimeIcon;

	@FindBy(id = "magr-heading")
	WebElement txtVerifyRateMsg;

	@FindBy(id = "fromAddressField")
	WebElement fromLocation;

	@FindBy(id = "toAddressField")
	WebElement toLocation;

	@FindBy(partialLinkText = "LOG")
	WebElement lnkLogin;

	public void selectLanguage() {
		languageOpt.click();

	}

	public void selectAllCookies() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(allCookies));
		allCookies.click();
	}

	public void selectTrackIcon() {
		eleTrackIcon.click();
	}

	public void enterTrackId(String trckId) {
		eleTrackId.sendKeys(trckId);
	}

	public void submitTrackId() {
		Hooks.getWait().until(ExpectedConditions.elementToBeClickable(btnTrack));
		btnTrack.click();

	}

	public void verifyTrackAlertMessage() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(alertMsg));
		String trackAlertActualMsg = alertMsg.getText();
		Assert.assertEquals(trackAlertActualMsg, Message.TRACK_ALERT_EXPECTED_MSG);
	}

	public void selectSignUp() {
		lnkSignUp.click();
	}

	public void selectOpenAccountOption() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(lnkOpenAccount));
		lnkOpenAccount.click();
	}

	public void selectCreateUserIdOption() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(lnkCreateUserID));
		lnkCreateUserID.click();
	}

	public void selectRateTransitTimeIcon() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(eleRateTransitTimeIcon));
		eleRateTransitTimeIcon.click();

	}

	public void verifyCalculateRateMessage() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(txtVerifyRateMsg));
		String verifyActualRateMsg = txtVerifyRateMsg.getText();
		Assert.assertEquals(verifyActualRateMsg, Message.VERIFY_EXPECTED_RATE_MSG);
	}

	public void selectFromLocation(String loc) {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(fromLocation));
		fromLocation.sendKeys(loc);
	}

	public void selectToLocation(String loc) {
		toLocation.sendKeys(loc);
	}

	public void selectLoginOption() {
		Hooks.getWait().until(ExpectedConditions.visibilityOf(lnkLogin));
		lnkLogin.click();
	}

}
