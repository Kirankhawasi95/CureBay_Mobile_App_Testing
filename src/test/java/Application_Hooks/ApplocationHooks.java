package Application_Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Common_Utilities.ConfigReader;
import Common_Utilities.Driver_Factory;
import Common_Utilities.Extent_ReportManger;
import Common_Utilities.ScreenShoot_Utlities;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplocationHooks {

	private static ConfigReader ConfigReader;
	private Driver_Factory driver_Factory;
	private static ThreadLocal<AppiumDriver> driver;
	
//	 private static String testCaseName = null;
//	    private static ExtentTest extentLogger = null;
//	    private static ExtentReports extent = null;
//	    private static Logger logger = null;

	

	@Before(order = 1)
	public void getProperty() {
		ConfigReader = new ConfigReader();
		ConfigReader.init_PropFile();
	}

	@Before(order = 1)
	public void launchApplication(Scenario scenario) {
		
		
		System.out.println("+++++++++Before Hooks++++++");
		System.out.println("Scenario Name is===>" + "  " + scenario.getName());
		driver_Factory = new Driver_Factory();
		

		String platformName = Common_Utilities.ConfigReader.getPlatFormtype();
		String udidName = Common_Utilities.ConfigReader.getUdidFormtype();
		String systemPortName = Common_Utilities.ConfigReader.getSystemPostFormtype();
		String deviceName = Common_Utilities.ConfigReader.getDeviceFormtype();

		driver = Driver_Factory.setMobileDrivers(platformName, udidName, systemPortName, deviceName);
		Extent_ReportManger.startTest(scenario.getName(), "Sanity");
		
//			 testCaseName = scenario.getName();
//	        extent = Extent_ReportManger.getReporter();
//	        extentLogger = Extent_ReportManger.getLogger(testCaseName);
//	        logger = Logger.getLogger(scenario.getClass().getName());

	}

//	@After(order = 0)
//	public void quitDriver() {
//		if (driver != null && driver.get() != null) {
//			driver.get().quit();
//		}
//	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		System.out.println("scenario Name is===>" + "  " + scenario.getName() + "  " + "And Scenario status is ======>"
				+ scenario.getStatus());
		
		
		if(scenario.isFailed())
		{
			ScreenShoot_Utlities.CaptureScreen1(scenario.getName());
			Driver_Factory.getInstance();
			byte[] Sourcefile = ((TakesScreenshot) Driver_Factory.getAppiumDriver()).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(Sourcefile, "image/png", scenario.getName());
		}
		
//		if (driver != null && driver.get() != null) {
//			driver.get().quit();
//		}

	}
	

}
