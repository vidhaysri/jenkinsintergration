package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class mvntest {

		
		@Test
		public void test()
		{
			
			SoftAssert softassert= new SoftAssert();
			softassert.assertTrue(false);
			System.out.println("hellow wearehappy");
			System.out.println("hellow wearehappy");
			softassert.assertAll();
		}

	}



