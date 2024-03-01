/**
 * 
 */
package Common_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import FrameWork_Constants.FW_Constants;

/**
 * 
 */
public class ConfigReader {

	private Properties prop;
	public static String PlatFormtype = null;
	public static String UdidFormtype = null;
	public static String SystemPostFormtype = null;
	public static String DeviceFormtype = null;

	/**
	 * This method is used to load the properties from config.properties file
	 * 
	 * @return it returns Properties prop object
	 */
	public Properties init_PropFile() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream(FW_Constants.PropertiesFile);
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

	/**
	 * This methods are used for to set & get the mobile desired capabilities
	 * 
	 * @return it returns PlatFormtype, UdidFormtype, SystemPostFormtype,
	 *         deviceFormtype
	 */

	public static void setPlatFormtype(String platFormtype) {
		PlatFormtype = platFormtype;
	}

	public static String getPlatFormtype() {
		if (PlatFormtype != null)
			return PlatFormtype;
		else
			throw new RuntimeException("PlatFormtype is not sfecified in testng.xml");
	}

	public static void setUdidFormtype(String UDID) {
		UdidFormtype = UDID;
	}

	public static String getUdidFormtype() {
		if (UdidFormtype != null)
			return UdidFormtype;
		else
			throw new RuntimeException("UdidFormtype is not sfecified in testng.xml");
	}

	public static void setSystemPostFormtype(String systemPostFormtype) {
		SystemPostFormtype = systemPostFormtype;
	}

	public static String getSystemPostFormtype() {
		if (SystemPostFormtype != null)
			return SystemPostFormtype;
		else
			throw new RuntimeException("SystemPostFormtype is not sfecified in testng.xml");
	}

	public static void setDeviceFormtype(String deviceFormtype) {
		DeviceFormtype = deviceFormtype;
	}

	public static String getDeviceFormtype() {
		if (DeviceFormtype != null)
			return DeviceFormtype;
		else
			throw new RuntimeException("DeviceFormtype is not sfecified in testng.xml");
	}

}
