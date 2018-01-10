package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPrice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='selectProductSort']")));
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='selectProductSort']")));
		s.selectByVisibleText("Price: Lowest first");
		Thread.sleep(5000);
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div/span[1]"))));
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div/span[1]"));
		Thread.sleep(10000);
		//WebDriverWait wait2=new WebDriverWait(driver,60);
		//wait2.until(ExpectedConditions.(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div/span[1]"),list.size()));
		ArrayList<Integer> p=new ArrayList<Integer>();
		Iterator<WebElement> itr = list.iterator();
		while(itr.hasNext()){
			String price=itr.next().getText();
			if(price.contains("$")){
				String data = price.substring(1);
				System.out.println(data);
				double d=Double.parseDouble(data);
				int i=(int) d;
				p.add(i);
			}
		}
		
	}

}
