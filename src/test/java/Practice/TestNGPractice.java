package Practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Test(priority = 5)
	public void omkarWakes() {
		Assert.fail();
		System.out.println("Good Morning omkar");
	}
	
	@Test(priority = 2,dependsOnMethods = {"omkarWakes","omkarChats"})
	public void omkarEats() {
		System.out.println("i eate");
	}
	
	@Test(priority = 3, invocationCount = 0)
	public void omkarMakesReels() {
		System.out.println("FAAAAAAHHHHHAA");
	}
	//@Ignore
	@Test(priority =4,enabled = false)
	public void omkarSleep() {
		System.out.println("Good Night omkar");
	}
	
	@Test(priority = -2)
	public void omkarChats() {
		System.out.println("Vinayak loves Bihariiiii");
	}
	  

}
