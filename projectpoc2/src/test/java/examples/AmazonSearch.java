package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
//		driver.findElement(By.id("twotabsearchtextbox"))
//		.sendKeys("shoes");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		String price=driver.findElement(By.xpath("(//img[@class=\"s-image s-image-optimized-rendering\"])[1]/../../../../../..//span[@class=\"a-price-whole\"]")).getText();
//		System.out.println(price);
	}

}
