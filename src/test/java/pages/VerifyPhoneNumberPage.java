package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Actions;

public class VerifyPhoneNumberPage extends BasePage {
	
	private Actions actions;
	private String verifyPhoneNumberText = "//*[@id=\"headingText\"]/span";

	public VerifyPhoneNumberPage(WebDriver driver) {
		super(driver);
		actions = new Actions(driver);
	}
	
	public String getVerifyPhoneNumberText() {
		return actions.getTextMessage(By.xpath(verifyPhoneNumberText));
	}

}
