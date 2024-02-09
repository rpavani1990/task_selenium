package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	

	public static void main(String args[]  ) throws Throwable  {
		WebDriverManager.firefoxdriver().setup();


		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.xpath("//(text)='You Pressed the OK Button')")).click();
	Thread.sleep(3000)	;
Alert al = driver.switchTo().alert();
al.accept();
}
}