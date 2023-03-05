package MySeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Amazon_Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sspat\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
 /*     WebElement Signup = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Signup.click();
        
        WebElement New = driver.findElement(By.id("createAccountSubmit"));
        New.click();
        
        WebElement Name = driver.findElement(By.name("customerName"));
        Name.sendKeys("Swati Patil");
        
    /*  WebElement countrycode = driver.findElement(By.xpath("//select[@name='countryCode']"));
        Select Countrycode = new Select (countrycode);
        Countrycode.selectByValue("IN +91");         */
        
  /*    WebElement Mobile = driver.findElement(By.id("ap_phone_number"));
        Mobile.sendKeys("9874563217");
        
        WebElement Email = driver.findElement(By.name("secondaryLoginClaim"));
        Email.sendKeys("sspatil820@gmail.com");
        
        WebElement Password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
        Password.sendKeys("Tmkoc123");
        
        driver.findElement(By.id("continue")).click();            */
        
        WebElement Mobile = driver.findElement(By.xpath("//a[@href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]"));
        Mobile.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mi");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        //driver.close();
	}

}
