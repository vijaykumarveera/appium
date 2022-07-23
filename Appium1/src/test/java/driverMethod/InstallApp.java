package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp 
{
	@Test
	public void installTouchScreenTestApp() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
		dc.setCapability(MobileCapabilityType.APPIUM_VERSION,"4.1.2");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		driver.installApp("D:\\Users\\vijaykumar v\\Documents\\software1\\Appium1\\Apk file\\Touch Screen Test_v1.7.14_apkpure.com.apk");

	}
}

