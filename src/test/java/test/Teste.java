package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CreateGmailAccountPage;
import pages.InitialGmailPage;
import utils.Generator;
import utils.PasswordGenerator;
import utils.Screenshot;
import utils.Settings;

public class Teste {

	private WebDriver driver = new ChromeDriver();

	private InitialGmailPage initialGmailPage;
	private CreateGmailAccountPage createGmailAccountPage;

	@Before
	public void initialize() {
		initialGmailPage = new InitialGmailPage(driver);
		createGmailAccountPage = new CreateGmailAccountPage(driver);
	}

	@Test
	public void teste() {
		driver.get(Settings.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		initialGmailPage.clickCreateAGmailAccountButton();
		initialGmailPage.changeToNewTab();

		createGmailAccountPage.setFirstName("Gabriel");
		createGmailAccountPage.setLastName("Souza");
		createGmailAccountPage.setUserName("gabriel.souza012982");
		String password = PasswordGenerator.generateRandomPassword();
		System.out.println(password);
		createGmailAccountPage.setPassword(password);
		createGmailAccountPage.setConfirmPassword(password);
		createGmailAccountPage.clickOnNextButton();

	}

	@After
	public void end() {
		String evidenceScreenshot = System.getProperty("user.dir") + "\\target\\relatorios\\evidencias\\imagens\\"
				+ Generator.dateAndHourForFile() + ".png";
		Screenshot.takeScreenshot(driver, evidenceScreenshot);
		// driver.quit();
	}

}
