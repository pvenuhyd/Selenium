package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		File f1=new File(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\test1.properties");
		FileReader fr=new FileReader(f1);
		p.load(fr);
		String place=p.getProperty("place");
		System.out.println(place);
		
		File f2=new File(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\test2.properties");
		FileReader fr2=new FileReader(f2);
		p.load(fr2);
		String name=p.getProperty("name");
		System.out.println(name);
		

	}

}
