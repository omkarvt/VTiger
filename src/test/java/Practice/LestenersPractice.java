package Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ListenersImplementation;

@Listeners(ListenersImplementation.class)
public class LestenersPractice {
	@Test(priority = 5)
	public void omkarWakes() {
		Assert.fail();
		System.out.println("Good Morning omkar");
	}
	
	@Test(priority = 2,dependsOnMethods = {"omkarWakes"})
	public void omkarEats() {
		System.out.println("i ate");
	}
	
	@Test(priority = 3, invocationCount = 0)
	public void omkarMakesReels() {
		System.out.println("FAAAAAAHHHHHAA");
	}

	  

}
