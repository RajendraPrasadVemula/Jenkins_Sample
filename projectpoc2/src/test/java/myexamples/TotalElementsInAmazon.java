package myexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalElementsInAmazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String text = driver.findElement(By.xpath("//span[text()=\"No cost EMI up to 24 months | Starting ₹4,433 INR/month*\"]")).getText();
		System.out.println("The heading is:: " + text);
		List<WebElement> list = driver.findElements(
				By.xpath("//span[text()='No cost EMI up to 24 months | Starting ₹4,433 INR/month*']/../../..//img"));
		System.out.println("Total Number of elelments are:: "+list.size());

	}

}
