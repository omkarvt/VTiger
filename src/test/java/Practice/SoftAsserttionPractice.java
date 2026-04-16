package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserttionPractice {
	@Test
	public void softAssertion() {
		String Actualfood="Biryani";
		String Expected="dum biryani";
		System.out.println("soft assertion starts");
		SoftAssert s=new SoftAssert();
		s.assertEquals(Actualfood, Expected);
		s.assertTrue(Actualfood.contains(Expected));
		System.out.println("soft assertion end");
		s.assertAll();
		
	}

}
