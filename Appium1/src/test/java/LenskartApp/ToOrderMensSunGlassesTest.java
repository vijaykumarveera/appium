package LenskartApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToOrderMensSunGlassesTest extends BaseClass
{
	@Test
	public void toOrderSunGlassesTest() throws MalformedURLException, InterruptedException
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
		Thread.sleep(4000);
		driver.swipe(506, 1856, 523, 574, 500);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Men\"]/android.widget.TextView")).click();
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.ImageView")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.lenskart.app:id/button_find_my_fit")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_select_fs")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_primary")).click();
		driver.tap(1, 165, 2118, 500);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Medium (36)']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='APPLY']")).click();
		driver.tap(1, 524, 2121, 500);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Price - Low to High']")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_apply")).click();
		Thread.sleep(2000);
		driver.tap(1, 897, 2104, 500);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Frame Shape']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Cat Eye (14)']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='APPLY FILTERS']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='John Jacobs']")).click();
		driver.findElement(By.id("com.lenskart.app:id/toggle_off")).click();
		driver.findElement(By.id("com.lenskart.app:id/wishlist_icon")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_primary_large")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='With Power']")).click();
		driver.findElement(By.xpath("(//android.widget.Button[@text='BUY NOW'])[1]")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='SELECT ADDRESS']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Deliver at Home']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
		driver.findElement(By.id("com.lenskart.app.store:id/address_edit")).click();
		driver.findElement(By.id("com.lenskart.app:id/btn_continue")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RadioButton")).click();
		driver.tap(1, 663, 2116, 500);
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RadioButton")).click();
	
	}
}