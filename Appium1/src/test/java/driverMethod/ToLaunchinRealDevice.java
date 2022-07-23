package driverMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToLaunchinRealDevice 
{
	@Test
	public void apiDemos() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
		MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
		driver.tap(1, 171, 1671, 500);
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("1. Light Theme").click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("vijay kumar");
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		List<WebElement> values = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']"));
		for(WebElement output:values)
		{
			System.out.println(output.getText());
		}	
	}
}
