package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FaceUtility {
	public static String getTd(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Roshani5.xlsx");
	Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	}

}
