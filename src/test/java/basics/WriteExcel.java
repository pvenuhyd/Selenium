
package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	@Test
	public void readExcel() throws IOException{
		
		FileOutputStream out=new FileOutputStream(new File("data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");
		
		Map<String,Object[]> map=new TreeMap<String,Object[]>();
		map.put("1", new Object[]{"Username","Password","Result"});
		map.put("2", new Object[]{"venu1","babu1",""});
		map.put("3", new Object[]{"venu2","babu2",""});
		
		Set<String> keys = map.keySet();
		int rowNum=0;
		for(String key:keys){
			
			XSSFRow row = sheet.createRow(rowNum++);
			Object[] values = map.get(key);
			int cellNum=0;
			for(Object obj:values){
				XSSFCell cell = row.createCell(cellNum++);
				if(obj instanceof String){
					cell.setCellValue((String)obj);
				}
				else if(obj instanceof Integer){
					cell.setCellValue((Integer)obj);
				}
			}
			
		}
		workbook.write(out);
		out.close();
		workbook.close();
		
	}

}
