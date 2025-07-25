package ExcelFiles_ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleSheet_Creation {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\SELENIUM-JULY2025\\SampleExcelSelenium.xlsx");
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1 = wb.createSheet("FaceBook1");

		System.out.println("Sheet Created");

		wb.write(fileOut);

	}

}
