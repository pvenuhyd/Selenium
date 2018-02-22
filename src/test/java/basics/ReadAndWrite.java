
package basics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWrite {
	
	public void updateResult(String excel, String sheet, String testCase, String result) throws IOException{
		
		FileInputStream in=new FileInputStream(new File(excel));
		XSSFWorkbook workbook=new XSSFWorkbook(in);
		
		XSSFSheet sheet1 = workbook.getSheet(sheet);
		Iterator<Row> rows = sheet1.rowIterator();
		while(rows.hasNext()){
			Row row = rows.next();
			Cell cell=row.getCell(1);
			int rownum=0;
			if(cell.getStringCellValue().equals(testCase)){
				XSSFRow crow = sheet1.createRow(rownum);
				XSSFCell ccell = crow.createCell(2);
				ccell.setCellValue(result);
				
			}
		}
		FileOutputStream out=new FileOutputStream(new File(excel));
		workbook.write(out);
		in.close();
		out.close();
		workbook.close();
	}

}
