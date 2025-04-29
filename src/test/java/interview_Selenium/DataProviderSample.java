package interview_Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {
	@Test(dataProvider="multipleLogin")
	public void login(String username,String password,String otp) throws EncryptedDocumentException, IOException{
    System.out.println(username+"==="+password+"======"+otp);
    Object[][] d = multipleLogin();
    writeMultipleData(d);
	}

	@DataProvider
	public Object[][] multipleLogin() throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("login");
	int r=sh.getLastRowNum();
	int cel=sh.getRow(0).getLastCellNum();

	Object[][] d=new Object[r][cel];
	for(int i=0;i<r;i++){
	for(int j=0;j<cel;j++){
	d[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue(); }
	}
	wb.close();
	return d; }
	
	public static void writeMultipleData(Object[][] d) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("ldPrisw");
		
		for(int i=0;i<d.length;i++) {
			for(int j=i;j<d[i].length;j++) {
			sh.createRow(i+1).createCell(j).setCellValue(d[i][j].toString());	}}
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		wb.close();}
}
