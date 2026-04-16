package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class HardAssertionPractice {
	public void strictlevelexecution() {
		String expectedName="ramu";
		String actualName="ramu";
		System.out.println("Hard assertion starts");
		Assert.assertEquals(actualName, expectedName);
		Assert.assertEquals(actualName.contains(expectedName), true);
		System.out.println("hard assertion mid");
		Assert.assertFalse(actualName.equals(expectedName));
		Assert.assertTrue(actualName.contains(expectedName));
		System.out.println("hard assertion end");
		
		
	}
}
