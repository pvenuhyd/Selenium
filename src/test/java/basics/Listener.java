package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Listener {
	
	public static WebDriver driver;
	
	@Test
	public void testListener(){
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pvenuhyd@gmail.com");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("kstewart");
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		driver.close();
		
	}

}
