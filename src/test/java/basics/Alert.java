package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert {

	@Test
	public void verifyAlert() {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='loginBTN']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.close();

	}

}
