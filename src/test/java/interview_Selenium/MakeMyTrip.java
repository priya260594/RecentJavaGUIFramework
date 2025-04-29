package interview_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act=new Actions(driver);
		act.moveByOffset(20, 20).click().perform();
		
		driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='From']")).click();
		driver.findElement(By.xpath("//input[@type='text'  and @placeholder='From']")).sendKeys("BLR");
		driver.findElement(By.xpath("//li[@role='option']/descendant::span[text()='Bengaluru']")).click();
		//li[@id='react-autowhatever-1-section-0-item-0']
		
		

	}

}
