package scenerios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\suman\\eclipse-workspace_3\\projectpoc2\\screeshots\\";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		File src=((TakesScreenshot)driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path+"screen1.jpg"));

	}

}