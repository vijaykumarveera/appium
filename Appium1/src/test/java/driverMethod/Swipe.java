package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe 
{
	@Test(groups={"regressionTesting"})
	public void toSwipeAction() throws MalformedURLException
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
		driver.swipe(550, 87, 550, 2250, 2000);
		driver.swipe(0, 1165, 1100, 1165, 2000);
		driver.swipe(275, 87, 275, 2250, 2000);
		driver.swipe(0, 583, 1100, 583, 2000);
		driver.swipe(0, 1748, 1100, 1748, 2000);
		driver.swipe(825, 87, 825, 2250, 2000);
		
}
}