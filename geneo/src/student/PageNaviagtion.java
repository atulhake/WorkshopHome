package student;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNaviagtion{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.id("login_input_Uname")).sendKeys("etegatul@gmail.com");
		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();
		System.out.println("successful Logged in");
		Thread.sleep(3000);
		wd.findElement(By.id("update_flag_login")).click();  // Kill all session
		Thread.sleep(5000);
		wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
		Thread.sleep(3000);
		wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]")).click(); //GENEO OPTION OF MENU BAR 
		
		Thread.sleep(12000);  // DONT CHANGE THIS TIME 12SEC.
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button")).click(); 
	
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click(); //10th Standard
        System.out.println("");
	    System.out.println("");
		System.out.println("10th standard");
// 10th or 9th		
		//wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/a")).click();  //9th standard
		
		//System.out.println("");
		//System.out.println("");
		//System.out.println("9th standard");
		
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/span/img")).click();  //subject dropdown
		Thread.sleep(3000);
	    //wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a/b")).click(); //Maths 
		//System.out.println("Mathamatics");
//maths or science		
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]/a/b")).click();  //science 
		System.out.println("Science");
//science or english
	//	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[3]/a/b")).click();  //english
		
		
	  /*	//===============javascript for landing page check box button click event=========//
				WebElement e2 = wd.findElement(By.xpath("//LABEL[@for='remember_land']"));
				JavascriptExecutor d2 = (JavascriptExecutor)wd;  // It says = Down-casting or typecasting web-driver reference into javascript executor 
				d2.executeScript("arguments[0].click();", e2);
      */				
		

		Thread.sleep(3000);
		//wd.findElement(By.xpath("html/body/div[2]/div[1]/div/div[4]/button")).click();  // Done button
		//wd.findElement(By.xpath("//BUTTON[@type='button'][text()='DONE']")).click();
		//===============javascript for Done button click event=========//
		WebElement e1 = wd.findElement(By.xpath("//BUTTON[@type='button'][text()='DONE']"));
		JavascriptExecutor d1 = (JavascriptExecutor)wd;
		d1.executeScript("arguments[0].click();", e1);
		//============================cover page =================================//
		Thread.sleep(8000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/a/img")).click(); // cover page click event
		Thread.sleep(5000);
		//wd.findElement(By.xpath("//*[@id='index_table_rows']/div[12]/div[1]/span[2]")).click();
		
	
				
		        Thread.sleep(5000);
		     wd.findElement(By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()='8']")).click();   // chapter selection 
		        System.out.println("text page of book is open ...idiot study now :D!!!!!!");
		        Thread.sleep(6000);
		        wd.findElement(By.xpath(".//a[contains(text(),'First')]")).click();  //first button of text page
		       System.out.println("First button get clicked succesfully");
		      Thread.sleep(3000);
		     for(int t=0;t<18;t++)
		     {
		    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
		    	 Thread.sleep(2000);
		     }
		      System.out.println("=============================Page navigation completed=============================");
		       // wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation back button
		        
		        
		       // WebElement Last_word=wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[14]/a[contains(text(),'Last')]"));
		        //String s=Last_word.getText();
		        //System.out.println(s);
		        
		        
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		       // Thread.sleep(2000);
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		        
		        
	
		
		        //-----  .//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()="1"]
		
		
		}
		

	}



