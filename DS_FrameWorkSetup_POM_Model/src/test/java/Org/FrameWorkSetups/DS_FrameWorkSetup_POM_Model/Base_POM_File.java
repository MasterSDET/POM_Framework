    package Org.FrameWorkSetups.DS_FrameWorkSetup_POM_Model;



	import java.net.MalformedURLException;
	import java.net.URL;
	import java.time.Duration;
	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.AndroidDriver;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.RemoteWebElement;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.google.common.collect.ImmutableMap;

import Utility.Android_Action;
import io.appium.java_client.android.options.UiAutomator2Options;
	    
	import io.appium.java_client.service.local.AppiumServiceBuilder;
	 
	    
	public class Base_POM_File extends Android_Action
	{
	
	public static AndroidDriver driver;


	@BeforeClass
	public void Apps () throws MalformedURLException
	{		
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Test_Device2");
		options.setUdid("RZ8R22L5RQV");
		options.setPlatformName("Android");
		options.setPlatformVersion("12");
		options.setChromedriverExecutable("//Users//mohitgaur//Downloads//chromedriver");
		options.setAppPackage("com.androidsample.generalstore");
		options.setAppActivity("com.androidsample.generalstore.SplashActivity");
		

		 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);


	}		
	}

	    
	  
		


