package interview_Selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTestRecent {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Date d=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("MM-DD-YYYY");
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("blr");
		driver.findElement(By.xpath("//div[@role='listbox']/descendant::span[contains(text(),'Bengaluru')]")).click();
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("ixe");
		driver.findElement(By.xpath("//div[@role='listbox']/descendant::span[contains(text(),'Mangalore')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'March 2025')]/../parent::div[@class='DayPicker-Month']/descendant::p[contains(text(),'19')]")).click();
		driver.findElement(By.xpath("//p[@data-cy='submit']/a[contains(text(),'Search')]")).click();
	}

}
 