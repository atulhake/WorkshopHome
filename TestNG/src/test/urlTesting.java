package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class urlTesting 
{
	@Test
	public void Geneo() throws IllegalStateException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/");
		Thread.sleep(1000);
		String ActualTitle="Geneo";
		String CurrentTitle = wd.getTitle();
		if(ActualTitle.equals(CurrentTitle))
		{
			System.out.println("working fine");
		}
		else
		{
					System.out.println("not working");
					Assert.assertEquals("12", "13");
		}
		
  }
		
		
		
//	@Test
//	public void Geneostudent()
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver wd = new ChromeDriver();
//		wd.get("https://geneo.in/geneo_live/student_login.aspx");
//		String ss = wd.getTitle();
//		assertEquals("Geneo Student Login", ss,"Geneostudent  URL IS DOWN");
//		}
	}
	
	

