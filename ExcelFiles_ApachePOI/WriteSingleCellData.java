package ExcelFiles_ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleCellData {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\SELENIUM-JULY2025\\WriteSingleCellData.xlsx");

		XSSFSheet sheet1 = wb.createSheet("WriteDataSingleCell");

		XSSFRow row1 = sheet1.createRow(0);
		row1.createCell(0).setCellValue("dssghdfg");

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);

		System.out.println("Written Successfully");
	}

}
