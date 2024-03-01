package MobileApp_Screens_Files;

import java.util.List;

import org.openqa.selenium.WebElement;

import MobileAction_File.MobileActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashBoardPage extends BasePage_Screen {
	MobileActions action=new MobileActions();
	
	

	public DashBoardPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Dashboard']")
	public WebElement dashboard;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='L']")
	public WebElement sign_out;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign Out']")
	public WebElement signout;
	
	@AndroidFindBy(xpath="//android.widget.Button[@index='0']")
	public WebElement mainuBtn;
	
	@AndroidFindBy(className="//android.widget.Button[@index='0']")
	public List<WebElement> allOptions; 
	
	
	
	public boolean checkDachboardPage_isExist() 
	{
		//return action.isDisplayed(dashboard);
		return dashboard.isDisplayed();
	}
	
	
	public void  clickOn_SignOut_Btn()
	{
		
		
		action.Click(sign_out, "Clicked");
		action.Click(signout, "Clicked");
	
	}
	
	public boolean clickOn_MainuBtn()
	{
		boolean btn=mainuBtn.isDisplayed();
		mainuBtn.click();
		return btn;
	}
	
	public void getmainu_Options()
	{
		System.out.println("All Mainu options are:"+allOptions);
		
		for (WebElement text:allOptions)
			
		{
			System.out.println("All Mainu options are:"+text.getText());
		}
		
		
	}
	
	
	
	
	

}
