package TestResult_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Swag_ExcelTestData {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	//Constructor
	public Swag_ExcelTestData(String excelPath) throws IOException
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
	
	public void writeData(int sheetNumber, int row, int col, String result) throws IOException {
	    sheet = wb.getSheetAt(sheetNumber);
	    
	    // Create cell if it doesn't exist
	    if (sheet.getRow(row).getCell(col) == null)
	    {
	        sheet.getRow(row).createCell(col);
	    }

	    XSSFCell cell = sheet.getRow(row).getCell(col);
	    cell.setCellValue(result);

	    FileOutputStream fout = new FileOutputStream("D:\\SELENIUM-JULY2025\\SwagTestResult.xlsx");
	    wb.write(fout);
	    fout.close();
	}

}
