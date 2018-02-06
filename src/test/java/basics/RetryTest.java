package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	@Test
	public void test(){
		System.out.println("Retrying.....");
		Assert.assertTrue(false);
	}

}
