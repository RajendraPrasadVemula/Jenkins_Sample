package myexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindShoesPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=shoes&s=price-asc-rank&crid=84Y0DQHEGGY7&qid=1724528744&sprefix=%2Caps%2C211&ref=sr_st_price-asc-rank&ds=v1%3AVJ5EeI5rPe2vTTPPvxiR%2FEWX%2FNUHI0P1iD%2BRmn0535c");
		String price = driver
				.findElement(
						By.xpath("(//img[@class=\"s-image\"])[last()]/../../../../../..//span[@class=\"a-price-whole\"]"))
				.getText();
		System.out.println("The shoe with highest price is: " + price);		

		
//		List<WebElement> list1 = driver.findElements(By.xpath("(//h2[@class=\"a-color-base headline truncate-2line\"])[1]/../.."));
//		System.out.println("Total no of elements are: " +list1.size());
					
//		driver.findElement(By.xpath("//h2[text()='Revamp your home in style']/../..//img[@alt=\"Home storage\"]")).click();
//		String text = driver.findElement(By.xpath("//b[text()=\"Buy Home Storage and Organisation Products at Amazon India\"]")).getText();
//		System.out.println("User is in Buy Home Storage Page :: " +text);
		
//		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
//		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
//		String res = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]/../../../../../..//span[@class=\"a-price-whole\"]")).getText();
//		System.out.println("The shoe price is : " +res);
//		List<WebElement> list = driver.findElements(By.xpath("//h2[text()='Results']/../../../../../..")); 
//		System.out.println("The total no of shoes are: " +list.size());
		
	}

}
