/**
 * 
 */
package Common_Utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import FrameWork_Constants.FW_Constants;
import io.appium.java_client.AppiumDriver;

/**
 * 
 */
public class Extent_ReportManger implements ITestListener{

	public static ExtentReports extent;
	public static Map<Long, ExtentTest> testMap = new HashMap<>();
	public static Map<String, ExtentTest> extentMap = new HashMap<>();
	private static ThreadLocal<AppiumDriver> driver;
	//public static ThreadLocal <ExtentTest> testMap = new ThreadLocal <ExtentTest>();
	
	 private static ExtentTest logger;
	

    public  static  void startReport() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();

			ExtentSparkReporter spark;
			spark = new ExtentSparkReporter(FW_Constants.extent_reportPath);
			extent.attachReporter(spark);

			extent.attachReporter(spark);
			spark.config().setReportName("CueBay Medicare App Test Report");
			extent.setSystemInfo("System", "Windows");
			extent.setSystemInfo("Author", "Kiran");
			extent.setSystemInfo("Build#", "1.1");
			extent.setSystemInfo("Team", "Tesing");
			extent.setSystemInfo("Customer Name", "NAL");
			spark.config().setDocumentTitle("CueBay_Medicare Mobile Report");

		}
		
	}
	
	public static void startTest(String testName, String categories) {
	    if (extent == null) {
	    	startReport(); // Initialize extent if it's null
	    }

	    if (extentMap.containsKey(testName)) {
	        ExtentTest existingTest = extentMap.get(testName);
	        if (existingTest != null) {
	            extent.removeTest(existingTest);
	        }
	        testName = "Rerun - " + testName;
	    }

	    ExtentTest test = extent.createTest(testName);
	    test.assignCategory(categories);
	    testMap.put(Thread.currentThread().getId(), test);
	    //testMap.set(Thread.currentThread().getId(), test);
	    extentMap.put(testName, test);
	}
	
//	 /**
//     * This method is used to get the extent logger for specific test case
//     * @param scenario - currently executing test case name
//     * @return - it returns instance of ExtentTest Class
//     */
//    public synchronized static ExtentTest getLogger(String testCaseName){
//        try{
//            logger = getReporter().createTest(testCaseName);
//        }catch (Exception Ex){
//            Ex.printStackTrace();
//        }
//        return logger;
//    } 

	
	@Override
	public synchronized void onFinish(ITestContext context) {
		System.out.println(("Test Suite is ending!"));
		extent.flush();
		Driver_Factory.getInstance().getAppiumDriver().quit();

	
	}
	
	

	@Override
	public synchronized void onTestStart(ITestResult result) {
		System.out.println("+++++++++++++++++++onTestStart++++++++++++++++++");
		
		//Extent_ReportManger.logInfo("+++++++++++++++++++onTestStart++++++++++++++++++");
//		Extent_ReportManger.logInfo(result.getThrowable().getMessage());
	}

	
	public synchronized void onTestFailure(ITestResult result) {
		
		Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(
				ScreenShoot_Utlities.CaptureScreen(Driver_Factory.getInstance().getAppiumDriver())).build();
		getCurrentTest().fail("", mediaModel);
		
		Extent_ReportManger.logFail(result.getThrowable().getMessage());
		
	}

	public synchronized void onTestSkipped(ITestResult result) {
		
	}

	public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
	}
	
	
	
	
	
	public static void logPass(String message) {
		getCurrentTest().log(Status.PASS, message);

	}

	public static void logFail(String message) {
		getCurrentTest().log(Status.FAIL, message);
	}

	public static void logInfo(String message) {
		getCurrentTest().log(Status.INFO, message);

	}

	public static void logInfoAPIWEB(String message) {
		getCurrentTest().log(Status.INFO, message);

	}

	public static void endCurrentTest() {
		getCurrentTest().getExtent().flush();

		testMap.remove(Thread.currentThread().getId());
	}

	public static ExtentTest getCurrentTest() {
		return testMap.get(Thread.currentThread().getId());

	}

	public static void endReport() {

		extent.flush();
	}

	
}
