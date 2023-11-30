package trainingSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traning1 {

	public static void main(String[] args) {
		
		//  WebDriver driver = new FirefoxDriver();
		  ChromeOptions options = new ChromeOptions();
	
		  WebDriver driver = new ChromeDriver(options);
				  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https:\\www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		

	}

}
