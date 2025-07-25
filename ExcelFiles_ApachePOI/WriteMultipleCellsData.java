package ExcelFiles_ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteMultipleCellsData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\SELENIUM-JULY2025\\WriteMultipleCells.xlsx");
		
		XSSFSheet sheet1 = wb.createSheet("WriteDataSingleCell");

		XSSFRow row1 = sheet1.createRow(0);
		
		row1.createCell(0).setCellValue("Software Testing");
		row1.createCell(1).setCellValue("Automation");
		row1.createCell(2).setCellValue("Testing");
		row1.createCell(3).setCellValue("Manual");
		row1.createCell(4).setCellValue("Testing");
		row1.createCell(5).setCellValue("Functional");
		
		
		XSSFRow row2 = sheet1.createRow(1);
		row2.createCell(0).setCellValue("Software Testing");
		row2.createCell(1).setCellValue("Automation");
		row2.createCell(2).setCellValue("Testing");
		row2.createCell(3).setCellValue("Manual");
		row2.createCell(4).setCellValue("Testing");
		row2.createCell(5).setCellValue("Functional");
		
		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		
		System.out.println("Written Successfully");

	}

}
