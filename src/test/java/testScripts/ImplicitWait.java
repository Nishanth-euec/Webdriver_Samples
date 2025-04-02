package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait {
  @Test
  public void f() {
	  
	 
	  WebDriver driver=new ChromeDriver();
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	  
	  
	  driver.get("http://www.uitestingplayground.com/ajax");
	  driver.manage().window().maximize();
	  driver.findElement(By.cssSelector(".btn-primary")).click();
	  
	  
	  WebElement msg=driver.findElement(By.cssSelector(".bg-success"));
	  wait.until(ExpectedConditions.visibilityOf(msg));
	  String text=msg.getText();
	  System.out.println(text);
  }
}
