package ToVerifyTheGeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import ObjectRep.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TOTest
{
@Test
public void loginPage() throws MalformedURLException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
	dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
	dc.setBrowserName("chrome");
	URL url =  new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver =  new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LoginPage login = new LoginPage(driver);
	login.loginpage();
	
}
}
