package ToverifyTheBigBasksetProductTest;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToVerifyTheBigBasketProductTest 
{
	@Test
	public void toVerifyTheBigBasketTest() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");
		dc.setCapability("noReset", "true");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement hamburgerbtn = (MobileElement) driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer"));
		driver.tap(1, hamburgerbtn, 500);
		MobileElement offerbtn = (MobileElement) driver.findElement(By.xpath("//*[@text='Offers']"));
		driver.tap(1, offerbtn, 500);
		MobileElement options = (MobileElement) driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]"));
		driver.tap(1, options, 500);
		List<WebElement> price = driver.findElements(By.id("com.bigbasket.mobileapp:id/txtSalePrice" ));
		List<WebElement> titles = driver.findElements(By.id("com.bigbasket.mobileapp:id/txtProductDesc"));
		for(WebElement output:price)
		{
			String exactprice = output.getText().substring(1);
			int onlyprice = Integer.parseInt(exactprice);
			//System.out.println(output.getText());
			for(WebElement output1:titles)
			{
				if(onlyprice>50)
				{
					System.out.println(output1.getText());
				}
			
				else
				{
					System.out.println("nothing");
					break;
				}
			}
		} 
	}
}
