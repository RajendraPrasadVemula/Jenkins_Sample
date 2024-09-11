package myexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindSelenium {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		Thread.sleep(2000);
		String s1 = driver.findElement(By.xpath("//*[text()=\"Selenium\"]")).getText();
		System.out.println(s1);
		List<WebElement> list2 = driver.findElements(By.xpath("//*[text()=\"Selenium\"]//ancestor::div[@id=\"main\"]//*[text()=\"Selenium\"]"));
//		List<WebElement> list1 = driver.findElements(By.xpath("//*[text()=\"Selenium\"]/../../../../../../../../../../../../../../../../../../../../../../../../../../..//*[text()=\"Selenium\"]"));
		System.out.println(list2.size());
		/*Find Total Number of links 
		//List<WebElement> list = driver.findElements(By.xpath("//a//ancestor::div[@id=\"cnt\"]//a"));
		List<WebElement> list = driver.findElements(By.xpath("//a/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../..//a"));
		System.out.println("Total Number of Anchor Tags are :: " +list.size());*/
	}
}


