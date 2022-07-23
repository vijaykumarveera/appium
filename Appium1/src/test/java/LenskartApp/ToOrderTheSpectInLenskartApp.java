package LenskartApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToOrderTheSpectInLenskartApp extends BaseClass
{

	@Test
	public void toMoveElement() throws MalformedURLException, InterruptedException
	{
		/*DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
		dc.setCapability("appPackage", "com.lenskart.app");
		dc.setCapability("appActivity", ".main.ui.SplashActivity");
		dc.setCapability("noReset", "true");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);*/
	    
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	    driver.findElement(By.id("com.lenskart.app:id/action_search")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Vincent Chase Eyeglasses']")).click();
	    //driver.findElement(By.xpath("//android.widget.TextView[@text='Lenskart Air']")).click();
	    driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.lenskart.app:id/frame_image']/../../..")).click();
	    driver.findElement(By.id("com.lenskart.app:id/toggle_on")).click();
	    driver.findElement(By.id("com.lenskart.app:id/wishlist_icon")).click();		
	    driver.findElement(By.xpath("//android.widget.Button[@text='ADD TO CART']")).click();
	    driver.findElement(By.id("com.lenskart.app:id/select_lenses")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Frame Only']")).click();
	    //MobileElement buynowbtn = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='BUY NOW']/../../../../.."));
	    //driver.tap(1, buynowbtn, 500);
	    driver.findElement(By.id("com.lenskart.app:id/button_increase_quantity")).click();
	    driver.findElement(By.id("com.lenskart.app:id/item_shortlist_icon")).click();
	    driver.findElement(By.id("com.lenskart.app:id/btn_checkout_small")).click();
	    driver.findElement(By.id("com.lenskart.app.store:id/address_edit")).click();
	    driver.findElement(By.id("com.lenskart.app:id/btn_continue")).click();
	    driver.findElement(By.id("com.lenskart.app.store:id/radio_button")).click();
	    
	}
}
	    
	    
	    
	    
	    
	