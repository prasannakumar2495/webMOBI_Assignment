package webMOBI_AssignmentCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FrstClass {
	WebDriver driver;
	@Test(priority=0)
	private void openBrowser() {
		 driver = new ChromeDriver();
		System.setProperty("webdriver.driver.chrome", ".//chromerdriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.webmobi.com/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	private void step1() {
		driver.findElement(By.xpath("//i[@class='fa fa-user-circle']")).click();
	}
	@Test(priority=2, groups= "lastmethod of FrstClass")
	private void step2() {
		//entering details in the email text field
		WebElement emailTextField=driver.findElement(By.xpath("//input[@name='identity']"));
		emailTextField.sendKeys("prasannakumar2461995@gmail.com");
		//entering the details in the password text field
		WebElement PWDTextfield = driver.findElement(By.xpath("//input[@name='credential']"));
		PWDTextfield.sendKeys("2495@Apple");
		//clicking on the 'submit' button 
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		//driver.quit();
	}

}
