package Org.FrameWorkSetups.PageObjectModelReusableComponenet.Android;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utility.Android_Action;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FromPage_Reusable_Components  extends Android_Action
{
	

	AndroidDriver driver;

	
	public FromPage_Reusable_Components(AndroidDriver driver)
	{
		super();
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //
		
	}
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	public void Set_Name_Field_opration(String name)
	{
		nameField.sendKeys(name);
		
	}
/////////////////
		@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
		private WebElement Female_Option;
		
	 
		@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
		private WebElement Male_Option;
		
////////////////		
	public void Set_Gender(String gender)
	{
		if(gender.contains("Female"))
		{
		Female_Option.click();
		}
		else 
		{
		Male_Option.click();
		}		
		}

///////	
	@AndroidFindBy(id="android:id/text1")
	private WebElement Entertext;
	
	public void Set_Text(String Entertext)
	{
		nameField.sendKeys(Entertext);
	
		
	}
	
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));

// @AndroidFindBy(uiAutomator = )
	public void countery_selection(String countery_selection)
	{
		Entertext.click();
		scrollToText(countery_selection);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		
	}
	
	
	
		
	}
