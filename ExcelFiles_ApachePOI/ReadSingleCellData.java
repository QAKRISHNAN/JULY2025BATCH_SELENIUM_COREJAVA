package ExcelFiles_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleCellData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		String filePath = "D:\\SELENIUM-JULY2025\\ReadDataSingleCell.xlsx";

		FileInputStream file = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheetAt(0);
	// XSSFSheet sheet = wb.getSheet("WriteDataSingleCell");

		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(2);
		String cellValue = cell.getStringCellValue();
		System.out.println("Cell value: " + cellValue);

		wb.close();
		file.close();

	}

}
