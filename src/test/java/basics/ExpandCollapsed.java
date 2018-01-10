package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpandCollapsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/nri_banking/home.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String image1 = driver.findElement(By.xpath(".//*[@id='expand_collapsed']/div[1]/ul/li[1]/h3")).getCssValue("background-image");
		System.out.println(image1);
		driver.findElement(By.xpath(".//*[@id='expand_collapsed']/div[1]/ul/li[1]/h3")).click();
		String image2 = driver.findElement(By.xpath(".//*[@id='expand_collapsed']/div[1]/ul/li[1]/h3")).getCssValue("background-image");
		System.out.println(image2);
		driver.close();

	}

}
