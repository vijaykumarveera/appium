package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeAction 
{
@Test
public void swipeaction() throws MalformedURLException
{
	DesiredCapabilities dc =  new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	dc.setCapability("appActivity", ".TouchScreenTestActivity");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver = new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.swipe(219, 1805, 246, 690, 2000);
	driver.swipe(752, 656, 731, 1798, 2000);
	driver.swipe(44, 1155, 971, 1148, 2000);	driver.close();
}
}
