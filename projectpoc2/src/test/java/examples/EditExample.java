package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditExample {

	/*
	 * verify login test with valid credentials
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("124.0.123").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// invoke application
		driver.get("https://www.saucedemo.com/");
		// verify login page
		boolean res1 = driver.findElement(By.className("login_logo")).isDisplayed();
		if (res1) {
			// positive
			System.out.println("PASS : User is in login page");
		} else {
			// negative
			System.out.println("FAIL : User is not in login page");
		}
		// enter userid
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// enter pswd
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// click on submit
		driver.findElement(By.id("login-button")).click();
		// verify login is success full
		boolean res2 = driver.findElement(By.className("title")).isDisplayed();
		if (res2) {
			// positive
			System.out.println("PASS : User is logged in successfully");
		} else {
			// negative
			System.out.println("FAIL : User User is logged in not successfully");
		}
		driver.quit();
	}
}
