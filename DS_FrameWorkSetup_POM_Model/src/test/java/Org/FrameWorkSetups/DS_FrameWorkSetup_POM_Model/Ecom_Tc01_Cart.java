package Org.FrameWorkSetups.DS_FrameWorkSetup_POM_Model;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.FrameWorkSetups.PageObjectModelReusableComponenet.Android.FromPage_Reusable_Components;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class Ecom_Tc01_Cart extends Base_POM_File

	{
		@BeforeMethod
		public void Starting_page_url()
		{
			
			Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
			driver.startActivity(activity);
			
			
		}
		
		@Test
		public void Fill_Form() throws InterruptedException 
		{
			FromPage_Reusable_Components FromPage = new FromPage_Reusable_Components(driver);
			FromPage.Set_Name_Field_opration("Mohit");
			FromPage.Set_Gender("Female");
	
		
			
		//	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mohit");
			
		//	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
			driver.findElement(By.id("android:id/text1")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
			driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();	
			Thread.sleep(2000);
			driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();	
			Thread.sleep(2000);
		    driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();	
		    Thread.sleep(2000);
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();		
			
		    Thread.sleep(2000);
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));		
		    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
		
		    
		    List<WebElement> productPRICE = driver.findElements(By.id(" com.androidsample.generalstore:id/productPrice"));
		    
		    int Count = productPRICE.size();
		    double Totalsum = 0;
		
		    for(int i=0;i<Count;i++)
			{
		    	
					
		 
		    	String Amount = productPRICE.get(i).getText();
		    	//remove $ symbol from amount value
		    	Double price = getFormattedAmount(Amount);
		   
		   // Double price =	Double.parseDouble(Amount.substring(1));
		    	
		    Totalsum = Totalsum + price;  // 160.97+ 120 = 280;
			}
		     
		  String DisplaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		  //remove $ symbol from amount value
		  Double DisplaySumFormat = getFormattedAmount(DisplaySum);
		  // Check added item & total amount is same or not
		  Assert.assertEquals(Totalsum, DisplaySumFormat);
		  
		  WebElement LongPress = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton\n"));
		  longPressAction(LongPress);
		  driver.findElement(By.id("android:id/button1")).click();
		  driver.findElement(By.className("android.widget.CheckBox")).click();
		  driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		  Thread.sleep(2000);
		  
		//  driver.pressKey(new KeyEvent(AndroidKey.HOME));
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		 

		}
			      
	
	}


