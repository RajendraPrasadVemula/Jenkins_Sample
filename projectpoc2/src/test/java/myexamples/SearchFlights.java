package myexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlights {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")).sendKeys("hyd");
		Select s = new Select(driver.findElement(By.xpath("//p[text()=\"Hyderabad, IN - Rajiv Gandhi International (HYD)\"]")));
		s.selectByIndex(0);
		//driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")));
		
		

	}

}
