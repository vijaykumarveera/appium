package LenskartApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToOrderTheContactLensTest extends BaseClass
{
	@Test
	public void buytheContactLensTest() throws MalformedURLException, InterruptedException
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement mensbtn = (MobileElement) driver.findElementByAccessibilityId("Open Navigation Drawer");
		driver.tap(1, mensbtn, 500);
		driver.tap(1, 352, 1367, 500);
		driver.swipe(383, 1866, 366, 810, 500);
		driver.tap(1, 369, 1275, 500);
		driver.tap(1, 789, 1791, 500);
		driver.swipe(570, 1991, 528, 1084, 500);
		MobileElement Soflensicon = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Soflens Toric Monthly 10 Hours (6 Lens)']"));
		driver.tap(1, Soflensicon, 500);
		MobileElement addtocartbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/btn_primary_large"));
		driver.tap(1, addtocartbtn, 500);
		MobileElement Botheyesbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/btn_both_eyes"));
		driver.tap(1, Botheyesbtn, 500);
		MobileElement Entermanuallyicon = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Enter Manually']"));
		driver.tap(1, Entermanuallyicon, 500);
		MobileElement powerforbotheyecheckbox = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/checkbox_same_power"));
		driver.tap(1, powerforbotheyecheckbox, 500);
        MobileElement sphselectdropdown = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));
		driver.tap(1, sphselectdropdown, 500);
        MobileElement selectpowerlens = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='-2.25']"));
		driver.tap(1, selectpowerlens, 500);
        MobileElement cylpowerlensdropdown = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));
		driver.tap(1, cylpowerlensdropdown, 500);
        MobileElement cyllens = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='-1.75']"));
		driver.tap(1, cyllens, 500);
        driver.swipe(345, 2019, 398, 1312, 500);
		MobileElement axislens = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView"));
		driver.tap(1, axislens, 500);
		MobileElement selectaxislens = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='90']"));
		driver.tap(1, selectaxislens, 500);
		driver.findElement(By.id("com.lenskart.app:id/input_full_name")).sendKeys("v vijay kumar");
		driver.findElement(By.id("com.lenskart.app:id/input_phone_number")).sendKeys("7204561040");
		MobileElement Continuebtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/btn_submit"));
		driver.tap(1, Continuebtn, 500);
		MobileElement addlensbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/plus"));
		driver.tap(1, addlensbtn, 500);
		MobileElement continuebtn1 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']"));
		driver.tap(1, continuebtn1, 500);
		MobileElement proceedtocartbtn = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='PROCEED TO CART']"));
		driver.tap(1, proceedtocartbtn, 500);
		MobileElement selectaddressbtn = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='SELECT ADDRESS']"));
		driver.tap(1, selectaddressbtn, 500);
		MobileElement addressradiobtn = (MobileElement) driver.findElement(By.id("com.lenskart.app.store:id/radio_button"));
		driver.tap(1, addressradiobtn, 500);
		MobileElement continuebtn2 = (MobileElement) driver.findElement(By.id("com.lenskart.app.store:id/btn_continue_small"));
		driver.tap(1, continuebtn2, 500);
		MobileElement placeorderbtn = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup"));
		driver.tap(1, placeorderbtn, 500);
	}
}
