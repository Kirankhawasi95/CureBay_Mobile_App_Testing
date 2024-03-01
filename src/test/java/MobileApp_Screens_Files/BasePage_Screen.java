/**
 * 
 */
package MobileApp_Screens_Files;

import org.openqa.selenium.support.PageFactory;

import MobileAction_File.MobileActions;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * 
 */
public class BasePage_Screen {
	
	public static AppiumDriver appiumdriver;
	MobileActions action=new MobileActions();
	
	
	
	public BasePage_Screen(AppiumDriver driver)
	{
		this.appiumdriver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
