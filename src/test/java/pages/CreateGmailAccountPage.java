package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Actions;

public class CreateGmailAccountPage extends BasePage {

	private Actions actions;
	
	private String accountFirstNameField = "firstName";
	private String accountLastNameField = "lastName";
	private String accountUserNameField = "username";
	private String accountPasswordField = "//*[@id=\"passwd\"]/div[1]/div/div[1]/input";
	private String accountConfirmPasswordField = "//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input";
	private String nextButton = "//*[@id=\"accountDetailsNext\"]/div/button";
	
	public CreateGmailAccountPage(WebDriver driver) {
		super(driver);
		actions = new Actions(driver);
	}
	
	public void setFirstName(String firstName) {
		actions.writeText(By.id(accountFirstNameField), firstName);
	}
	
	public void setLastName(String lastName) {
		actions.writeText(By.id(accountLastNameField), lastName);
	}
	
	public void setUserName(String userName) {
		actions.writeText(By.id(accountUserNameField), userName);
	}
	
	public void setPassword(String password) {
		actions.writeText(By.xpath(accountPasswordField), password);
	}
	
	public void setConfirmPassword(String confirmPassword) {
		actions.writeText(By.xpath(accountConfirmPasswordField), confirmPassword);
	}
	
	public void clickOnNextButton() {
		actions.clickButton(By.xpath(nextButton));
	}

}
