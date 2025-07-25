package ExcelFiles_ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleCellData {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\SELENIUM-JULY2025\\ReadDataMultipleCells.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(file);

		Sheet sheet = workbook.getSheetAt(0); // assuming you want to read from the first sheet

		// Define the cell range you want to read

		for (int i = 1; i <= 1; i++) // OuterLoop Rows 1<=1 T 
		{
			Row row = sheet.getRow(i); //1
			
			for (int j = 0; j < 5; j++) // Inner Columns 0<5 1<5 2<5 3<5 4<5 5<5F
			{
				Cell cell = row.getCell(j);
				// Assuming all cells contain string data
				String cellValue = cell.getStringCellValue();

				// int cellValue = (int) cell.getNumericCellValue();
				System.out.print(cellValue +"    ");
			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
