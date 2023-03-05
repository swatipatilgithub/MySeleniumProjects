package MySeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_Program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sspat\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/test/newtours");
        driver.manage().window().maximize();
        
//TextBox
   /*   WebElement emailid = driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
        emailid.sendKeys("sspatil820@gmail.com");
        
        WebElement submit = driver.findElement(By.xpath("//radio[@name=\"btnlogin\"]"));
        emailid.sendKeys();                    */
        
        WebElement Register = driver.findElement(By.xpath("//a[@href=\"register.php\"]"));
        Register.click();
        
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("Swati");
        
        WebElement lastname = driver.findElement(By.name("lastName"));
        firstname.sendKeys("Patil");
        
        WebElement phone = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
        phone.sendKeys("9874563217");
        
        WebElement Email = driver.findElement(By.id("userName"));
        Email.sendKeys("sspatil820@gmail.com");
        
        WebElement Address = driver.findElement(By.xpath("//input[@name='address1']"));
        Email.sendKeys("Pune");
        
//By cssSelector
        WebElement Username = driver.findElement(By.cssSelector("input[id='email']"));
        Username.sendKeys("Swati");
        
//Dropdown
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        Select Country = new Select (country);
        Country.selectByValue("INDIA");
        
//Radiobutton
        driver.findElement(By.name("submit")).click();
        
	}

}
