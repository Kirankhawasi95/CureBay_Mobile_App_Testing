package MobileAction_File;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common_Utilities.Driver_Factory;
import Common_Utilities.Extent_ReportManger;

public class MobileActions {

	Actions action = new Actions(Driver_Factory.getInstance().getAppiumDriver());

//	/**
//	 * =============================================================================
//	 * Method: waitForVisible | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method wait for element it will check every 5 sec its present or not until 60
//	 * sec | Parameters: locator | Return: element
//	 * =============================================================================
//	 */
//
	@SuppressWarnings("deprecation")
	public WebElement waitForVisible(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(Driver_Factory.getInstance().getAppiumDriver(), Duration.ofSeconds(10));
		//wait.pollingEvery(1, TimeUnit.SECONDS);
		return wait.until(ExpectedConditions.visibilityOf(locator));
	}

	public void waitForElement(By locator, Duration time) {
		WebDriverWait wait = new WebDriverWait(Driver_Factory.getInstance().getAppiumDriver(), time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
//
//	/**
//	 * =============================================================================
//	 * Method: Click | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * click on element | Parameters: locator, info | Return: none
//	 * =============================================================================
//	 */
	public void Click(WebElement locator, String info) {
		WebElement elm = waitForVisible(locator);
		elm.click();
		Extent_ReportManger.logInfo("Successfully clicked on - " + " <b style=\"color:green;\"> : " + info + "</b>");
		System.out.println("Successfully clicked on - " + info);
		Extent_ReportManger.logInfo("Successfully clicked on -"+ info);
	}
//
//	public void Clickoperation(By locator, String info) {
//		WebElement elm = waitForVisible(locator);
//		if (elm != null) {
//			elm.click();
//			//ReportManager.logInfo("Successfully clicked on - " + info);
//			System.out.println("Successfully clicked on - " + info);
//		} else
//			//ReportManager.logInfo("Not Successfully clicked on - " + info);
//		System.out.println("Not successfuly clicked on- " + info);
//
//		// LogClass.loginfo("Successfully clicked on -"+ info);
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: VerifyHomeScreen | Author: Ram | Date:9 Mar 2022 | Description: This
//	 * method verify an element in HomeScreen | Parameters: locator, info | Return:
//	 * isSearch
//	 * =============================================================================
//	 */
//
//	public boolean isDisplayed(WebElement locator) throws InterruptedException {
//		boolean eleSelected = Driver_Factory.getInstance().getAppiumDriver().findElement(locator).size() > 0;
//		return eleSelected;
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: verifyText | Author: Ram | Date:9 Mar 2022 | Description: This method
//	 * verifies text and asserts | Parameters: actualText, expectedText |
//	 * Return:None
//	 * =============================================================================
//	 */
//
	public void verifyText(String actualText, String expectedText) {
		Extent_ReportManger.logInfo("Actual Text - " + " <b style=\"color:green;\"> : " + actualText + "</b>");
		Extent_ReportManger.logInfo("Expected Text - " + " <b style=\"color:green;\"> : " + expectedText + "</b>");
		System.out.println("Actual Text - " + actualText);
		System.out.println("Expected Text - " + expectedText);
		assertEquals(actualText, expectedText);
	}

//	/**
//	 * =============================================================================
//	 * Method: VerifyText | Author: Ram | Date:9 Mar 2022 | Description: This method
//	 * verifies text | Parameters: actualText, expectedText | Return:None
//	 * =============================================================================
//	 */
//
////	public static void VerifyText(String actualText, String expectedText) {
////		if (actualText.contains(expectedText)) {
////			ReportManager.logPass("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
////					+ " matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
////		} else {
////			ReportManager.logFail("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>"
////					+ " not matched with expected " + "<b style=\"color:green;\">" + expectedText + "</b>");
////			assertEquals(expectedText, actualText);
////		}
////	}
//
//	public void Send(String value) {
//
//		Actions action = new Actions(Driver_Factory.getInstance().getMobileDriver());
//		action.sendKeys(value).perform();
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: sendKeys | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * enter text input text using element | Parameters: locator, text | Return:
//	 * none
//	 * =============================================================================
//	 */
	public void sendKeys(WebElement locator, String text) {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(text);
		Extent_ReportManger.logInfo("Successfully Entered text - " + text + "</b>");
		System.out.println("Successfully Entered text - " + text);
	}
//
//	/**
//	 * =============================================================================
//	 * Method: isElementPresent | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method enter text input text using element | Parameters: locator, text |
//	 * Return: none
//	 * =============================================================================
//	 */
//	public boolean isElementPresent(By locator) {
//		WebDriverWait wait = new WebDriverWait(Driver_Factory.getInstance().getMobileDriver(), 5);
//		boolean isDone = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//		return isDone;
//
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: sendKeys | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * enter text input text using element | Parameters: locator, text | Return:
//	 * none
//	 * =============================================================================
//	 */
//	public void sendKeys(By locator, String text, String info) {
//		WebElement elm = waitForVisible(locator);
//		elm.click();
//		elm.sendKeys(text);
//		//ReportManager.logInfo(info + " <b style=\"color:green;\"> : " + text + "</b>");
//		//ReportManager.logInfo("Successfully Entered text - " +"<b style=\"color:green;\">" + text + "</b>");
//		System.out.println("Successfully Entered text - " + text);
//		// LogClass.loginfo(info+" :"+text);
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: clearAndSendKeys | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method clear text in text box after that enter text using element |
//	 * Parameters: locator, text | Return: none
//	 * =============================================================================
//	 */
//	public void clearAndSendKeys(By locator, String text) {
//		WebElement elm = waitForVisible(locator);
//		elm.clear();
//		elm.sendKeys(text);
//		//ReportManager.logInfo("Successfully Entered text -<b style=\"color:green;\"> " + text + "</b>");
//
//		// LogClass.loginfo("Successfully Entered text - " + text);
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: clearAndSendKeys | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method clear text in text box after that enter text using element |
//	 * Parameters: locator, text | Return: none
//	 * =============================================================================
//	 */
//	public void clearAndSendKeys(By locator, String text, String info) {
//		WebElement elm = waitForVisible(locator);
//		elm.clear();
//		elm.sendKeys(text);
//		//ReportManager.logInfo(info + "<b style=\"color:green;\"> :" + text + "</b>");
//		
//		// LogClass.loginfo(info+" : " + text);
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: getText | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * get the text of element | Parameters: locator | Return: elmText
//	 * =============================================================================
//	 */
//	public String getText(By locator) {
//		WebElement elm = waitForVisible(locator);
//		String elmText = elm.getText();
//		//ReportManager.logInfo("Successfully get text - <b style=\"color:green;\">" + elmText + "</b>");
//		System.out.println("Successfully get text - " + elmText);
//		//LogClass.loginfo("Successfully get text - " + elmText);
//		return elmText;
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: getText | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * get the text of element | Parameters: locator | Return: elmText
//	 * =============================================================================
//	 */
//	public String getText(By locator, String info) {
//		WebElement elm = waitForVisible(locator);
//		String elmText = elm.getText();
//		//ReportManager.logInfo("" + info + "<b style=\"color:green;\"> :" + elmText + "</b>");
//		// LogClass.loginfo(""+info+" : " + elmText);
//		return elmText;
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: swipeUp | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * swipe up in mobile using touch action and enter int value number of times it
//	 * should swipe| Parameters: howManySwipes | Return: none
//	 * =============================================================================
//	 */
//	public void swipeUp(int howManySwipes) {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
//						.perform();
//				System.out.println("swipeUp");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: swipeDown | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * swipe down in mobile using touch action and enter int value number of times
//	 * it should swipe| Parameters: howManySwipes | Return: none
//	 * =============================================================================
//	 */
//	public void swipeDown(int howManySwipes) {
//		// calculate coordinates for vertical swipe
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, endY)).moveTo(PointOption.point(startX, startY)).release()
//						.perform();
//				System.out.println("swipeDown");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//
//	public void swipeDowns(int howManySwipes) {
//		// calculate coordinates for vertical swipe
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		int startY = (int) (size.height * 0.80);
//		int endY = (int) (size.height * 0.40);
//		int startX = (size.width / 2);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, endY)).moveTo(PointOption.point(startX, startY)).release()
//						.perform();
//				System.out.println("swipeDown");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: swipeRighttoLeft | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method swipe right to left in mobile using touch action and enter int value
//	 * number of times it should swipe| Parameters: howManySwipes | Return: none
//	 * =============================================================================
//	 */
//	public void swipeRighttoLeft(int howManySwipes) {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for horizontal swipe
//		int startY = (int) (size.height / (size.height / 5));
//		int startX = (int) (size.width * 0.90);
//		int endX = (int) (size.width * 0.10);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release()
//						.perform();
//				System.out.println("swipeRighttoLeft");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: swipeLefttoRight | Author: Ram | Date:16 Jan 2020 | Description: This
//	 * method swipe left to right in mobile using touch action and enter int value
//	 * number of times it should swipe| Parameters: howManySwipes | Return: none
//	 * =============================================================================
//	 */
//	public void swipeLefttoRight(int howManySwipes) {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for horizontal swipe
//		int startY = (int) (size.height / (size.height / 1.2));
//		int startX = (int) (size.width * 0.05);
//		int endX = (int) (size.width * 0.90);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release()
//						.perform();
//				System.out.println("swipeLefttoRight");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: swipeUp_FindElementClick | Author: Ram | Date:16 Jan 2020 |
//	 * Description: This method will swipe till element found and click| Parameters:
//	 * howManySwipes, locator | Return: none
//	 * =============================================================================
//	 * 
//	 * @param string
//	 */
//	public void swipeUp_FindElementClick(int howManySwipes, By locator) throws InterruptedException {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				if (isElmPresent) {
//					Driver_Factory.getInstance().getMobileDriver().findElement(locator).click();
//					break;
//				}
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
//						.perform();
//				System.out.println("swipeUp");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//	public void swipeUp_FindElementClick(int howManySwipes, By locator ,String info) throws InterruptedException {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				if (isElmPresent) {
//					Driver_Factory.getInstance().getMobileDriver().findElement(locator).click();
//					//ReportManager.logInfo("Successfully clicked on - " + " <b style=\"color:green;\"> : " + info + "</b>");
//					System.out.println("Successfully clicked on - " + info);
//					break;
//				}
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
//						.perform();
//				System.out.println("swipeUp");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//	
//
//	public void swipeUp_FindElement(int howManySwipes, By locator) throws InterruptedException {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				if (isElmPresent) {
//					// DriverFactory.getInstance().getMobileDriver().findElement(locator).click();
//					break;
//				}
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
//						.perform();
//				System.out.println("swipeUp");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//	
//	public String swipeUp_FindElementGetText(int howManySwipes, By locator) throws InterruptedException {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		String text = null;
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				System.out.println(isElmPresent);
//				if (isElmPresent) {
//					text = Driver_Factory.getInstance().getMobileDriver().findElement(locator).getText();
//					//ReportManager.logInfo("Successfully get text - <b style=\"color:green;\">" + text + "</b>");
//					System.out.println("Successfully get text - " + text);
//					break;
//				}
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
//						.perform();
//				System.out.println("swipeUp");
////				if (isElmPresent) {
////					text = DriverFactory.getInstance().getMobileDriver().findElement(locator).getText();
////					break;
////				}
//
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//		return text;
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: pressKeyboardValues | Author: Ram | Date:16 Jan 2020 | Description:
//	 * This method meant for static wait | Parameters: locator, text | Return: none
//	 * =============================================================================
//	 * 
//	 * @throws InterruptedException
//	 */
//	
//	
//	public void pressKeyboardValues(Keys value) throws InterruptedException {
//		action.sendKeys(value).build().perform();
//		//ReportManager.logInfo("Successfully performed keyboard action - <b style=\"color:green;\">" + value + "</b>");
//		// LogClass.loginfo("Successfully performed keyboard action - " + value);
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: rightToLeftSwipeUsingElement | Author: Ram | Date:16 Jan 2020 |
//	 * Description: This method right To Left Swipe Using Element | Parameters:
//	 * locator, text | Return: none
//	 * =============================================================================
//	 * 
//	 * @param fromLocator
//	 * @param toLocator
//	 * 
//	 * @throws InterruptedException
//	 */
//	public void rightToLeftSwipeUsingElement(By fromLocator, By toLocator) throws InterruptedException {
//		List<WebElement> from_Location = Driver_Factory.getInstance().getMobileDriver().findElements(fromLocator);
//		List<WebElement> to_Location = Driver_Factory.getInstance().getMobileDriver().findElements(toLocator);
//		int startX = from_Location.get(0).getLocation().getX() + (from_Location.get(0).getSize().getWidth() / 2);
//		int startY = from_Location.get(0).getLocation().getY() + (from_Location.get(0).getSize().getHeight() / 2);
//		int endX = to_Location.get(0).getLocation().getX() + (to_Location.get(0).getSize().getWidth() / 2);
//		int endY = to_Location.get(0).getLocation().getY() + (to_Location.get(0).getSize().getHeight() / 2);
//		new TouchAction(Driver_Factory.getInstance().getMobileDriver()).press(point(startX, startY))
//				.waitAction(waitOptions(ofMillis(1000))).moveTo(point(endX, endY)).release().perform();
//
//	}
//
//	
//	
//	/**
//	 * =============================================================================
//	 * Method: rightToLeftSwipeUsingElement | Author: Ram | Date:16 Jan 2020 |
//	 * Description: This method right To Left Swipe Using Element | Parameters:
//	 * locator, text | Return: none
//	 * =============================================================================
//	 * 
//	 * @param fromLocator
//	 * @param toLocator
//	 * 
//	 * @throws InterruptedException
//	 */
//	public void rightToLeftSwipeUsingWebElement(WebElement fromLocator, WebElement toLocator)
//			throws InterruptedException {
//		System.out.println(" swip element");
//		System.out.println("fromLocator" + fromLocator);
//		System.out.println("to locator" + toLocator);
//
//		WebElement from_Location = fromLocator;
//		WebElement to_Location = toLocator;
//		int startX = from_Location.getLocation().getX() + (from_Location.getSize().getWidth() / 2);
//		int startY = from_Location.getLocation().getY() + (from_Location.getSize().getHeight() / 2);
//		int endX = to_Location.getLocation().getX() + (to_Location.getSize().getWidth() / 2);
//		int endY = to_Location.getLocation().getY() + (to_Location.getSize().getHeight() / 2);
//		new TouchAction(Driver_Factory.getInstance().getAppiumDriver())).press(point(startX, startY))
//				.waitAction(waitOptions(ofMillis(1000))).moveTo(point(endX, endY)).release().perform();
//
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: getText | Author: Ram | Date:16 Jan 2020 | Description: This method
//	 * get the text of element | Parameters: locator | Return: elmText
//	 * =============================================================================
//	 */
//	public int getTextByInt(By locator) {
//		WebElement elm = waitForVisible(locator);
//		String elmText = elm.getText();
//		int elmIntTxt = Integer.parseInt(elmText);
//		//ReportManager.logInfo("Successfully get Integer text - <b style=\"color:green;\">" + elmIntTxt + "</b>");
//		System.out.println("Successfully get Integer text- " + elmIntTxt);
//		return elmIntTxt;
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: isDisplyed | Author: Ram | Date:28 Jan 2022 | Description: This
//	 * method get the text of element | Parameters: locator | Return: elmText
//	 * =============================================================================
//	 */
	public boolean isDisplyed(WebElement locator, String info) throws IOException {
		WebElement elm = waitForVisible(locator);
		boolean isDisplyed = elm.isDisplayed();

		if (isDisplyed) {
			//ReportManager.logInfo("Sucessfully displyed: " + info);
		} else {
			//ReportManager.logFail("Sucessfully not displyed: " + info);
		}
		return isDisplyed;
	}
//
//	/**
//	 * =============================================================================
//	 * Method: verifyText | Author: Ram | Date:28 Jan 2022 | Description: This
//	 * method verify the text of element | Parameters: locator | Return: elmText
//	 * =============================================================================
//	 */
//
//	/**
//	 * =============================================================================
//	 * Method: clickUsingCoordinates | Author: Ram | Date:16 Jan 2020 | Description:
//	 * This method right To Left Swipe Using Element | Parameters: locator, text |
//	 * Return: none
//	 * =============================================================================
//	 * 
//	 * @param xcordinate
//	 * @param ycordinate
//	 * 
//	 * @param fromLocator
//	 * @param toLocator
//	 * 
//	 * @throws InterruptedException
//	 */
//	public void clickUsingCoordinates(int xcordinate, int ycordinate) throws InterruptedException {
//		new TouchAction(Driver_Factory.getInstance().getMobileDriver()).tap(PointOption.point(xcordinate, ycordinate))
//				.release().perform();
//	}
//
//	/**
//	 * =============================================================================
//	 * Method: getElementSizeUsingFindElements | Author: Ram | Date:16 Jan 2020 |
//	 * Description: This method returns size of elements by using findelements |
//	 * Parameters: locator, text | Return: none
//	 * =============================================================================
//	 * 
//	 * @param size
//	 * @param locator
//	 * @param xcordinate
//	 * @param ycordinate
//	 * 
//	 * @param fromLocator
//	 * @param toLocator
//	 * 
//	 * @throws InterruptedException
//	 */
	public List<WebElement> getElementSizeUsingFindElements(By locator) throws InterruptedException {
		List<WebElement> lst_Elm = Driver_Factory.getInstance().getAppiumDriver().findElements(locator);
		//ReportManager.logInfo("Successfully captured elemnt size is - " + lst_Elm.size());
		for (int iterator = 0; iterator < lst_Elm.size(); iterator++) {
			System.out.println("List of elements: " + lst_Elm.get(iterator).getText());
		}
		return lst_Elm;
	}
//
//	public void longpressactions(By locator) throws Exception {
////		new TouchAction(DriverFactory.getInstance().getMobileDriver()).longPress(new LongPressOptions()
////		.withElement(ElementOption.element(mWebElement)).withDuration(Duration.ofMillis(100000))).release()
////		.perform();
//
////		WebElement mWebElement = DriverFactory.getInstance().getMobileDriver().findElement(locator);
////		new TouchAction(LocalDriverManager.getAppiumDriver()).longPress(new PointOption().point(x,y)).waitAction(WaitOptions.waitoptions(Duration.ofSeconds(3))).release().perform();
////		TimeUnit.SECONDS.sleep(1);
//
//		WebElement mWebElement = Driver_Factory.getInstance().getMobileDriver().findElement(locator);
//
//		new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//				.longPress(new ElementOption().withElement(mWebElement))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release().perform();
//		Thread.sleep(3000);
////		new TouchAction(DriverFactory.getInstance().getMobileDriver()).longPress(new ElementOption().withElement(mWebElement))
////		.release().perform();
////		Thread.sleep(3000);
//
//	}
//
//	public void Touch(By locator, String info) {
//
//		Actions action = new Actions(Driver_Factory.getInstance().getMobileDriver());
//		action.clickAndHold().release().perform();
//	}
//
//	public boolean isEnabled(By locator, String info) {
//		WebElement elm = waitForVisible(locator);
//		boolean isEnable = elm.isEnabled();
//		if (isEnable) {
//			//ReportManager.logInfo("Element Enabled: " + "<b style=\"color:green;\">" + info + "</b>");
//			System.out.println("Element Enabled: " + info);
//		} else {
//			//ReportManager.logInfo("Element Disabled: " + "<b style=\"color:green;\">" + info + "</b>");
//			System.out.println("Element Disabled: " + info);
//		}
//		return isEnable;
//	}
//
//	public static void doubleClick(By locator, String text) {
//
//		Actions actions = new Actions(Driver_Factory.getInstance().getMobileDriver());
//		WebElement elementLocator = Driver_Factory.getInstance().getMobileDriver().findElement(locator);
//		actions.doubleClick(elementLocator).perform();
//
//	}
//
//	public void clear(By locator, String text) {
//		WebElement elm = waitForVisible(locator);
//		//ReportManager.logInfo("Successfully Cleared text -<b style=\"color:green;\"> " + text + "</b>");
//		elm.clear();
//	}
//	
//	public String getElementTextUsingFindElements(int iteratorStarted ,int iteratorEnded ,By locator) throws InterruptedException {
//		String lst_ElmText="";
//		List<WebElement> lst_Elm = Driver_Factory.getInstance().getMobileDriver().findElements(locator);
//		//ReportManager.logInfoMobile("Successfully captured elemnt size is - " + lst_Elm.size());
//		for (int iterator = iteratorStarted; iterator < lst_Elm.size()-iteratorEnded; iterator++) {
//			String lst_ElmgetText =lst_Elm.get(iterator).getText();
////			lst_ElmText = lst_ElmText+"\n"+lst_ElmgetText;
//			
//			System.out.println("Successfully get text - " + lst_Elm.get(iterator).getText());
//			//ReportManager.logInfo("Successfully get text -<b style=\"color:green;\"> " + lst_ElmgetText + "</b>");
//		}
//		
//		return lst_ElmText;
//	}
//	public void getToastMessage() {
//		try {
////			mobileActions.waitForVisible(By.xpath("//android.widget.Toast"));
//        String toast = Driver_Factory.getInstance().getMobileDriver().findElement(By.xpath("//android.widget.Toast")).getText();
//        System.out.println("The Toast Message is : "+ toast);
//       // ReportManager.logInfo("Successfully get Toast Message text -<b style=\"color:green;\"> " + toast + "</b>");
//		}catch (Exception e) {
//			System.out.println();
//		}
//
//    }
//	public void SwipeByCoordinates(int startX, int startY, int endX, int endY) throws InterruptedException {
//		new TouchAction(Driver_Factory.getInstance().getMobileDriver()).press(point(startX, startY))
//				.waitAction(waitOptions(ofMillis(1000))).moveTo(point(endX, endY)).release().perform();
//	}
//	
//	public void navigatesbackUsingFindElement(By locator) throws InterruptedException {
//		Thread.sleep(1000);
//		try {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				if (isElmPresent) {
//					Driver_Factory.getInstance().getMobileDriver().navigate().back();
//				}
//			
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//	public void CloseAPP(String terminateApp) {
//		Driver_Factory.getInstance().getMobileDriver().terminateApp(terminateApp);
////		 System.out.println("---Close App---");
//	}
//	public void OpenAPP(String activateApp) {
//		Driver_Factory.getInstance();
//		Driver_Factory.getMobileDriver().activateApp(activateApp);
////	     System.out.println("---Open App---");
//	}
//	public void swipeDown_FindElement(int howManySwipes, By locator) throws InterruptedException {
//		Dimension size = Driver_Factory.getInstance().getMobileDriver().manage().window().getSize();
//		// calculate coordinates for vertical swipe
//		int startY = (int) (size.height * 0.70);
//		int endY = (int) (size.height * 0.30);
//		int startX = (size.width / 2);
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howManySwipes; i++) {
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locator).size() > 0;
//				if (isElmPresent) {
//					// DriverFactory.getInstance().getMobileDriver().findElement(locator).click();
//					break;
//				}
//				new TouchAction(Driver_Factory.getInstance().getMobileDriver())
//						.longPress(PointOption.point(startX, endY)).moveTo(PointOption.point(startX, startY)).release()
//						.perform();
//				System.out.println("swipeUp");
//			}
//		} catch (Exception e) {
//			// print error or something
//		}
//	}
//	public void clicksAgainManyClicks(int howMany, By locatorNextScreen,By locatorPresentScreen) throws InterruptedException {
//		Thread.sleep(1000);
//		try {
//			for (int i = 1; i <= howMany; i++) {
//				Thread.sleep(1000);
//				boolean isElmPresent = Driver_Factory.getInstance().getMobileDriver().findElements(locatorNextScreen).size() > 0;
//				if (isElmPresent) {
//					
//					break;
//				}else {
//					Driver_Factory.getInstance().getMobileDriver().findElement(locatorPresentScreen).click();
//				}
//				
//			}
//		} catch (Exception e) {
//		}
//	}
	
	
}
