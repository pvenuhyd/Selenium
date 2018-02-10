package basics;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadWriteExcel {
	
	@Test
	public void update() throws IOException{
		
		ReadAndWrite write=new ReadAndWrite();
		write.updateResult("result.xlsx", "TestData", "Password", "pass");
		write.updateResult("result.xlsx", "TestData", "Password", "pass");
		write.updateResult("result.xlsx", "TestData", "Password", "fail");
	}

}
