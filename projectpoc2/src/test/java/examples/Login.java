package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	/*
	 * verify login test with valid credentials
	 */
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// invoke application
		driver.get("https://parabank.parasoft.com");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.cssSelector("a[href='openaccount.htm']")).click();
		Select dd=new Select(driver.findElement(By.cssSelector("#type")));
		dd.selectByIndex(1);
		Thread.sleep(3000);
		dd.selectByValue("0");
		Thread.sleep(3000);
		dd.selectByVisibleText("SAVINGS");
		

		driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();

	}
}
