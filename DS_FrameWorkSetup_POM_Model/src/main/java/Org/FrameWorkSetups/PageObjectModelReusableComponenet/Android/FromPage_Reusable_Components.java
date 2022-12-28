package Org.FrameWorkSetups.PageObjectModelReusableComponenet.Android;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FromPage_Reusable_Components
{
	
 AndroidDriver drvier;

	public FromPage_Reusable_Components(AndroidDriver driver) //constructor this one time in POM Config
	{
		super();
		this.drvier = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		} 
	
		// 1st element
	// driver.findElement(By.id("com.androidsample.generalstore:id/nameField"))
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	
	//2nd element
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	private WebElement Female_Option;
	// driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	
	
	//now we are using send key & click operation on above ids
	
	public void Set_Name_Field_opration()
	{
		nameField.sendKeys("Mohit");
		Female_Option.click();
		
	}
	
}