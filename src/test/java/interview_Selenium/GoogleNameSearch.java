package interview_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.ExcelFileutility;

public class GoogleNameSearch {
	@Test
	public void newTab() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.open('about:blank');");
		jse.executeScript("window.open('https://www.amazon.in/');");
		//driver.get("https://www.amazon.in/");
		
		driver.quit();
		
	}
	/**
	 * @throws Throwable 
	 */
	@Test
	public void washingMc() throws Throwable {
		ExcelFileutility eLib=new ExcelFileutility();
		String expCapacity=eLib.readDataFromExcel("WashingMachine", 1, 0);
		String expColour=eLib.readDataFromExcel("WashingMachine", 1, 1);
		String expBrand=eLib.readDataFromExcel("WashingMachine", 1, 2);
		String expProductDim=eLib.readDataFromExcel("WashingMachine", 1, 3);
		String expSpclFeature=eLib.readDataFromExcel("WashingMachine", 1, 4);
		String expCycleOption=eLib.readDataFromExcel("WashingMachine", 1, 5);
		String expVoltage=eLib.readDataFromExcel("WashingMachine", 1, 6);
		String expControlType=eLib.readDataFromExcel("WashingMachine", 1, 7);
		String expMaxROSpeed=eLib.readDataFromExcel("WashingMachine", 1, 8);
		String expAccessLoc=eLib.readDataFromExcel("WashingMachine", 1, 9);
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Washing machines']")).click();
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[position()=1]")).click();
		Set<String> winIds=driver.getWindowHandles();
		for(String id:winIds) {
			if(id!=parentId) {
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)","" );
		driver.findElement(By.xpath("//div[@id='productOverview_feature_div']/descendant::span[text()='See more']")).click();
		
		String actCapacity=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[1]/td[2]/span")).getText();
		String actColour=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[2]/td[2]/span")).getText();
		String actBrand=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[3]/td[2]/span")).getText();
		String actProductDim=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[4]/td[2]/span")).getText();
		String actSpclFeature=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[5]/td[2]/span")).getText();
		String actCycleOption=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[6]/td[2]/span")).getText();
		String actVoltage=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[7]/td[2]/span")).getText();
		String actControlType=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[8]/td[2]/span")).getText();
		String actMaxROSpeed=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[9]/td[2]/span")).getText();
		String actAccessLoc=driver.findElement(By.xpath("//table[@class='a-normal a-spacing-micro']/tbody/tr[10]/td[2]/span")).getText();
		Assert.assertEquals(actCapacity, expCapacity);
		System.out.println("Capcity validated");
		
		Assert.assertEquals(actColour, expColour);
		System.out.println("Colour validated");
		
		Assert.assertEquals(actBrand, expBrand);
		System.out.println("Brand validated");
		
		Assert.assertEquals(actProductDim, expProductDim);
		System.out.println("ProductDim validated");
		
		Assert.assertEquals(actSpclFeature, expSpclFeature);
		System.out.println("SpclFeature validated");
		
		Assert.assertEquals(actCycleOption, expCycleOption);
		System.out.println("CycleOption validated");
		
		Assert.assertEquals(actVoltage, expVoltage);
		System.out.println("Voltage validated");
		
		Assert.assertEquals(actControlType, expControlType);
		System.out.println("ControlType validated");
		
		Assert.assertEquals(actMaxROSpeed, expMaxROSpeed);
		System.out.println("MaxROSpeed validated");
		
		Assert.assertEquals(actAccessLoc, expAccessLoc);
		System.out.println("AccessLoc validated");
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void googleNameSearch() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement txt=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		txt.sendKeys("priya");
		List<WebElement> allSuggestions= driver.findElements(By.xpath("//ul/descendant::div[@class='wM6W7d']/span"));
		List<String> allList=new ArrayList<String>();
		for(WebElement list:allSuggestions ) {
			allList.add(list.getText());
		}
		Collections.sort(allList);
		System.out.println("The sorted text is ");
		String txtn=null;
		for(int i=0;i<allList.size();i++) {
			if(i==2){
				txtn=allList.get(i);
			}
			System.out.println(allList.get(i));		
		}
	
		
		System.out.println(txtn);
		driver.findElement(By.xpath("//ul/descendant::div[@class='wM6W7d']/span[contains(text(),'"+txtn+"')]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
