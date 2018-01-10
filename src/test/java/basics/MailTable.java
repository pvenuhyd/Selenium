package basics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("venutest1988");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("venuitsoft_7");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div/a[2]")).click();
		List<WebElement> mails = driver.findElements(By.xpath(".//table[@class='th']/tbody/tr"));
		Iterator<WebElement> itr = mails.iterator();
		int unread=0;
		/*for(int i=1;i<=mails.size();i++){
			String color = itr.next().getAttribute("bgcolor");
			//System.out.println(color);
			if(!color.equals("#E8EEF7")){
				unread=unread+1;
				driver.findElement(By.xpath(".//table[@class='th']/tbody/tr["+i+"]/td[1]/input")).click();
			}
			
		}
		System.out.println(unread);*/
		//Delete based on subject line
		/*for(int i=1;i<=mails.size();i++){
			String subject=driver.findElement(By.xpath(".//table[@class='th']/tbody/tr["+i+"]/td[3]")).getText();
			if(subject.contains("Job")||subject.contains("job")){
				driver.findElement(By.xpath(".//table[@class='th']/tbody/tr["+i+"]/td[1]/input")).click();
			}
			
		}
		driver.findElement(By.xpath(".//input[@value='Delete']")).click();*/
		driver.close();

	}

}
