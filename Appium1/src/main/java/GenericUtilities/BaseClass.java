package GenericUtilities;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass 
{
	//AppiumDriverLocalService server;
	public AndroidDriver driver;
	DataBaseUtility dlib =  new DataBaseUtility();
	FileUtility flib = new FileUtility();
	@BeforeSuite
	public void getDatabaseConncetion()
	{
		dlib.connectionToDB();
	}
	/*@BeforeClass
	public void openAppiumServer()
	{
		AppiumDriverLocalService.buildDefaultService();
		server.start();
	}*/
	@BeforeMethod
	public void lanuchApplication() throws IOException
	{
		String platformname = flib.getPropertyKeyValue("PLATFORM_NAME");
		String platformversion = flib.getPropertyKeyValue("PLATFORM_VERSION");
		String devicesname = flib.getPropertyKeyValue("DEVICES_NAME");
		String devicesudid = flib.getPropertyKeyValue("DEVICES_UDID");
		String apppackage = flib.getPropertyKeyValue("APPPACKAGE");
		String appactivity = flib.getPropertyKeyValue("APPACTIVITY");
		String url = flib.getPropertyKeyValue("URL");
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "platformname");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "platformversion");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "devicesname");
		dc.setCapability(MobileCapabilityType.UDID, "deviceudid");
		dc.setCapability("appPackage", "apppackage");
		dc.setCapability("appActivity", "appactivity");
		dc.setCapability("noReset", "true");
		URL url1= new URL(url);
		driver=  new AndroidDriver(url1,dc);
	}
	@AfterMethod
	public void closeApplication()
	{
		driver.closeApp();
	}
	/*@AfterClass
	public void closeAppiumServer()
	{
		server.stop();
	}*/
	@AfterSuite
	public void closeDataBaseConnection()
	{
		dlib.closeDB();
	}
}
