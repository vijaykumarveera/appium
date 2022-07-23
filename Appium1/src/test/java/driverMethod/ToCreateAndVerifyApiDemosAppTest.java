package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToCreateAndVerifyApiDemosAppTest 
{
	@Test
	public void apiDemos() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		MobileElement continuebtn =(MobileElement) driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		driver.tap(1, continuebtn, 500);
		MobileElement okbtn = (MobileElement) driver.findElement(By.id("android:id/button1"));
		driver.tap(1, okbtn, 500);
		MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
		driver.tap(1, views, 500);
		MobileElement controls = (MobileElement) driver.findElementByAccessibilityId("Controls");
		driver.tap(1, controls, 500);
		MobileElement light = (MobileElement) driver.findElementByAccessibilityId("1. Light Theme");
		driver.tap(1, light, 500);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("vijay kumar");
		MobileElement check1 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/check1"));
		driver.tap(1, check1, 500);
		MobileElement check2 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/check2"));
		driver.tap(1, check2, 500);
		MobileElement radiobtn1 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/radio1"));
		driver.tap(1, radiobtn1, 500);
		MobileElement radiobtn2 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		driver.tap(1, radiobtn2, 500);
		MobileElement star = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/star"));
		driver.tap(1, star, 500);
		MobileElement tab1 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		driver.tap(1, tab1, 500);
		MobileElement tab2 = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		driver.tap(1, tab2, 500);
		driver.hideKeyboard();
		MobileElement planet = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, planet, 500);
		MobileElement earth = (MobileElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']"));
		driver.tap(1, earth, 500);
		driver.tap(1, planet, 500);
		List<WebElement> values = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		for(WebElement output:values)
		{
			System.out.println(output.getText());
		}	
	}
}
