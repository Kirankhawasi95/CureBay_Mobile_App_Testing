/**
 * 
 */
package TestRunner_File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Common_Utilities.ConfigReader;
import FrameWork_Constants.FW_Constants;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 */

@CucumberOptions
		(features = { FW_Constants.LoginPage,FW_Constants.DashBoard }, 
					
glue = { "MobileStep_Definitions_files","Application_Hooks" }, 
					plugin = { 
							"pretty", "json:Execution_Reports/Mobile_Reports/Mobilecucumber.json",
							"html:Execution_Reports/Mobile_Reports/cucumberMobile.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" 
							},
					tags = "@Sanity", monochrome = true, dryRun = false

)

public class Mobile_Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@Parameters({ "platform", "udidType", "systemPort", "deviceName" })
	@BeforeClass
	public void DefineDriver(String platform, String udidType, String systemPort, String deviceName) {

		if (!platform.equals("param_value_notfound")) {
			ConfigReader.setPlatFormtype(platform);
			ConfigReader.setUdidFormtype(udidType);
			ConfigReader.setSystemPostFormtype(systemPort);
			ConfigReader.setDeviceFormtype(deviceName);
			// ConfigReader.SetDriverType(driver);

		}
	}
}
