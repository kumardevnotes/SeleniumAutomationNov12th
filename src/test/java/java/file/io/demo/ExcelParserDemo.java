package java.file.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParserDemo {
	
	public static FileInputStream fileInputStream = null; //to read data from excel workbook
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	
	public static FileOutputStream fileOutputStream = null; //to write some data into excel workbook

	public static void main(String[] args) throws Exception {
		
		
String rootPath = System.getProperty("user.dir");
		
		 fileInputStream = new FileInputStream(new File(rootPath + "//src//test//resources//TestData.xlsx")); 

		// Create Workbook instance holding reference to .xlsx file
		workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		sheet = workbook.getSheet("AppData");
		System.out.println(sheet.getRow(1).getCell(2).toString());
		
		fileOutputStream = new FileOutputStream(new File(rootPath + "//src//test//resources//TestData.xlsx"));
		
		sheet.getRow(1).getCell(2).setCellValue("newPassword8877");
		
		workbook.write(fileOutputStream);
		
		System.out.println("Updated Value: "+ sheet.getRow(1).getCell(2).toString());
	}

}
