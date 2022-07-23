package WebApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FacebookMobileWebApp 
{
@Test
public void facebookLogin() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
	dc.setCapability("noReset","true");
	dc.setBrowserName("chrome");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://m.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vvijaykumar0523@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vijay@4565");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Ok']")).click();
}
}
