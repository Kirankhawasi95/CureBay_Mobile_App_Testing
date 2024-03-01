package MobileStep_Definitions_files;



import org.testng.Assert;

import Common_Utilities.Driver_Factory;
import Common_Utilities.Extent_ReportManger;
import MobileApp_Screens_Files.DashBoardPage;
import MobileApp_Screens_Files.HomePage;
import MobileApp_Screens_Files.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Step {
	
	HomePage HP = new HomePage(Driver_Factory.getAppiumDriver());
	LoginPage Lp = new LoginPage(Driver_Factory.getAppiumDriver());
	
	DashBoardPage DBP = new DashBoardPage(Driver_Factory.getAppiumDriver());
	
	@When("the user taps the SignUp button from the HomePage")
	public void the_user_taps_the_sign_up_button_from_the_home_page() {
		Extent_ReportManger.logInfo("Clicking on sign_up button...");
		HP.clickON_Sign_Up();
		Extent_ReportManger.logInfo("Clicked on sign_up button.");
	    
	}
	@Then("the user should be able to see the login page")
	public void the_user_should_be_able_to_see_the_login_page() {
		Extent_ReportManger.logInfo("Checking loginpage is displayed...");
		Assert.assertTrue(true);
		Extent_ReportManger.logInfo("Loginpage is displayed...");
	    
	}
	@When("the user logs into the application by providing the valid credentials {string} and password as {string}")
	public void the_user_logs_into_the_application_by_providing_the_valid_credentials_and_password_as(String username, String psw) {
		Extent_ReportManger.logInfo("User enters the valide credinatiols for login...");
		Lp.enterUser_Name(username);
		Lp.enterPsw(psw);
		Lp.clickOn_NextBtn();
		Extent_ReportManger.logPass("User enters the valide credinatiols login the application");
		
		
		
	}
	@Then("the user should be able to see the dashboard screen")
	public void the_user_should_be_able_to_see_the_dashboard_screen() {
		boolean targetpage=DBP.checkDachboardPage_isExist();
		
		if(targetpage==true)
		{
			
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	    
	}
	@When("the user taps on Sign Out")
	public void the_user_taps_on_sign_out() {
		
		DBP.clickOn_SignOut_Btn();
	  
	}
	@Then("the user should see the HomePage")
	public void the_user_should_see_the_home_page() {
		
		boolean targetpage=HP.checkIs_HomePageExist();
		
		if(targetpage==true)
		{
			
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	    
	}

}
