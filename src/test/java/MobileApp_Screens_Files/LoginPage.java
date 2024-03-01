package MobileApp_Screens_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import MobileAction_File.MobileActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage_Screen {
	
	MobileActions action=new MobileActions();

	public LoginPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text='Email or Mobile Number']")
	public WebElement username;
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text='Enter Password']")
	public WebElement password;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='7']")
	public WebElement clickNextBtn;
	
	
	 public void enterUser_Name(String username1)
	 {
		 action.sendKeys(username, username1);
		 //action.sendKeys(username, username1);
		// username.sendKeys(username1);
		 
		
	 }
	 
	 public void enterPsw(String Psw)
	 {
		 action.sendKeys(password, Psw);
		// password.sendKeys(Psw);
	 }
	 
	 public void clickOn_NextBtn()
	 {
		 action.Click(clickNextBtn, "Succussfully clicked");
		 //clickNextBtn.click();
	 }

}
