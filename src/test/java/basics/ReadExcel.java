package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws IOException{
		
		FileInputStream in=new FileInputStream(new File("data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(in);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> row = sheet.rowIterator();
		while(row.hasNext()){
			Row rows = row.next();
			Iterator<Cell> cell = rows.cellIterator();
			while(cell.hasNext()){
				Cell cells=cell.next();
				switch(cells.getCellType()){
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cells.getStringCellValue()+"  ");
					break;
					
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cells.getNumericCellValue()+"  ");
					break;
				
				}
			}
			System.out.println("");
		}
		
	}

}
