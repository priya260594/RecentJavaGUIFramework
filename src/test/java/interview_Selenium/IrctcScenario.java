package interview_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class IrctcScenario {

	public static void main(String[] args) throws InterruptedException, TesseractException, IOException, AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	
		WebDriver driver=new ChromeDriver(opt);
	      driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.irctc.co.in/nget/train-search");
  
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
//		
//		Thread.sleep(1000);
//		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
//		
//		TakesScreenshot ts = (TakesScreenshot)captcha;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./CaptchaScreenShot.png");
//	    FileUtils.copyFile(src, dest);
//	
//	   Tesseract tss = new Tesseract();
//	   tss.setDatapath("C:\\Users\\Shobha\\Downloads\\Tess4J-3.4.8-src (1)\\Tess4J\\tessdata");
//	   String st = tss.doOCR(dest);
//	   String img = st.replaceAll(" ", "");
//	System.out.println(img);
//	
//	driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(img);
//	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//fromTxtBox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input")).sendKeys("SBC");
		driver.findElement(By.xpath("//ul[@id='pr_id_1_list']/li/span[contains(text(),'KSR BENGALURU')]")).click();
		//toTxtBox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input")).sendKeys("MAS");
		driver.findElement(By.xpath("//ul[@id='pr_id_2_list']/li/span[contains(text(),'MGR CHENNAI CTL')]")).click();
		//date
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input")).click();
		driver.findElement(By.xpath("//span[text()='January']/ancestor::div[@class='ui-datepicker-group ui-widget-content ng-tns-c58-10 ng-star-inserted']/descendant::td/a[text()='11']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,500);");
		//driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content ng-tns-c83-60']/descendant::td/span[contains(text(),'06:00 - 12:00')]")).click();
		
		Thread.sleep(2000);
		LocalTime startTime=LocalTime.of(6, 0);
		LocalTime endTime=LocalTime.of(9, 0);
		DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:mm");
		List<WebElement> departureTime=driver.findElements(By.xpath("//div[@class='col-xs-5 hidden-xs']/span/strong"));
//		for(WebElement d:departureTime) {
//			System.out.println(d.getText()+"hi hello");
//		}
		List<Integer> list=new ArrayList<Integer>();
		LinkedHashMap<String, Integer>map=new LinkedHashMap<>();
		for(int i=0;i<departureTime.size();i++) {
			String s=departureTime.get(i).getText().replace(" |", "");
			LocalTime inputTime=LocalTime.parse(s, timeFormatter);
			if(inputTime.isAfter(startTime)&& inputTime.isBefore(endTime)) {
				System.out.print(inputTime+" ");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//strong[contains(text(),'"+inputTime+"')]/ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']/descendant::strong[contains(text(),'AC Chair car (CC)')]")).click();
				Thread.sleep(3000);
				String amount=driver.findElement(By.xpath("//strong[contains(text(),'"+inputTime+"')]/ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']/descendant::span[@class='pull-left']/span[@class='ng-star-inserted']/strong")).getText().replace("₹ ", "");
				int exactAmount=Integer.parseInt(amount);
				list.add(exactAmount);	
				String time=inputTime.format(timeFormatter);
				map.put(time,exactAmount);
			}
		}
		System.out.println(map);
		System.out.println(list);
		Integer lessamt=Collections.min(map.values());
		System.out.println(lessamt);
		String time=Collections.min(map.keySet());
		jse.executeScript("window.scrollTo(0,0);");
		driver.findElement(By.xpath("//strong[contains(text(),'"+lessamt+"')]/ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']/descendant::strong[contains(text(),'Sat, 11 Jan')]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'"+lessamt+"')]/ancestor::div[@class='form-group no-pad col-xs-12 bull-back border-all']/descendant::button[contains(text(),'Book Now')]")).click();
		Thread.sleep(20000);
		driver.quit();

	}

}
