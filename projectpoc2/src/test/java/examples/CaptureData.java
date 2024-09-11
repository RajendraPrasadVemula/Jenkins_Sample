package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String text=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/div/label")).getText();
		System.out.println(text);
		String attr=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/div/label")).getAttribute("class");
		System.out.println(attr);
		boolean res=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).isDisplayed();
		System.out.println(res);
		boolean res1=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).isEnabled();
		System.out.println(res1);
	}

}
