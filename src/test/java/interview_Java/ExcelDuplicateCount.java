package interview_Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDuplicateCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		LinkedHashMap<String,Integer> map=new LinkedHashMap();
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Duplicate");
		int r=sh.getLastRowNum();
		int c=sh.getRow(0).getLastCellNum();
		//String[] str=new String[r];
		for(int i=0;i<r;i++) {
			//for(int j=0;j<c;j++) {
			//str[i]=sh.getRow(i).getCell(0).getStringCellValue();
			String temp=sh.getRow(i).getCell(0).getStringCellValue();
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		//li.add(sh.getRow(i).getCell(0).getStringCellValue());
		}
		//}
		System.out.println(map);
		wb.close();

	}

}
