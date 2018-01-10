package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(-0,1000)");
		WebElement mouse = driver.findElement(By.xpath("//div[contains(text(),'Wireless Mouse')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", mouse);
		driver.close();

	}

}
