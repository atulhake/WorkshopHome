package student;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_chapter_video_test {

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
		if(wd.findElement(By.id("update_flag_login")).isDisplayed())
		{wd.findElement(By.id("update_flag_login")).click();  // Kill all session
		}
		Thread.sleep(5000);
		wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
		Thread.sleep(3000);
		wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]")).click(); //GENEO OPTION OF MENU BAR 
		
		Thread.sleep(12000);  // DONT CHANGE THIS TIME 12SEC.
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button")).click(); 
	
//		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click(); //10th Standard
//        System.out.println("");
//	    System.out.println("");
//		System.out.println("10th standard");
// 10th or 9th		
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/a")).click();  //9th standard
		
		System.out.println("");
		System.out.println("");
		System.out.println("9th standard");
		
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
		
		wd.findElement(By.xpath(".//button[contains(text(),'DONE')]")).click();    // this xpath works fine so dont use javascript for Done button.
	

//		//============================cover page =================================//
		Thread.sleep(8000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/a/img")).click(); // cover page click event
		Thread.sleep(5000);
		//wd.findElement(By.xpath("//*[@id='index_table_rows']/div[12]/div[1]/span[2]")).click();
		
	
				
		        Thread.sleep(5000);
		     wd.findElement(By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()='4']")).click();   // chapter  selection 
		        System.out.println("text page of book is open ...idiot study now :D!!!!!!");
		     
		    
		      
		    
		    // =========Single chapter all page video code is here============================//
		        
		        
		        
		        
			       for(int t=0;t<20;t++)
				     {
			    	 
				      
				       String String_video_count=wd.findElement(By.xpath(".//*[@id='section11']/span")).getText(); //video count reader
				       if(String_video_count.equals("")) //   got it difference between "" & null..remember it.
				       {
				    	   System.out.println("Video count of page =  0");
				       }
				       else
				       {
				    	   int video_count= Integer.parseInt(String_video_count);
					       System.out.println("Video count of page =  "+video_count);
					       Thread.sleep(6000);
						       wd.findElement(By.xpath(".//*[@id='section11']")).click();    // video tab click 
						       java.util.List<WebElement> no_of_videos =wd.findElements(By.xpath(".//*[@id='mCSB_6_container']/figure[@class='OpenVideoLU ']"));
						       for (WebElement myValue1 : no_of_videos)                     
							    {	
						    	  
							        Thread.sleep(4000);
							        myValue1.click();   // to open a video
								        if(wd.findElement(By.xpath("//*[@id='vid']/button")).isDisplayed())   // for K class academy video
								        {
								        	wd.findElement(By.xpath("//*[@id='vid']/button")).click();    // To click  play button    
								        	Thread.sleep(2000);
								        	
								        	
								        	//==================title description start=========================//
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[2]/i")).click();   // Arrow down
								        	String video_name=wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[2]/p")).getText();   
								        	System.out.println("video description is ="+video_name);
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[1]/i")).click();    //Arow up 
								        	//==================title description end=========================//
								        	System.out.println("title test complete");
								        	
								        	//==================thumb buttons start=========================//
								        	wd.findElement(By.xpath(".//*[@id='imgContentRNo']")).click();
								        	Thread.sleep(1500);
								        	wd.findElement(By.xpath(".//*[@id='imgContentRYes']")).click();
								        	//==================thumb buttons ends=========================//
								        	System.out.println("thumb test complete");
								        	Thread.sleep(1500);
								        	//================== quality buttons starts=========================//
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[3]")).click();
								        	
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[3]")).click();
								        	//================== quality buttons ends=========================//
								        	System.out.println("quality buttons test complete");
								        	Thread.sleep(6000);
								        	//================== play /Pause buttons Starts=========================//
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();  //play video 
								           Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();// Pause video
								        	//================== play /Pause buttons ends=========================//
								        	System.out.println("play/pause button test complete");
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[2]")).click();  //Full screen k class 
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[2]")).click();   //minimize screen  k class//
								        	
								        	System.out.println("full screen/minimize screen test complete");
								         	Thread.sleep(5000);
							        	wd.findElement(By.xpath(".//*[@id='myModal_vedio']/div/div/button")).click(); //close video
								        	System.out.println("Video closed");
								            Thread.sleep(6000);
								        	
								            WebElement element = wd.findElement(By.xpath(".//*[@id='mCSB_6_container']/figure[@class='OpenVideoLU ']"));
											JavascriptExecutor scroll = (JavascriptExecutor) wd;
											scroll.executeScript("arguments[0].scrollIntoView(true);",element);
											Thread.sleep(3000);
											System.out.println("video get scrolled");
											
								        }
								        else // for khan academy video
								        	
								        {
								        	
								        	Thread.sleep(2000);
								        	//==================video description start=========================//
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[2]/i")).click();   // Arrow down
								        	String video_name=wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[2]/p")).getText();   
								        	System.out.println("video description is ="+video_name);
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[1]/i")).click();    //Arow up 
								        	//==================video description end=========================//
								        	System.out.println("title test complete");
								        	//==================thumb buttons start=========================//
								        	wd.findElement(By.xpath(".//*[@id='imgContentRNo']")).click();
								        	Thread.sleep(1500);
								        	wd.findElement(By.xpath(".//*[@id='imgContentRYes']")).click();
								         	System.out.println("thumb test complete");
								        	//==================thumb buttons ends=========================//
								        	
								        	Thread.sleep(1500);
								        	//================== quality buttons starts=========================//
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[3]")).click();
								        	
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[3]")).click();
								        	//================== quality buttons ends=========================//
								        	System.out.println("quality buttons test complete");
								        	Thread.sleep(3000);
								        	wd.findElement(By.xpath("//*[@id='span_toggle_Screen']")).click();   // full screen khan academy video
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='span_toggle_Screen']")).click();   // minimize screen khan academy video
								        	System.out.println("full screen/minimize screen test complete");
								        	
								        	
							        	 Thread.sleep(6000);
										        wd.findElement(By.xpath(".//*[@id='myModal_vedio']/div/div/button")).click(); //close video
										        System.out.println("Video closed");
										        Thread.sleep(6000);
										       
										        WebElement element = wd.findElement(By.xpath(".//*[@id='mCSB_6_container']/figure[@class='OpenVideoLU ']"));
												JavascriptExecutor scroll = (JavascriptExecutor) wd;
												scroll.executeScript("arguments[0].scrollIntoView(true);",element);
									
												System.out.println("video get scrolled");
												Thread.sleep(6000);
																						        
								          }
								        
						 }
					        
					        
					        System.out.println("====================single page video test complted=====================");
		        
					       
					    }
				       
			    	 
				    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
				    	 Thread.sleep(4000);
				    	 
				     }
		    
		    
		    
			       System.out.println("====================single chapter video test completed=====================");

		        
	
	
		
		
		}
		

	}


