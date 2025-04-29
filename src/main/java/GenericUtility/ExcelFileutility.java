package GenericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileutility {
	public String readDataFromExcel(String SheetName,int row,int cell) throws Throwable {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row r=sh.getRow(row);
		String ro= r.getCell(cell).getStringCellValue();
		return ro;
	}

}
