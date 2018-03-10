package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/* 1.Demo of data driven frame work without excel
 * 
 * 
*/


public class DDF_Exel        
{
    @Test(dataProvider="wdata")
	public void wordpress(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.id("login_input_Uname")).sendKeys(username);
		wd.findElement(By.id("login_input_Pwd")).sendKeys(password);
		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();
	
		Thread.sleep(3000);
		if(wd.findElement(By.id("update_flag_login")).isDisplayed())   // Kill all session
		{
			
			wd.findElement(By.id("update_flag_login")).click();
			System.out.println("successful Logged in");
		}
		Thread.sleep(5000);
		Assert.assertTrue(wd.getTitle().contains("Geneo Student Cover Page"), "login failed");
		System.out.println("Page title verified");
		
	}
	@DataProvider(name="wdata")
    public Object[][] passdata()
    {
    	
    	Object[][] data = new Object[2][2];
    	data[0][0]="etegatul@gmail.com";
    	data[0][1]="Geneo@123";
    	
    	data[1][0]="etegatulgmail.com";
    	data[1][1]="Geneo123";
		return data;
     }
	
	
	
	
}
