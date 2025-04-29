package interview_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class YatraScenario {

	public static void main(String[] args) throws InterruptedException {
		String monthAndYear="May 2025";
		String date="22";
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)","");
		
		driver.findElement(By.xpath("//div[@class='css-rd021u']")).click();
		
		for(;;){
			try {
				driver.findElement(By.xpath("//span[text()='"+monthAndYear+"']/ancestor::div[@class='react-datepicker__month-container']/descendant::span[text()='"+date+"']")).click();
			break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month' and not(@style='visibility: hidden;')]")).click();
				//e.printStackTrace();
			}
		}
		
		System.out.println("Clicked");
		Thread.sleep(5000);
		driver.close();

	}

}
