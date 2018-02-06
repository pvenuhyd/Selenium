package basics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener extends Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		if(result.isSuccess()){
			
			Calendar calendar=Calendar.getInstance();
			SimpleDateFormat format=new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
			
			String method=result.getName();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
			String directory=System.getProperty("user.dir")+"//src//test//java//";
			File dest=new File(directory+"/success_screenshots/"+method+"_"+format.format(calendar.getTime())+".png");
			FileUtils.copyFile(src, dest);
			String path=dest.getAbsolutePath();
			Reporter.log("<a href='"+ path + "'><img src='"+ path + "' height='100' width='100'/></a>" );
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()){
			
			Calendar calendar=Calendar.getInstance();
			SimpleDateFormat format=new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
			
			String method=result.getName();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
			String directory=System.getProperty("user.dir")+"//src//test//java//";
			File dest=new File(directory+"/failure_screenshots/"+method+"_"+format.format(calendar.getTime())+".png");
			FileUtils.copyFile(src, dest);
			String path=dest.getAbsolutePath();
			Reporter.log("<a href='"+ path + "'><img src='"+ path + "' height='100' width='100'/></a>" );
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
