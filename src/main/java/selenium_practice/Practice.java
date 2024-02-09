package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		//WebElement text = driver.findElement(By.xpath("//h1[text()='Automation Testing Practice']")); 
		//System.out.println("the text on website is  "+text.isDisplayed());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("name")).sendKeys("pavani rudraraju");
		driver.findElement(By.id("email")).sendKeys("rudrarajupavani.marolix@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9959333337");
		driver.findElement(By.id("textarea")).sendKeys("hyderabad ,kphb colony");
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement( By.id("tuesday")).click();
		Select drpcountry=new Select(driver.findElement(By.id("country")));
		drpcountry.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//option[text()='Blue']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("09/02/2024");
		
}
}
