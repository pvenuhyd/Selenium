package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CommonText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/nri_banking/home.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='expand_collapsed']/div[1]/ul/li"));
		Iterator<WebElement> it = list.iterator();
		ArrayList<String> actual=new ArrayList<String>();
		while(it.hasNext()){
			actual.add(it.next().getText());
		}
		driver.close();
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("Products & Services");
		expected.add("Send money to India");
		expected.add("Looking to invest in India");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);

	}

}
