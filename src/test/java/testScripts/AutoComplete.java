package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoComplete {
  @Test
  public void f() throws InterruptedException {
  
	 
	 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/autocomplete/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  WebElement frame1=driver.findElement(By.cssSelector(".demo-list"));
	  driver.switchTo().frame(frame1);
	  WebElement tag= driver.findElement(By.xpath("//input[@id='tags']"));
	  tag.sendKeys("basic");
	 // driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("Basic");
	  List<WebElement> dropdown=driver.findElements(By.cssSelector("ul[id='ui-id-1']"));
	  for(WebElement element : dropdown) {
		if(element.getText().equalsIgnoreCase("Basic")) {
			element.click();
			break;
		}
	  }
	  driver.quit();
	  
  }
}
