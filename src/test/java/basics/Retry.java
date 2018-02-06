package basics;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	private int retryCount=0;
	private int maxRetryCount=3;

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if(retryCount<maxRetryCount){
			System.out.println("Retrying test  "+arg0.getName()+"  "+"with status  "+getStatusName(arg0.getStatus())+"  "+(retryCount+1)+"  times");
			retryCount++;
			return true;
		}
			
		return false;
	}
	public String getStatusName(int status){
		
		String result=null;
		
		if(status==1)
			result="success";
		if(status==2)
			result="failure";
		if(status==3)
			result="skip";
		return result;
		
	}
	

}
