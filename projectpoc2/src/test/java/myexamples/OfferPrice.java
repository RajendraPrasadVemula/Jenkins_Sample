package myexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OfferPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//img[@alt=\"ACs\"]")).click();
//		String discount = driver
//				.findElement(By.xpath("(//img[@class=\"s-image\"])[1]/../../../../..//span[text()='(37% off)']"))
//				.getText();
//		System.out.println(discount);
//		String discount1 = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[last()-2]/../../../..//..//span[text()=\"(38% off)\"]")).getText();
//		System.out.println(discount1);
		String deliverytime = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[last()-2]/../../../..//..//span[text()=\"Monday 2 September\"]")).getText();
		System.out.println(deliverytime);
		

	}

}
