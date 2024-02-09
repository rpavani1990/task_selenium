package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	public static void main(String args[]  )throws Throwable  {
		WebDriverManager.chromedriver().setup();


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://trytestingthis.netlify.app/");
		WebElement text = driver.findElement(By.xpath("//h1['text()=Your Website to practice Automation Testing']")); 
		System.out.println("the text on website is displayed "+text.isDisplayed());
		
		driver.findElement(By.id("fname")).sendKeys("pavani");
		driver.findElement(By.id("lname")).sendKeys("rudraraju");
		// thread.sleer(3000);
		
			WebElement checkbox=driver.findElement(By.id("female"));
			checkbox.click();
			System.out.println(checkbox.isSelected());
			
	    List<WebElement> checks = driver.findElements(By.xpath("//input[@id='moption']"));
	for(WebElement options:checks) {
		options.click();
		
	//	WebElement Button=driver.findElement(By.id("favcolor"));
		//Button.click();
	//	System.out.println("button is "+ isenabled());
		
		driver.findElement(((By.name("message")) )).clear();
		driver.findElement(((By.name("message")) )).sendKeys( "is my selenium");
		
		WebElement button=driver.findElement(By.xpath("//button[text()=' Female']"));
		System.out.println("  verifing the submit" + button.isEnabled());
		driver.close();
	
	}
}

}

	

	
	
	

