package basics;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4j {
	
	Logger log=Logger.getLogger(Log4j.class.getName());
	public static WebDriver driver;
	
	@Test
	public void loginTest(){
		
		String log4jpath="log4j.properties";
		PropertyConfigurator.configure(log4jpath);
		
		log.info("Opening Browser....");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		log.info("Launching site...");
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Click on Signin...");
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		log.info("Enter Username....");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pvenuhyd@gmail.com");
		log.info("Enter Password------");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("kstewart");
		log.info("Click On Submit button.......");
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		log.info("closing browser.......");
		driver.close();
		
	}

}
