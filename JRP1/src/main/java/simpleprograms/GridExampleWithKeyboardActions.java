package simpleprograms;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExampleWithKeyboardActions {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\rajen\\eclipse-workspace1\\JRP1\\target\\";
		String baseurl = "https://www.google.com/";
		String nodeurl = "http://localhost:4444/wd/hub";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.LINUX);
		capabilities.setBrowserName("firefox");
		@SuppressWarnings("deprecation")
		WebDriver driver = new RemoteWebDriver(new URL(nodeurl), capabilities);
		driver.get(baseurl);
		Actions actions = new Actions(driver);
		actions.sendKeys(driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")),"selenium").perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("//div[text()=\"All\"]")).isDisplayed();
		if (res) {
			System.out.println("Pass:" + "Search is successful");
		} else {
			System.out.println("Fail:" + "Search is not successful");
		}
		Thread.sleep(3000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path + "\\screen1.jpg"));
		Thread.sleep(5000);
		driver.quit();

	}

}
