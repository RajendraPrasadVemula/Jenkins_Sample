package myexamples;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookFlight {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("shoes");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//*[@class='_bGlmZ_lifestyleImage_3B0SG']")).click();
	driver.findElement(By.xpath("(//*[@aria-label='Impakto Barefoot Shoe for Men'])[position()=1]"));
	String res = driver.findElement(By.xpath("(//*[contains(text(),'795')])[position()=1]")).getText();
	System.out.println("The price is: " +res);
	//driver.findElement(By.xpath("//*[@placeholder='Where from?']")).sendKeys("hyd");
		//driver.findElement(By.xpath("(//*[text()='Book'])[last()]")).click();
		
	}

}
