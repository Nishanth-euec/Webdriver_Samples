package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
  public void f() {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://the-internet.herokuapp.com/login");
    	WebElement name=driver.findElement(By.id("username"));
    	WebElement password=driver.findElement(By.name("password"));
    	name.sendKeys("tomsmith");
    	password.sendKeys("SuperSecretPassword!");
    	WebElement login_btn=driver.findElement(By.tagName("button"));
    	login_btn.click();
    	driver.quit();
    	
  }
  
  
}
