package MobileApp_Screens_Files;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage_Screen{
	
	//public AppiumDriver driver;
	
//	Driver_Factory context = Driver_Factory.getPage();
//	
//	Page page = Driver_Factory.getPage();
	
	
public HomePage(AppiumDriver driver) {
		
		super(driver);
		
		
	}

	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Login / Sign-up']")
	public WebElement Sign_Up;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign Up Now']")
	public WebElement checkHomepage;
	
	
	
	 public void clickON_Sign_Up()
	 {
		 //action.Click(Sign_Up, "Clicked on sign up butten");
		 Sign_Up.click();
		 
	 }
	
	public boolean checkIs_HomePageExist()
	{
		return checkHomepage.isDisplayed();
	}


}

