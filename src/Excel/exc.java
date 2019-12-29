package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class exc {
	@Test
	public void excelFetch() throws EncryptedDocumentException, InvalidFormatException, IOException{
FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int rc = sh.getLastRowNum();
	System.out.println("Last row count is "+rc);
	Row r = sh.getRow(0);
	short cc = r.getLastCellNum();
	System.out.println("Last cell count number is "+cc);
	Row r1 = sh.getRow(1);
	System.out.println(r1.getLastCellNum());
	Object data[][]=new Object[rc+1][cc];
	//System.out.println(data);
	for(int i=0;i<rc+1;i++)
	{
		Row row = sh.getRow(i);
		for(int j=0;j<cc;j++)
		{
			Cell cell = row.getCell(j);
			data[i][j]=cell.getStringCellValue();
		}
	}
	
	
	}
	
}
