package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	WebDriver driver=new ChromeDriver();
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

	@BeforeTest
	public void start() {
	
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		  driver.manage().window().maximize();
	}
	
	
  @Test
  public void AddToCart() throws InterruptedException {
	  
	  WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']"));
	  search.sendKeys("tomato");
	  WebElement search_btn=driver.findElement(By.xpath("//button[@type='submit']"));
	  search_btn.click();
	  Thread.sleep(2000);
	  WebElement addtocart=driver.findElement(By.cssSelector("div[class='product-action'] button[type='button']"));
	  addtocart.click();
	  
	  
  }
  
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }
  
}
