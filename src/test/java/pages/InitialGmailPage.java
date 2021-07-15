package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Actions;

public class InitialGmailPage extends BasePage {
	
	private Actions actions;
	
	private String createEmailButton = "/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[3]/a[1]";

	public InitialGmailPage(WebDriver driver) {
		super(driver);
		actions = new Actions(driver);
	}
	
	public void clickCreateAGmailAccountButton() {
		actions.clickButton(By.xpath(createEmailButton));
	}
	
	public void changeToNewTab() {
		actions.changeTab(1);
	}

}
