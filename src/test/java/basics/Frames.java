package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.switchTo().frame(7);
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@id='_mN_main_347728146_n']")));
		driver.findElement(By.xpath(".//*[@id='dk1']")).click();
		driver.quit();
		
	}

}
