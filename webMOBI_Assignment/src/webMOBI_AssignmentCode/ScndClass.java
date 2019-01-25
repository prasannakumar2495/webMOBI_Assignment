package webMOBI_AssignmentCode;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScndClass extends FrstClass {

	@Test(priority = 3)
	private void step3() throws InterruptedException {
		// initializing the parent class
		FrstClass fc = new FrstClass();
		// clicking on the 'create new event' button.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn create']")).click();
	}

	@Test(priority = 4)
	private void step4() throws InterruptedException {
		Thread.sleep(3000);
		// selecting the single event
		driver.findElement(By.xpath("//div[@class='col-sm-6 eventbox1']/div/a")).click();
	}

	@Test(priority = 5)
	private void step5() throws InterruptedException {
		// selecting any of the event type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='personal']")).click();
	}

	@Test(priority = 6)
	private void step6() {

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/prasannakumaranisetti/Movies/GIT/webMOBI_Assignment/webMOBI_Assignment/src/webMOBI_AssignmentCode/Input.properties");
			prop.load(fis);
			Thread.sleep(3000);
			// entering the details in the required fields
			WebElement TitleOfEvent = driver.findElement(By.xpath("//input[@id='title']"));
			TitleOfEvent.sendKeys(prop.getProperty("TitleOfEvent"));
			WebElement Description = driver.findElement(By.xpath("//div[@id=\"cke_3_contents\"]/iframe"));
			Description.sendKeys(prop.getProperty("Discription"));
			WebElement EventName = driver.findElement(By.xpath("//input[@id='appurl']"));
			EventName.sendKeys(prop.getProperty("EventName"));
			WebElement CompanyName = driver.findElement(By.xpath("//input[@id='org_by']"));
			CompanyName.sendKeys("webMOBI");
			WebElement OrgWebsite = driver.findElement(By.xpath("//input[@id='org_website']"));
			OrgWebsite.sendKeys("https://www.webmobi.com/");
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			// jse.executeScript("document.getElementById('datepicker_st').removeAttribute('readonly',0);");
			WebElement StrtDate = driver.findElement(By.xpath("//input[@id='datepicker_st']"));
			StrtDate.click();
			// Thread.sleep(5000);
			WebElement datePck = driver.findElement(By.xpath("/html/body/div[14]/div[2]/div/div[2]/span[30]"));
			Thread.sleep(3000);
			jse.executeScript("arguments[0].click();", datePck);
			// jse.executeScript("document.getElementById('datepicker_end').removeAttribute('readonly',0);");
			WebElement EndDate = driver.findElement(By.xpath("//input[@id='datepicker_end']"));
			EndDate.click();
			// selecting the end date
			WebElement endDate = driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[2]/span[33]"));
			Thread.sleep(3000);
			endDate.sendKeys(Keys.TAB);
			endDate.sendKeys(Keys.ENTER);
			WebElement Country = driver.findElement(By.xpath("//input[@id='country']"));
			Country.sendKeys("India");
			WebElement Location = driver.findElement(By.xpath("//input[@id='cityname']"));
			Location.sendKeys("Bangalore");
			WebElement Venue = driver.findElement(By.xpath("//input[@id='venue_map']"));
			Venue.sendKeys("Bommanahalli");

			WebElement Banner = driver.findElement(By.xpath("//input[@id='bnr-img-upload-btn']"));
			Banner.sendKeys(
					"//Users//prasannakumaranisetti//Movies//GIT//webMOBI_Assignment//webMOBI_Assignment//2830360.jpg");
			Thread.sleep(10000);
			WebElement Logo = driver.findElement(By.xpath("//input[@id='logo-img-upload-btn']"));
			Logo.sendKeys(
					"//Users//prasannakumaranisetti//Movies//GIT//webMOBI_Assignment//webMOBI_Assignment//256256.jpg");
			Thread.sleep(10000);
			WebElement SaveCont = driver.findElement(By.xpath("//button[@id='detail_save']"));
			SaveCont.click();
			Thread.sleep(3000);
			// clicking on the save and continue button
			driver.findElement(By.xpath("//button[@id='detail_save_db']")).click();
			Thread.sleep(3000);
			// clicking on the publish app button
			driver.findElement(By.xpath("//button[@id='publish_app']")).click();
			Thread.sleep(3000);
			// publishing the app
			driver.findElement(By.xpath("//button[@class='btn-select plan-disable']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// @Test(alwaysRun=true,priority=7)
	// private void alwaysRun() {
	// driver.quit();
	// }
}
