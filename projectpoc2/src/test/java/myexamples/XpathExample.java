package myexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		//Xpath to find an element using attribute
//		driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")).sendKeys("hyd");
		//Xpath to find an element using exact text
//		String res = driver.findElement(By.xpath("//h1[text()='Search flights']")).getText();
//		System.out.println("The text is: " +res);
		//Xpath to find an element that starts with a specific text
		String res1 = driver.findElement(By.xpath("//*[starts-with(text(),'Search')]")).getText();
		System.out.println("The text is: " +res1);
	}

}
