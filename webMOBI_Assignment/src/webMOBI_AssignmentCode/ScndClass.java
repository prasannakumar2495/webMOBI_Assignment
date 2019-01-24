package webMOBI_AssignmentCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScndClass extends FrstClass{

	
	@Test(priority=3)
	private void step3() {
		//initializing the parent class
		FrstClass fc = new FrstClass();
		//clicking on the 'create new event' button.
		driver.findElement(By.xpath("//button[@class='btn create']")).click();
	}
	@Test(priority=4)
	private void step4() throws InterruptedException {
		Thread.sleep(5000);
		//selecting the single event
		driver.findElement(By.xpath("//div[@class='col-sm-6 eventbox1']/div/a")).click();
	}
	@Test(priority=5)
	private void step5() {
		//selecting any of the event type
		driver.findElement(By.xpath("//a[@id='personal']")).click();
	}
	@Test(priority=6)
	private void step6() {
		//entering the details in the required fields
		WebElement TitleOfEvent = driver.findElement(By.xpath("//input[@id='title']"));
		TitleOfEvent.sendKeys("prasanna event");
		WebElement Description = driver.findElement(By.xpath("//div[@id=\"cke_3_contents\"]/iframe"));
		Description.sendKeys("this was the assignment give for me");
		WebElement EventName = driver.findElement(By.xpath("//input[@id='appurl']"));
		EventName.sendKeys("prasanna event");
		WebElement CompanyName = driver.findElement(By.xpath("//input[@id='org_by']"));
		CompanyName.sendKeys("webMOBI");
		WebElement OrgWebsite = driver.findElement(By.xpath("//input[@id='org_website']"));
		OrgWebsite.sendKeys("https://www.webmobi.com/");
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			jse.executeScript("document.getElementById('datepicker_st')[0].removeAttribute('readonly',0);");
			WebElement StrtDate = driver.findElement(By.xpath("//input[@id='datepicker_st']"));
			StrtDate.sendKeys("2019-01-29");
			//selecting the particular date
			//driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div[2]/span[31]")).click();
			
			jse.executeScript("document.getElementById('datepicker_end')[0].removeAttribute('readonly',0);");
			WebElement EndDate = driver.findElement(By.xpath("//input[@id='datepicker_end']"));
			EndDate.sendKeys("2019-01-31");
			//selecting the end date
			//driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[2]/span[33]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("date is not given");
		}
		WebElement Country = driver.findElement(By.xpath("//input[@id='country']"));
		Country.click();
		WebElement Location = driver.findElement(By.xpath("//input[@id='cityname']"));
		Location.sendKeys("Bangalore");
		WebElement Venue = driver.findElement(By.xpath("//input[@id='venue_map']"));
		Venue.sendKeys("Bommanahalli");
		WebElement CoverPage = driver.findElement(By.xpath("//div[@id='img_app_bnr']"));
		CoverPage.sendKeys(".//2830260.jpg");
		WebElement Logo = driver.findElement(By.xpath("//div[@id='img_app_logo']"));
		Logo.sendKeys(".//256256.jpg");
		WebElement SaveCont = driver.findElement(By.xpath("//button[@id='detail_save']"));
		SaveCont.click();
		//clicking on the save and continue button
		driver.findElement(By.xpath("//button[@id='detail_save_db']")).click();
		//clicking on the publish app button
		driver.findElement(By.xpath("//button[@id='publish_app']")).click();
		//publishing the app
		driver.findElement(By.xpath("//button[@class='btn-select plan-disable']")).click();
		
	}
}
