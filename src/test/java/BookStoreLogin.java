import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.BaseClass;

public class BookStoreLogin extends BaseClass {
	
 
 @BeforeSuite
 public void initiateBrowser() {
	 	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
 }
	
  @Test (priority = 0)
  public void loginFunction() {
		driver.findElement(By.id("userName")).sendKeys("rizwan964");
		driver.findElement(By.id("password")).sendKeys("password");
		System.out.println("Entering username and password");
  }
  
  @Test (priority = 1)
  public void clickLoginButton() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("javascript:window.scrollBy(0,350)");
	  driver.findElement(By.id("login")).click();
	  System.out.println("Click login button");
  }
  
  @Test (priority = 2)
  public void SeeHomePage() {
	  String homepage = driver.findElement(By.className("main-header")).getText();
	  System.out.println("Homepage is: " + homepage);
	  Assert.assertEquals(homepage, "Profile");
  }

  @AfterSuite
  public void closeBrowser() throws InterruptedException {
	    Thread.sleep(3000);
 	 	driver.close();
  }
}
