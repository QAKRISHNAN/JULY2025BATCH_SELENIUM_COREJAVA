package ExcelFiles_ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleSheets_Creation {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\SELENIUM-JULY2025\\MultipleSheets.xlsx");
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1 = wb.createSheet("FaceBook");
		XSSFSheet sheet2 = wb.createSheet("Amazon");
		XSSFSheet sheet3 = wb.createSheet("SBI");
		XSSFSheet sheet4 = wb.createSheet("IRCTC");
		XSSFSheet sheet5 = wb.createSheet("SwagLabs");

		System.out.println("Multiple Sheets Created");

		wb.write(fileOut);

	}

}
