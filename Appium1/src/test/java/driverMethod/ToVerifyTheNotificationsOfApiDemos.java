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

public class ToVerifyTheNotificationsOfApiDemos 
{
@Test
public void apidemos() throws MalformedURLException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	MobileElement continuebtn =(MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	driver.tap(1, continuebtn, 500);
	MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
	driver.tap(1, okbtn, 500);
	MobileElement app = (MobileElement) driver.findElementByAccessibilityId("App");
	driver.tap(1, app, 500);
	MobileElement notification = (MobileElement) driver.findElementByAccessibilityId("Notification");
	driver.tap(1, notification, 500);
	MobileElement incomingmessage = (MobileElement) driver.findElementByAccessibilityId("IncomingMessage");
	driver.tap(1, incomingmessage, 500);
	MobileElement showappnotification = (MobileElement) driver.findElementByAccessibilityId("Show App Notification");
	driver.tap(1, showappnotification, 500);
	driver.openNotifications();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
	 }
}
