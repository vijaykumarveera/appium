package AmzonApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToVerifyTheProductInAmzonApp
{
	//desired capabilities of appium
	@Test
	public void facebookLogin() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setBrowserName("chrome");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//p[.='Fashion']")).click();
		driver.findElement(By.xpath("//p[.='Electronics']")).click();
		driver.findElement(By.xpath("//p[.='Fitness trackers & smartwatches']")).click();
		driver.findElement(By.xpath("//span[.='OnePlus Smart Band: 13 Exercise…']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//div[@id='sc-gift']")).click();
		driver.findElement(By.xpath("//span[.='+']")).click();
		
		
}
}