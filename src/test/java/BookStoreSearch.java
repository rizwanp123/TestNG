import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.BaseClass;

public class BookStoreSearch extends BaseClass {
	
	 @BeforeSuite
	 public void initiateBrowser() {
		 	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/login");
			driver.manage().window().maximize();
	 }
	 
  @Test
  public void f() {
	  driver.navigate().to("https://demoqa.com/books");
	  driver.findElement(By.id("searchBox")).sendKeys("Learning",Keys.ENTER);
  }
  
  @Test
  public void clickSearch() {
	  //driver.findElement(By.className("input-group-append")).click();
  }
  
  @AfterSuite
  public void closeBrowser() throws InterruptedException {
	    Thread.sleep(3000);
 	 	driver.close();
  }
}
