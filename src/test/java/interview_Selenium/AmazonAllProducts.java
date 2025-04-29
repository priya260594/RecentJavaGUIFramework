package interview_Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAllProducts {

	public static void main(String[] args) throws InterruptedException {
		
	//	String s="Priyamlaseio";
	//	System.out.println(s.replaceAll("[^aeiouAEIOU]",""));
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		//driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chair");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String productCount=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[contains(text(),'of')]")).getText();
		
		List<String> pName=new ArrayList<String>();
			int i=0;
		try {
			do {
		 		JavascriptExecutor jse=(JavascriptExecutor)driver;
		List<WebElement> productNames=driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));
		for(WebElement pn:productNames) {
			String na=pn.getText();
			//pName.add(na);
		i=i+1;
			System.out.println(i+"==="+na);
			}
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span/a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-button-accessibility s-pagination-separator']")));
		driver.findElement(By.xpath("//span/a[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		 }while(driver.findElement(By.xpath("//span/a[contains(text(),'Next')]")).isEnabled());
		 
		}catch(Exception e) {
			 System.out.println("come out");
		 }

		driver.quit();
		driver.findElement(By.xpath("twotabsearchtextbox")).click();	
	}
	public void readMultipleDataFromExcel(String fileName,String sheetName,Object[][] data) throws EncryptedDocumentException, IOException{
		FileInputStream fis= new FileInputStream(fileName);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		for(int i=0;i<data.length;i++){
		for(int j=0;j<data[i].length;j++){
		sh.createRow(i+1).createCell(j).setCellValue(data[i][j].toString());
		}
		}
		FileOutputStream fos=new FileOutputStream(fileName);
		wb.write(fos);
		wb.close();

		}

}
