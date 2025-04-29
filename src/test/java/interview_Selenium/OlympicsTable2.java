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

public class OlympicsTable2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://olympics.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//div[@data-cy='topbarContainer']/descendant::a[contains(text(),'Paris 2024')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Medals']"))));

		List<WebElement> nos=driver.findElements(By.xpath("//div[@data-cy='elements-container']/div"));
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Olymp2");
		
		for(int i=0;i<nos.size();i++) {
			Row r=sh.createRow(i+1);
			String[] all=nos.get(i).getText().split("\n");
			for(int j=0;j<all.length;j++) {
				System.out.print(all[j]+"====");
				r.createCell(j).setCellValue(all[j].toString());
			}
			System.out.println();
		}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		wb.close();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
