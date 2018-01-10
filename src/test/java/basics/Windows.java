package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/CCLogin.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[contains(text(),'Register for NetBanking')]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String pwindow = it.next();
		String cwindow=it.next();
		driver.switchTo().window(cwindow);
		driver.findElement(By.xpath(".//*[@id='main']/div[2]/ul/li[1]/a/span")).click();
		driver.close();
		driver.switchTo().window(pwindow);
		driver.findElement(By.xpath("//img[@alt='Log In']")).isDisplayed();
		driver.close();
		

	}

}
