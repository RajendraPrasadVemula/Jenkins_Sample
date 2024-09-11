package scenerios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Exception  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		boolean res;
		try {
		res= driver.findElement(By.xpath("//*[text()='Request OTP']")).isDisplayed();
		}catch (Exception e) {
			res=false;
		}
		Thread.sleep(5000);
		if(res)
		{
			driver.navigate().refresh();
		}else {
			System.out.println("skiping refresh");
		}
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]/../..//img"));
		action.moveToElement(element).perform();
		action.click(element).perform();
		action.contextClick(element).perform();
		action.clickAndHold(element)
		.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id("")))
		.build().perform();
		

	}

}
