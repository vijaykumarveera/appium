package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UninstallApp 
{
@Test 
public void uninstallApp() throws MalformedURLException
{
	DesiredCapabilities dc =  new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
	dc.setCapability(MobileCapabilityType.APPIUM_VERSION, "4.1.2");
	//dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	//dc.setCapability("appActivity", ".TouchScreenTestActivity");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url, dc);
	boolean value = driver.isAppInstalled("jp.rallwell.siriuth.touchscreentest");
	System.out.println(value);
	driver.removeApp("jp.rallwell.siriuth.touchscreentest");
	
}
}
