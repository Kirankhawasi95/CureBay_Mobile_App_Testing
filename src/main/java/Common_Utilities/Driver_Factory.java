package Common_Utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import FrameWork_Constants.FW_Constants;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;

public class Driver_Factory {

	private static Driver_Factory instance = null;
	private static ThreadLocal<AppiumDriver> appiumdriver = new ThreadLocal<AppiumDriver>();
	static String MobileexecutionType = "Android";

	public Driver_Factory() {

	}

	public static Driver_Factory getInstance() {
		if (instance == null) {
			instance = new Driver_Factory();
		}
		return instance;
	}

	public static AppiumDriver getAppiumDriver() {
		return appiumdriver.get();

	}

//Set the Desired capabilities for Android and iOS Mobile Driver 

	@SuppressWarnings("deprecation")
	public static ThreadLocal<AppiumDriver> setMobileDrivers(String platform, String UDID, String systemport, String deviceName) {
		System.out.println("Mobile driver is:" + platform);

		if (MobileexecutionType.contains("Android"))

		{
			String[] platformInfo = platform.split(" ");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("AUTOMATION_NAME", "uiAutomator2");
			capabilities.setCapability("platformName", platform);
			// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// platformInfo[1]);
			capabilities.setCapability("DEVICE_NAME", deviceName);
			capabilities.setCapability("UDID", UDID);
//			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

//		    capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

			//capabilities.setCapability("app",FW_Constants.appLocation);
			capabilities.setCapability("adbExecTimeout", 60000);
			capabilities.setCapability("appPackage", "com.curebay.medicare");
			capabilities.setCapability("appActivity", "com.curebay.medicare.MainActivity");
			capabilities.setCapability("resetKeyboard", true);
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("ORIENTATION", "PORTRAIT");
			capabilities.setCapability("NO_RESET", true);

			try {
				appiumdriver.set(new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			getAppiumDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else if (MobileexecutionType.contains("iOS")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("PLATFORM_NAME", platform);
			// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// deviceVersion);
			capabilities.setCapability("DEVICE_NAME", deviceName);
			capabilities.setCapability("UDID", UDID);
			capabilities.setCapability("FULL_RESET", true);
			
			capabilities.setCapability("Connect Hardware Keyboard", true);
			capabilities.setCapability("AUTOMATION_NAME", "XCUITest");
			capabilities.setCapability("SUPPORTS_LOCATION_CONTEXT", true);
			//capabilities.setCapability("app",FW_Constants.appLocation);

			try {
				appiumdriver.set(new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			getAppiumDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		return appiumdriver;

	}

}
