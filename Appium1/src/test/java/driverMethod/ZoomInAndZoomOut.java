package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomInAndZoomOut 
{
	@Test(groups= {"regresssionTesting"})
	public void verifytheprice() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement continuebtn = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, continuebtn, 500);
		MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbtn, 500);
		MobileElement basicfeatures = (MobileElement) driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures"));
		//driver.tap(1, 543, 362, 500);
		driver.tap(1, basicfeatures, 500);
		MobileElement image = (MobileElement) driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(image);
		Thread.sleep(2000);
		driver.pinch(400, 500);
		driver.closeApp();

	}
}