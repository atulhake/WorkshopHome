package ASSERT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class signUp_TestNG
{
	//@Test
	public void ALl_blank() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
//============================All blank scenario======================//
	
		wd.findElement(By.id("user_fname")).click();
		wd.findElement(By.id("user_lname")).click();
		wd.findElement(By.id("user_standard")).click();
		wd.findElement(By.id("user_email")).click();
		wd.findElement(By.id("user_mobile_number")).click();
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.id("user_password")).click();
		wd.findElement(By.id("user_confirm_password")).click();
		System.out.println("All field completed till verified password");
		wd.findElement(By.id("termofuse")).click();
		System.out.println("Terms of use button clicked");
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Decline')]")).click();  //Decline
		System.out.println("Decline button click verified");
		Thread.sleep(1000);
		wd.findElement(By.id("termofuse")).click();
		System.out.println("Terms of use button clicked");
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Agree')]")).click();    // agree button
		Thread.sleep(1000);
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
	   String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
	   System.out.println("Error message is = "+alert_msg);
	   wd.quit();
		
		

	}
	//@Test
	public void positive_testing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		   
			//Thread.sleep(7000);
			WebDriverWait wait= new WebDriverWait(wd, 10);
			WebElement tt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='otp_text']")));
			boolean ss = tt.isDisplayed();
			//boolean  ss = wd.findElement(By.xpath("//*[@id='otp_text']")).isDisplayed();
	         
	      // assertTrue(ss, "Filed to load OTP window ");
	         
	         
	         System.out.println(ss);
	         if(ss)
	         {
	         System.out.println("OTP window Appeared ..test passed");
	         }
	         else
	         {
	         System.out.println("OTP window does not appeared ..test Failed");
	         }
	         wd.quit();
	}
	
	//@Test
	public void name_field_blank_test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		wd.findElement(By.id("user_standard")).click();
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();    
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error message is = 'Please Enter Your Name.'");
		
	    wd.quit();
	}
	
	//@Test
	public void Without_selection_of_standards()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
     	wd.findElement(By.id("user_fname")).sendKeys("sss");   
	    wd.findElement(By.id("user_lname")).sendKeys("hhh");
		wd.findElement(By.id("user_standard")).click();   
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Select Your Standard.'");
	    wd.quit();
	}
	
	//@Test
	public void Without_email_address()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
		wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Enter Your Email.'");
	    wd.quit();
	}
	//@Test
	public void Without_mobile_number_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
			System.out.println("Error message is = "+alert_msg);
		    System.out.println("Expected error  message is = 'Please Enter Mobile Number.'");
		    wd.quit();
		
	}	
	//@Test
	public void Without_selection_of_reletion()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
		
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please enter specific relation.");
	    wd.quit();
	}	
	//@Test
	public void Without_Password_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
        wd.findElement(By.id("user_fname")).sendKeys("sss");   
        wd.findElement(By.id("user_lname")).sendKeys("hhh");
     	wd.findElement(By.id("user_standard")).click();
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
		wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
     	wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Enter Password.");
	    wd.quit();
	}
	//@Test
	public void Without_confirm_password_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			//wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click(); 
			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
			System.out.println("Error message is = "+alert_msg);
		    System.out.println("Expected error  message is = 'Please Enter Confirm Password.");
		    wd.quit();
	}	
		
	//@Test
	public void without_selection_of_i_agree()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		  wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			//wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click(); 
			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
			System.out.println("Error message is = "+alert_msg);
		    System.out.println("Expected error  message is = 'Please agree terms of use.");
		    wd.quit();

	}
	
	@Test
	public void OTP_testing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		   
			//Thread.sleep(7000);
			WebDriverWait wait1= new WebDriverWait(wd, 10);
			WebElement tt = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='otp_text']")));
			boolean ss = tt.isDisplayed();
			
	      if(ss)
	         {
	         System.out.println("OTP window Appeared ..OTP testing started");
	         wd.findElement(By.xpath("//button[@id='btn_Validate_OTP']")).click();  //OTP window  Done button
	         System.out.println("Done button clicked ");
	         
	         Thread.sleep(2000);
	         String sd = wd.findElement(By.xpath("//div[@class='modal-body model_alertbody']/p[contains(text(),'Please enter OTP')]")).getText(); //pop up  error message 
	         System.out.println("Error message for blank OTP = "+sd);
	         Thread.sleep(2000);
	         wd.findElement(By.xpath("//div[@class='modal-footer']/center/button")).click();  //  OK button of error message pop up
	         System.out.println("OK button clicked ");
	         Thread.sleep(250);
	         wd.findElement(By.xpath("//button[@id='btn_resend_otp']")).click();
	         System.out.println("Resend OTP button clicked");
	        // Thread.sleep(1000);  // find exact time for reading text
	         WebDriverWait wait= new WebDriverWait(wd, 10);
	         Boolean jj = wait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='successMsgOTP']"),"OTP Sent Successfully on Mobile/Email id."));
			                                                  
	          System.out.println(jj);
	          System.out.println("Resent OTP text matched...test pass");
	         
	        		 
//	         String we= wd.findElement(By.xpath("//p[@id='successMsgOTP']")).getText();
//	         System.out.println("Resent OTP Message displayed = "+we);
	       
	         }
	     else
	         {
	         System.out.println("OTP window does not appeared ..test Failed");
	         }
	         wd.quit();
		
	  }	
	}

