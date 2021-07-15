package stepsdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateGmailAccountPage;
import pages.InitialGmailPage;
import pages.VerifyPhoneNumberPage;
import utils.Generator;
import utils.Screenshot;
import utils.Settings;

public class CreateEmailStepDefinition {
	
	private WebDriver driver = new ChromeDriver();

	private InitialGmailPage initialGmailPage;
	private CreateGmailAccountPage createGmailAccountPage;
	private VerifyPhoneNumberPage verifyPhoneNumberPage;
	
	@Before
	public void initialize() {
		initialGmailPage = new InitialGmailPage(driver);
		createGmailAccountPage = new CreateGmailAccountPage(driver);
		verifyPhoneNumberPage = new VerifyPhoneNumberPage(driver);
	}
	
	@Given("^I am in the create email page$")
	public CreateGmailAccountPage goToCreateEmailWebPage() {
		
		driver.get(Settings.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		initialGmailPage.clickCreateAGmailAccountButton();
		initialGmailPage.changeToNewTab();
		
		return createGmailAccountPage;
	}
	
	@And("^i input the firstname ([^\"]*)$")
	public void insertTheFirstName(String firstName) {
		createGmailAccountPage.setFirstName(firstName);
	}
	
	@And("^input the lastname ([^\"]*)$")
	public void insertTheLastName(String lastName) {
		createGmailAccountPage.setLastName(lastName);
	}
	
	@And("^input the username ([^\"]*)$")
	public void insertTheUsername(String username) {
		createGmailAccountPage.setUserName(username);
	}
	
	@And("^input the password ([^\"]*)$")
	public void insertThePassword(String password) {
		createGmailAccountPage.setPassword(password);
	}
	
	@And("^input the confirmedpassword ([^\"]*)$")
	public void insertTheConfirmedPassword(String confirmedPassword) {
		createGmailAccountPage.setConfirmPassword(confirmedPassword);
	}
	
	@When("^I click in the next button$")
	public VerifyPhoneNumberPage clickOnTheNextButton() throws InterruptedException {
		createGmailAccountPage.clickOnNextButton();
		Thread.sleep(2000);
		return verifyPhoneNumberPage;
	}
	
	@Then("^I must be redirected to phone number authentication page$")
	public void goToVerifyPhoneNumberPage() {
		String message = verifyPhoneNumberPage.getVerifyPhoneNumberText();
		Assert.assertEquals("Verifique seu número de telefone", message);
	}
	
	@After
	public void end() {
		String evidenceScreenshot = System.getProperty("user.dir") + "\\target\\relatorios\\evidencias\\imagens\\"
				+ Generator.dateAndHourForFile() + ".png";
		Screenshot.takeScreenshot(driver, evidenceScreenshot);
		driver.quit();
	}

}
