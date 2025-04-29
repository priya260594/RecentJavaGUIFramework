package IBM_Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops",Keys.ENTER);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[contains(text(),'Next')]")));
		Thread.sleep(2000);
		String no="4";
		for(;;){
		try {
			driver.findElement(By.xpath("//span[@class='a-list-item']/a[@role='button' and text()='"+no+"']")).click();
			break;
		}catch(Exception e) {
			driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
			jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[contains(text(),'Next')]")));
		}}
		Thread.sleep(5000);
		//span[@class='a-list-item']/a[@role='button']
driver.quit();
	}

}
