package interview_Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OlympicsTable {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://olympics.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//div[@data-cy='topbarContainer']/descendant::a[contains(text(),'Paris 2024')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Medals']"))));

		List<WebElement> nation=driver.findElements(By.xpath("//div[@data-cy='element-wrapper']/div/span[@data-cy='name-label']"));
		List<WebElement> gold=driver.findElements(By.xpath("//div[@data-cy='element-wrapper']/span[@data-cy='number-of-golds']"));
		List<WebElement> silver=driver.findElements(By.xpath("//div[@data-cy='element-wrapper']/span[@data-cy='ocs-text-module'][1]"));
		List<WebElement> bronze=driver.findElements(By.xpath("//div[@data-cy='element-wrapper']/span[@data-cy='ocs-text-module'][2]"));
		List<WebElement> mix=driver.findElements(By.xpath("//div[@data-cy='element-wrapper']/span[@data-cy='ocs-text-module'][3]"));
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("WebTable");
	
		for(int i=0;i<nation.size();i++) {
		System.out.println(nation.get(i).getText()+"=="+gold.get(i).getText()+"=="
	    +silver.get(i).getText()+"=="+bronze.get(i).getText()+"=="+mix.get(i).getText());
	
	Row r=sh.createRow(i+1);
		
	r.createCell(0).setCellValue(nation.get(i).getText());
	r.createCell(1).setCellValue(gold.get(i).getText());
	r.createCell(2).setCellValue(silver.get(i).getText());
	r.createCell(3).setCellValue(bronze.get(i).getText());
    r.createCell(4).setCellValue(mix.get(i).getText());
	}
	
	FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
	wb.write(fos);
	wb.close();
	driver.quit();
	}

}

	


