package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DisabledObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/cars/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String s=driver.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
		Assert.assertEquals(s, "param paramSelect disabled");
		driver.close();

	}

}
