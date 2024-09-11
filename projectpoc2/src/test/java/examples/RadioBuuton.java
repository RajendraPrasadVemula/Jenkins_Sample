package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBuuton {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > div > div:nth-child(2) > span > div > div.header-text"));
		((Locatable)ele).getCoordinates().inViewPort();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label")).click();
		Thread.sleep(3000);
		boolean res=driver.findElement(By.xpath("//*[@id=\"impressiveRadio\"]")).isSelected();
		System.out.println(res);

	}

}
