package MySeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sspat\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sspatil987@gmail.com");
        
        driver.findElement(By.id("pass")).sendKeys("Patil@78");
        
        driver.findElement(By.name("login")).click();
	}

}
