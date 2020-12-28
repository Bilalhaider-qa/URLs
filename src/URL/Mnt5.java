package URL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mnt5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        WebDriver driver = null;
        
		

     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");  
     driver = new FirefoxDriver();
     driver.get("https://beta.mont5.com/nanga-parbat-fur-collar-jacket");
     driver.manage().window().maximize();
     Thread.sleep(5000);
     System.out.println("Page Open");
      driver.findElement(By.xpath("/html/body/main/div/section/div[2]/div/div[3]/div[2]/div/div/div[3]/form/div[1]/div/div[1]/div[3]/div[1]")).click();
      System.out.println("Size tab clicked");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"small\"]")).click();
      System.out.println("Size selected");
      
      WebDriverWait wait = new WebDriverWait(driver, 10);
      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
      
    
  
      
      WebElement  element=driver.findElement(By.id("product-addtocart-button"));  
      JavascriptExecutor ex=(JavascriptExecutor)driver;
      ex.executeScript("arguments[0].click()", element);
      
      System.out.println("Added to cart");
      Thread.sleep(5000);
      
      WebElement  checkout=driver.findElement(By.id("top-cart-btn-checkout"));  
      JavascriptExecutor ex1=(JavascriptExecutor)driver;
      ex1.executeScript("arguments[0].click()", checkout);
      
      System.out.println("Redirected to checkout");
      Thread.sleep(20000);
      
      driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("bilal.haider1@discretelogix.com");
      System.out.println("Email Entered");
      Thread.sleep(5000);
      
      driver.findElement(By.name("firstname")).sendKeys("Test");
      System.out.println("First Name Entered");
      
      driver.findElement(By.name("lastname")).sendKeys("User");
      System.out.println("Last name Entered");
      
      driver.findElement(By.name("street[0]")).sendKeys("25 Wagon Street Wasaila");
      System.out.println("Street Entered");
      
      driver.findElement(By.name("city")).sendKeys("Alaska");
      System.out.println("City Entered");
      
      driver.findElement(By.name("postcode")).sendKeys("99654");
      System.out.println("Zip COde Entered");
      
      Select drpstate = new Select(driver.findElement(By.name("region_id")));
      drpstate.selectByVisibleText("Alaska");
      System.out.println("State Selected");
      
      driver.findElement(By.name("telephone")).sendKeys("+1-541-754-3010");
      System.out.println("Phone Number Entered");
      
      driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
      System.out.println("Clicked on Next Button from Checkout");
      Thread.sleep(5000);
      
     driver.findElement(By.name("payment[method]")).click();
     System.out.println("Payment method selected");
     Thread.sleep(5000);
     
     driver.switchTo().frame(driver.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]")));
     driver.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[2]")).click();
    // WebElement  paypal=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]"));  
   //  JavascriptExecutor ex2=(JavascriptExecutor)driver;
   //  ex2.executeScript("arguments[0].click()", paypal);
     System.out.println("Paypal selected");
      

	}

}
