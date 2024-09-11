package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass01 {

	public static void main(String[] args) throws Exception  {

		String path = "C:/Users/suman/eclipse-workspace_3/projectpoc2/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hgg"))));
		List<WebElement> elements=driver.findElements(By.id(""));
		WebElement element2=driver.findElement(By.name(""));
		WebElement element3=driver.findElement(By.className(""));
		WebElement element4=driver.findElement(By.linkText(""));
		WebElement element5=driver.findElement(By.partialLinkText(""));
		WebElement element6=driver.findElement(By.tagName(""));
		WebElement element7=driver.findElement(By.xpath(""));
		WebElement element8=driver.findElement(By.cssSelector(""));
		
		
		driver.findElement(By.id("")).sendKeys("dbvjdgvjghdv");
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).click();
		Select dd=new Select(driver.findElement(By.id("")));
		dd.selectByIndex(1);
		dd.selectByValue("ALBANIA");
		dd.selectByVisibleText("ALGERIA");
		
		String text=driver.findElement(By.id("")).getText();
		String attr=driver.findElement(By.id("")).getAttribute("color");
		
		boolean res=driver.findElement(By.xpath("ghhhh")).isDisplayed();
		driver.findElement(By.xpath("ghhhh")).isEnabled();
		driver.findElement(By.xpath("ghhhh")).isSelected();
	
		driver.quit();


	}

}
