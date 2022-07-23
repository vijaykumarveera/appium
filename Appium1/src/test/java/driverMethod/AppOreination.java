package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppOreination 
{
@Test
public void oreination() throws MalformedURLException, InterruptedException
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
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.getOrientation();
	//driver.rotate(ScreenOrientation.LANDSCAPE);
	//driver.rotate(ScreenOrientation.PORTRAIT);
	//driver.getConnection();
	//driver.setConnection(Connection.WIFI);
	//driver.setConnection(Connection.DATA);
	//driver.setConnection(Connection.ALL);
	//driver.setConnection(Connection.AIRPLANE);
	//driver.runAppInBackground(10);
	driver.startActivity("com.androidsample.generalstore", ".SplashActivity");
	Thread.sleep(2000);
	driver.startActivity("io.appium.android.apis", ".ApiDemos");
	driver.closeApp();
}
}
