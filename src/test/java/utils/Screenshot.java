package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver, String arquivo) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(arquivo));
		} catch (Exception e) {
			System.out.println("An error has occurred when the file was moved to the folder: " + e.getMessage());
		}
	}

}
