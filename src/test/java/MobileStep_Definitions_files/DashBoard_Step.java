package MobileStep_Definitions_files;

import Common_Utilities.Driver_Factory;
import Common_Utilities.Extent_ReportManger;
import MobileApp_Screens_Files.DashBoardPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DashBoard_Step  {
	
	DashBoardPage DBP = new DashBoardPage(Driver_Factory.getAppiumDriver());
	
	@When("User is on dashboard page and press mainu button")
	public void user_is_on_dashboard_page_and_press_mainu_button() {
		
		Extent_ReportManger.logInfo("Checking mainu button is diplayed...");
		DBP.clickOn_MainuBtn();
		Extent_ReportManger.logInfo("Mainu button is displayed.");
	   
	}

	@When("Check the below menation all the mainu items are avalible")
	public void check_the_below_menation_all_the_mainu_items_are_avalible(DataTable dataTable) {
		
		Extent_ReportManger.logInfo("Checking all mainu options are diplayed...");
		DBP.getmainu_Options();
		Extent_ReportManger.logInfo("All mainu options are diplayed.");
		
	  
	}
	
	

}
