package ToSwitchFromNativeToWebApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToSwitchNativeToWeb 
{
@Test
public void toSwitch() throws MalformedURLException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//MobileElement country = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
	//driver.tap(1, country, 500);
	//scrollToElement(driver, "text" ,"India");
	//MobileElement india = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='India']"));
	//driver.tap(1, india, 500);
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("vijay kumar v");
	MobileElement radiobtn = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/radioMale"));
	driver.tap(1, radiobtn, 500);
	MobileElement lets = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
	driver.tap(1, lets, 500);
	MobileElement addtocart = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']"));
	driver.tap(1, addtocart, 500);
	MobileElement cart = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
	driver.tap(1, cart, 500);
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	Set<String> windows = driver.getContextHandles();
	for(String window :windows)
	{
		System.out.println("window");
	}
	driver.context("WEBVIEW_com.androidsample.generalstore");
	driver.navigate().to("http://www.facebook.com");
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("banglore");
	
}
}
