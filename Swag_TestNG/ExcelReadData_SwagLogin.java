package Swag_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadData_SwagLogin 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	//Constructor
	public ExcelReadData_SwagLogin(String excelPath) throws IOException
	{
	File src = new File("D:\\SELENIUM-JULY2025\\SwagLoginTestData.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	wb=new XSSFWorkbook(fis);

	}

	//Method-1
	public String getData(int sheetnumber, int row, int column)
	{
		sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	//Method-2
	public int getRowCount(int sheetIndex) 
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}

}
