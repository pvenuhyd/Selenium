package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class DatabaseTesting {
	
	@SuppressWarnings("deprecation")
	public String[][] loginData() throws IOException{
		
		String[][] data=null;
		
		FileInputStream fis=new FileInputStream("LoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		 int rows=sheet.getLastRowNum()+1;
		 System.out.println(rows);
		 int cols=sheet.getRow(0).getLastCellNum();// It returns short
		 System.out.println(cols);
		 data=new String[rows][cols];

		for(int i=1;i<rows;i++){
			
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cols;j++){
				XSSFCell cell = row.getCell(j);
				if(cell.getCellType()==Cell.CELL_TYPE_STRING){
					data[i-1][j]=cell.getStringCellValue();
				}
				if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					data[i-1][j]=String.valueOf(cell.getNumericCellValue());
				}
					
				}
			
		}
		
		fis.close();
		workbook.close();
		
		return data;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from login");
		while(rs.next()){
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		DatabaseTesting db=new DatabaseTesting();
		String[][] data=db.loginData();
		
		for(String[] s:data){
			System.out.println(s[0]+" "+s.toString());
		}
		con.close();

	}

}
