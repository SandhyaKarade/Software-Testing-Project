package ToolsQA_Automation_Project;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DemoQA_Forms__Alerts_Frame_Windows
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohan\\OneDrive\\Desktop\\selenium-jar\\chromeDriver.exe");
			WebDriver w=new ChromeDriver();
			System.out.println("Launch the Web Browser");
			
			w.get("https://demoqa.com/"); 
			System.out.println("Open the URL/Website");
			w.manage().window().maximize();
			Thread.sleep(2000);
			
			System.out.println("Url of Page: " +w.getCurrentUrl());
			System.out.println("Title of Page : " + w.getTitle());
			
		
		//Scroll Down and Click on Forms option
			JavascriptExecutor js = (JavascriptExecutor) w;
		    js.executeScript("window.scrollBy(0,500)");
		    WebElement E= w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/h5[1]"));
		    js.executeScript("arguments[0].scrollIntoView();", E);
		    E.click();
		    Thread.sleep(2000);
		    System.out.println("\n");
		    
		    System.out.println("------------------Froms Module--------------------------"); 
		
		//Screenshot for forms option
		    TakesScreenshot f= (TakesScreenshot) w;
			File S=f.getScreenshotAs(OutputType.FILE);
			Files.copy(S, new File ("D:\\Selenium_Screenshot\\Forms.png"));
		
		//For Click on Practice form
			 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]")).click();
			 Thread.sleep(2000);
			 System.out.println("Student Registration Form");  
			 
		//Student Registration Form  
		    w.findElement(By.id("firstName")).sendKeys("Sandhya");//First Name
			w.findElement(By.id("lastName")).sendKeys("Karade");//Last Name
			w.findElement(By.id("userEmail")).sendKeys("karadesandhya22@gmail.com");//Email id
			w.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();//Gender-Female
			w.findElement(By.id("userNumber")).sendKeys("9632587412");//Mobile
			
			w.findElement(By.id("dateOfBirthInput")).click();//Date 
		//month
			Select s=new Select(w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
			s.selectByVisibleText("February");
		//year
			Select s1=new Select(w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
			s1.selectByVisibleText("1995");
		//date
			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[4]")).click();
		
			//Subject
		//  w.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(6) div.col-md-9.col-sm-12 div.css-2b097c-container div.subjects-auto-complete__control.css-yk16xz-control > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("Commerce");//subject
		 		System.out.println("Defect01:-When we select subject and it is not selected Properly");		
		
		//Hobbies
			w.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper form:nth-child(2) div.mt-2.row:nth-child(7) div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(1) > label.custom-control-label")).click();//hobbies Sports
			w.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper form:nth-child(2) div.mt-2.row:nth-child(7) div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(2) > label.custom-control-label")).click();//hobbies reading
			Thread.sleep(2000);
			
		//UploadPcture
			w.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Rohan\\OneDrive\\Desktop\\Peacock.jpg");
						
		//Address
			w.findElement(By.id("currentAddress")).sendKeys("Oasis City Narhe Pune");
						
		//Page scroll down
			JavascriptExecutor js1 = (JavascriptExecutor) w;
			js1.executeScript("window.scrollBy(0,1000)");   
							    
			TakesScreenshot t= (TakesScreenshot) w;
			File src=t.getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File ("D:\\Selenium_Screenshot\\ForSubDefect.png"));
						
		/*
		//State
			Select S1=new Select(w.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(10) div.col-md-4.col-sm-12:nth-child(2) div.css-2b097c-container div.css-yk16xz-control > div.css-1hwfws3")));
			S1.selectByVisibleText("Uttar Pradesh");
		//City
			Select S2=new Select(w.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(10) div.col-md-4.col-sm-12:nth-child(3) div.css-2b097c-container div.css-yk16xz-control > div.css-1hwfws3")));
			S2.deselectByVisibleText("Agra");  
		*/	
			System.out.println("Defect02:-When we select State and City it is not selected Proprly");
	
 		//Screenshot for State and City 		
			TakesScreenshot t1= (TakesScreenshot) w;
			File src1=t1.getScreenshotAs(OutputType.FILE);
			Files.copy(src1, new File ("D:\\Selenium_Screenshot\\ForStateandCity.png"));
		
		//Submit
			w.findElement(By.id("submit")).click();
			System.out.println("Registration Successfully Done");
		
		//Screenshot for Student Information				
			TakesScreenshot t2= (TakesScreenshot) w;
			 File src2=t2.getScreenshotAs(OutputType.FILE);
			 Files.copy(src2, new File ("D:\\Selenium_Screenshot\\Information.png"));
						
			 Thread.sleep(3000);
			 w.navigate().back();
	/*----------------------------------------XXXXX--------------------------------------------------------------------------------------------------*/					
			 System.out.println("\n");
			 
			 //Click on Alerts, Frame & Windows
				 
				 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]")).click();
				 Thread.sleep(2000);
				 System.out.println("--------------Alerts,Frame & Windows Module-------------");	 
				  
				 //Screenshot for ALert,frame and window 
				 TakesScreenshot t5= (TakesScreenshot) w;
				 File src5=t5.getScreenshotAs(OutputType.FILE);
				 Files.copy(src5, new File ("D:\\Selenium_Screenshot\\Main_option.png"));
				 Thread.sleep(2000);
				
		
				 //Click on Browser Windows	
				 
				 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/span[1]")).click();			 
				 System.out.println("A.....Browser Window");
			
				 
				 TakesScreenshot t_win= (TakesScreenshot) w;
				 File w1=t_win.getScreenshotAs(OutputType.FILE);
				 Files.copy(w1, new File ("D:\\Selenium_Screenshot\\Windows.png"));
				 Thread.sleep(2000);
				 
				 //1.New Tab window
			
					w.findElement(By.id("tabButton")).click();
					
					Set <String> Windows1= w.getWindowHandles(); //no of Pages 1st Page  
					Iterator <String> it1= Windows1.iterator();//call by indexvalue using Iterator 
				
					String P1=it1.next();   
					String C1=it1.next();
					w.switchTo().window(P1);			
					Thread.sleep(3000);
					w.switchTo().window(C1);			
					Thread.sleep(3000);
					System.out.println(w.findElement(By.id("sampleHeading")).getText());
					System.out.println("New tab Opened");
					w.switchTo().window(P1);
					
					
				//2.New Window
				
					w.findElement(By.id("windowButton")).click();
					Set <String> Windows2= w.getWindowHandles();  
					Iterator <String> it2= Windows2.iterator(); 
			
					String P2=it2.next();   
					String C2=it2.next();
					w.switchTo().window(P2);
					Thread.sleep(3000);
					w.switchTo().window(C2);
					Thread.sleep(3000);
					w.manage().window().maximize();
					System.out.println(w.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
					System.out.println("New Window Opened");
					w.switchTo().window(P2);
					
				
				//3.New msg window
			
					w.findElement(By.id("messageWindowButton")).click();
					Set <String> Windows3= w.getWindowHandles();  
					Iterator <String> it3= Windows3.iterator();
			
					String P3=it3.next();   
					String C3=it3.next();
					w.switchTo().window(P3);
					Thread.sleep(3000);
					w.switchTo().window(C3);
					Thread.sleep(3000);
					w.manage().window().maximize();
					System.out.println(w.findElement(By.xpath("/html[1]/body[1]")).getText());
			
					System.out.println("New Message Window Opened");
					w.switchTo().window(P3);
					System.out.println("\n");
				
			
				
				//Click on Alert 
			
				JavascriptExecutor js2 = (JavascriptExecutor) w;
			    js2.executeScript("window.scrollBy(0,1000)");
			   
			    Thread.sleep(2000);
			    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/span[1]")).click();
			    System.out.println("B.....Alert");
			    
			    TakesScreenshot a1= (TakesScreenshot) w;
				File f1=a1.getScreenshotAs(OutputType.FILE);
				Files.copy(f1, new File ("D:\\Selenium_Screenshot\\Alert.png"));
				Thread.sleep(2000);
		  
				//1.Simple Alert
				
			  	w.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
				Thread.sleep(2000);
			
				Alert A1 = w.switchTo().alert();     //move focus on alert window
				System.out.println(A1.getText());  //to get text or msg from alert window
				Thread.sleep(2000);
				A1.accept();//to click OK button
				System.out.println("Simple Alert accepted ");
				Thread.sleep(2000);
				
				
				/*	//2.Wait Alert
				
				w.findElement(By.id("timerAlertButton")).click();
				Thread.sleep(2000);
				
				Alert A2 = w.switchTo().alert();
				System.out.println(A2.getText());
				Thread.sleep(2000);
				A2.accept();
				System.out.println("Wait Alert accepted ");
				Thread.sleep(2000);  */
				
				System.out.println("Defect 03:-In Alert option wait alert ok Button is Not clickable by Automatic way but its work manually Propperly");
				
				
				
				//3.Accepting Confirm Alert
			
				w.findElement(By.id("confirmButton")).click();
				Thread.sleep(2000);
				
				Alert A3 = w.switchTo().alert();
				Thread.sleep(2000);
				System.out.println(A3.getText());
				A3.accept();
				System.out.println("Confirm Alert accepted ");
				Thread.sleep(2000);
				
				
				
				//4.Dismiss Confirm Alert
				
				w.findElement(By.id("confirmButton")).click();
				Thread.sleep(2000);
				
				Alert D1 = w.switchTo().alert();
				Thread.sleep(2000);
				System.out.println(D1.getText());
				D1.dismiss();
				System.out.println("Confirm Alert dismissed");
				Thread.sleep(2000);
				
				
				//5. Accepting Promt Alert 
					
				w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[2]/button[1]")).click();
				Thread.sleep(2000);
				
				Alert A4 = w.switchTo().alert();
				A4.sendKeys("Sandhya");
				Thread.sleep(2000);
				System.out.println(A4.getText());
				Thread.sleep(2000);
				A4.accept();	
				System.out.println("Promt Alert accepted ");
				Thread.sleep(2000);
				System.out.println("Defect 04:-In Alert option promt alert not showing text while running the program");
				
				
				//6.Promt Alert Dismiss
				
				w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[2]/button[1]")).click();
				Thread.sleep(2000);
				
				Alert A5 = w.switchTo().alert();
			
				System.out.println(A5.getText());
				Thread.sleep(2000);
				A5.dismiss();	
				System.out.println("Promt Alert dismissed");
				Thread.sleep(2000);
				w.navigate().back();
				System.out.println("\n");
				
				//Click on Frames 
				
				
				JavascriptExecutor js3 = (JavascriptExecutor) w;
			    js3.executeScript("window.scrollBy(0,1000)");
			   
			  
			    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/span[1]\r\n")).click();
			   			    
			    Thread.sleep(2000);
			    js3.executeScript("window.scrollBy(0,-500)");
			
			    Thread.sleep(2000);
			    System.out.println("C.....Frames");
			
			    TakesScreenshot t3= (TakesScreenshot) w;
				File src3=t3.getScreenshotAs(OutputType.FILE);
				Files.copy(src3, new File ("D:\\Selenium_Screenshot\\Frames.png"));
				
			    
				//NO of iframes
			    
				List<WebElement> list=w.findElements(By.tagName("iframe"));
				System.out.println("Total no of iframs in frames = " + list.size());
				
				//Switch between frames
				
				w.switchTo().frame("frame2");
				System.out.println(w.findElement(By.id("sampleHeading")).getText());
				w.switchTo().defaultContent();
				js3.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
				System.out.println("\n");
		
				//Click on Nasted Frames 
				
				JavascriptExecutor js4 = (JavascriptExecutor) w;
			    js4.executeScript("window.scrollBy(0,1500)");
			    
			    w.findElement(By.xpath("//span[contains(text(),'Nested Frames')]")).click();
			    System.out.println("D.....Nasted Frames");
			    
			    Thread.sleep(2000);
			    js2.executeScript("window.scrollBy(0,-1000)");

			    TakesScreenshot t4= (TakesScreenshot) w;
				File src4=t4.getScreenshotAs(OutputType.FILE);
				Files.copy(src4, new File ("D:\\Selenium_Screenshot\\NastedFrames.png"));
			  
				//NO of iframes
			    List<WebElement> L=w.findElements(By.tagName("iframe"));
				System.out.println("Total no of iframs are = " + L.size());
			
				//Switch between frames
				w.switchTo().frame("frame1");
				System.out.println(w.findElement(By.xpath("/html/body")).getText());
				Thread.sleep(2000);
				System.out.println("\n");
				
				//Click on Modal Dialog
				
				w.get("https://demoqa.com/modal-dialogs");
			    System.out.println("E.....Modal Dialog");
				    
				System.out.println("Defect 05:-Modal Dialog Option not clickable by using any Locator");
				
			    TakesScreenshot t6= (TakesScreenshot) w;
				File src6=t6.getScreenshotAs(OutputType.FILE);
				Files.copy(src6, new File ("D:\\Selenium_Screenshot\\Modal_Dialogs.png"));
				
				
				//Small Modal
					System.out.println("----Small Modal----");
				//Close Option
					w.findElement(By.id("showSmallModal")).click();
					Thread.sleep(2000);
					
					WebElement Small=w.findElement(By.xpath("/html/body/div[4]/div/div/div[2]"));
					System.out.println(Small.getText());
					w.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button/span[1]")).click();//For Close option
					System.out.println("Small Modal Close by 'X' option ");
					Thread.sleep(3000); 
					
				//Close by button	
					w.findElement(By.id("showSmallModal")).click();
					Thread.sleep(2000);
			
					WebElement Small1=w.findElement(By.xpath("/html/body/div[4]/div/div/div[2]"));
					System.out.println(Small1.getText());
					w.findElement(By.id("closeSmallModal")).click();
					System.out.println("Small Modal Close by button ");
					Thread.sleep(3000); 

				
				//Large modal button
					System.out.println("----Large Modal----");
				 //Close option
					w.findElement(By.id("showLargeModal")).click();
				  	Thread.sleep(2000);
					
					WebElement Large1=w.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/p"));
					System.out.println(Large1.getText());
					w.findElement(By.xpath("//span[contains(text(),'×')]")).click();
					System.out.println("Large Modal Close by 'X' option ");
					Thread.sleep(3000);
					
				//Close by button	
					w.findElement(By.id("showLargeModal")).click();
				  	Thread.sleep(2000);
					
					WebElement Large2=w.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/p"));
					System.out.println(Large2.getText());
					w.findElement(By.id("closeLargeModal")).click();
					System.out.println("Large Modal Close by button ");
					Thread.sleep(3000); 
					w.close();
		}
}
