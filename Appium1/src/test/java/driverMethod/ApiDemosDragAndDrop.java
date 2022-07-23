package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosDragAndDrop 
{
	
	@Test(groups= {"smokeTesting"})
	public void toMoveElement() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		MobileElement continuebtn = (MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, continuebtn, 500);
		MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbtn, 500);
		MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
		driver.tap(1, views, 500);
		MobileElement drag = (MobileElement) driver.findElementByAccessibilityId("Drag and Drop");
		driver.tap(1, drag, 500);
		MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		driver.tap(1, src, 500);
		MobileElement dct = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		driver.tap(1, dct, 500);
		TouchAction action = new TouchAction(driver);
		action.longPress(src).moveTo(dct).release().perform();
		driver.closeApp();

	}
}