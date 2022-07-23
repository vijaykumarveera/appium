package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class swipeactions 
{
	@Test
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
		Dimension dimension = driver.manage().window().getSize();
		int ht = dimension.getHeight();
		int wd = dimension.getWidth();
		System.out.println("height of length of phone" +ht);
		System.out.println("width of phone "+wd);

		//height of length of phone = 1977
		//width of phone = 1080

		//veritical swipe
		driver.swipe(wd/2,(int)(ht*0.25), wd/2, (int) (ht*0.80) ,1000);

		//horizontal swipe
		driver.swipe((int)(wd*.20), ht/2, (int) (wd*.80), ht/2, 1000);

		driver.swipe((int)(wd*0.1),(int)(ht*0.8),(int) (wd*0.9), (int) (ht*0.8),500);
		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int) (wd*0.9), (int) (ht*0.2),500);
		driver.swipe((int)(wd*0.1),(int)(ht*0.5),(int) (wd*0.9), (int) (ht*0.5),500);

		driver.swipe((int)(wd*0.1),(int)(ht*0.2),(int) (wd*0.1), (int) (ht*0.8),500);
		driver.swipe((int)(wd*0.5),(int)(ht*0.2),(int) (wd*0.5), (int) (ht*0.8),500);
		driver.swipe((int)(wd*0.9),(int)(ht*0.2),(int) (wd*0.9), (int) (ht*0.8),500);	
	}
}