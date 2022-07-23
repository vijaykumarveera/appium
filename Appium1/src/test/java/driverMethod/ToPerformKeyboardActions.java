package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToPerformKeyboardActions 
{
@Test
public void keyboardActions() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc =  new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	//dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
	
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
	
	System.out.println(AndroidKeyCode.KEYCODE_BACK);
	
	System.out.println(AndroidKeyCode.KEYCODE_ENTER);
	
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	
	System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
	
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
}
}
