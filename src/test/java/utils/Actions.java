package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {
	
private WebDriver driver;
	
	public Actions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void findElementBy(By by) {
		driver.findElement(by);
	}
	
	public List<WebElement> findElementsBy(By by) {
		return driver.findElements(by);
	}
	
	public String getTextMessage(By by) {
		return driver.findElement(by).getText();
	}
	
	public void clickButton(By by) {
		driver.findElement(by).click();
	}
	
	public void writeText(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}
	
	public void changeTab(int tabIndex) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabIndex));
	}


}
