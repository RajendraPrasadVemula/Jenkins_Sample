package myexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		Thread.sleep(2000);
		//Total number of links
		int linkcount = driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in google are : " + linkcount);
//		List<WebElement> count = driver.findElements(By.xpath("//a[starts-with(text(),'Selenium')]//ancestor::div[@id=\"center_col\"]//a[starts-with(text(),'Selenium')]"));
//		System.out.println("Total number of links starting with Selenium in google are : " + count.size());
	}
}
//a[starts-with(text(),'Selenium')]//ancestor::div[@id="center_col"]//a[starts-with(text(),'Selenium')]
//		//a[starts-with(text(),'Selenium')] --->All links starting with Selenium
//		
