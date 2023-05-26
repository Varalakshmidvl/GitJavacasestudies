package Assignment12_DataDrivenApache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApacheRead {

	public static void main(String[] args) throws IOException {

		/*  File src = new File("C:\\Users\\VA20319793\\Desktop\\Autoa\\Apachepoi\\Apache_POI.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet1 = wb.getSheetAt(0);
	 String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("first value is "+data+" and "+data1);*/

		File src = new File("C:\\Users\\VA20319793\\Desktop\\Autoa\\Apachepoi\\Apache_POI.xlsx");
	    FileInputStream fis = new FileInputStream(src);

		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheetAt = wb.getSheetAt(0);

		 XSSFCell cell = sheetAt.getRow(0).getCell(1);
		 System.out.println("data from excel: " + cell);

		 XSSFCell cell2 = sheetAt.getRow(1).getCell(1);
		 System.out.println("From Data---->" + cell2);

		 wb.close();
		

	}
}