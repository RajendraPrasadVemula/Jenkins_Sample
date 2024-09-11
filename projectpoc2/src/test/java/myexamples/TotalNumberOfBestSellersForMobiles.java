package myexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalNumberOfBestSellersForMobiles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		/*Total no of Best Sellers for Mobiles on Amazon 
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		String name = driver.findElement(By.xpath("//span[text()='Best seller']")).getText();
		//String name= driver.findElement(By.xpath("//span[text()=\"Best seller\"]")).getText();
		System.out.println("The heading is::" +name);
		List<WebElement> count = driver.findElements(By.xpath("//span[text()='Best seller']/ancestor::div[@class=\"puisg-row\"]//span[@class=\"a-badge-text\"]"));
		//List<WebElement> count = driver.findElements(By.xpath("//span[text()=\"Best seller\"]/../../../../../../../../../../..//span[@class=\"a-badge-text\"]"));
		System.out.println(count.size());*/
		/*Best Seller Name and Price for Mobiles on Amazon
		String name = driver.findElement(By.xpath("//span[text()=\"Best seller\"]/../../../../../../../../../../..//span[text()=\"Redmi 13C 5G (Startrail Silver, 4GB RAM, 128GB Storage) | MediaTek Dimensity 6100+ 5G | 90Hz Display\"]")).getText();
		System.out.println("The Best Seller Mobile Name is:: " +name);
		String price = driver.findElement(By.xpath("//span[text()=\"Best seller\"]/../../../../../../../../../../..//span[@class=\"a-price-whole\"]")).getText();
		System.out.println("The best seller mobile price is:: " +price);*/
		//Total no of Best Sellers for Rings on Amazon
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		String name1 = driver.findElement(By.xpath("(//span[text()=\"Best seller\"])[position()=1]")).getText();
		System.out.println(name1);
		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Best seller']/ancestor::div[@class=\"a-section a-spacing-base a-text-center\"]"));
				//(By.xpath("(//span[text()='Best seller'])[1]/../../../../../../../../../../../../../..//span[text()='Best seller']"));
				//(By.xpath("//span[text()=\"Best seller\"]/../../../../../../../../../.."));
		System.out.println("The Total Number Of Best Sellers for Rings are :: " +elements.size());	
	}

}
