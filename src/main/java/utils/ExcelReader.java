package utils;

import java.io.FileInputStream;



import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class ExcelReader {
	public static String getFlowerName(int row) throws Exception{
		FileInputStream file = new FileInputStream("C:\\Users\\Oshika.Saini\\eclipse-workspace\\project\\src\\test\\resources\\testdata\\flowers.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		return sheet.getRow(row).getCell(0).getStringCellValue();
	}
}
