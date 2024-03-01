package Common_Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;

public class ScreenShoot_Utlities {
	
	
	public static String CaptureScreen(AppiumDriver scenario) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String destFile = System.getProperty("user.dir") + "\\Screenshoot\\" + scenario + "_" + timeStamp + ".png";

		byte[] sourcePath1 = ((TakesScreenshot) Driver_Factory.getInstance().getAppiumDriver())
				.getScreenshotAs(OutputType.BYTES);
		
		
		//ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(destFile);
		
		String base64Path = Base64.getEncoder().encodeToString(sourcePath1);

		try (FileOutputStream fos = new FileOutputStream(destFile)) {
			fos.write(sourcePath1);
		} catch (IOException e) {
			e.printStackTrace(); // Handle the exception appropriately
		}
		return base64Path ;

	}

	public static void CaptureScreen1(String scenario) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String destFile = System.getProperty("user.dir") + "\\Screenshoot\\" + scenario + "_" + timeStamp + ".png";

		byte[] sourcePath1 = ((TakesScreenshot) Driver_Factory.getInstance().getAppiumDriver())
				.getScreenshotAs(OutputType.BYTES);

		//ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromPath(destFile);

		String base64Path = Base64.getEncoder().encodeToString(sourcePath1);

		try (FileOutputStream fos = new FileOutputStream(destFile)) {
			fos.write(sourcePath1);
		} catch (IOException e) {
			e.printStackTrace(); // Handle the exception appropriately
		}
	}

}
