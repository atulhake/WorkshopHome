package ASSERT;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_hard_assert
{
	@Test
     public void softAssert()
     {
    	 SoftAssert assertion= new SoftAssert();
    	 System.out.println("Soft assert test started");
    	 assertion.assertEquals(12, 13,"failed");
    	 System.out.println("Soft assert test completed"); //after fail also this line will  execute as this is Soft assert
     }
	@Test
    public void HardAssert()
    {
   	 
   	 System.out.println("Hard assert test started");
   	 Assert.assertEquals(12, 13,"failed");
   	 System.out.println("Hard assert test completed");    // this line will not execute as this is hard assert
    }
}
