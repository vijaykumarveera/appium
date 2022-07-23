package LenskartApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToOrderTheJansonFrameTest
{
	@Test
	public void toBuyTheJansonFrame() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8R81WJX5V");
		dc.setCapability("appPackage", "com.lenskart.app");
		dc.setCapability("appActivity", ".main.ui.SplashActivity");
		dc.setCapability("noReset", "true");
		URL url =  new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =  new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.lenskart.app:id/action_search")).click();
		//MobileElement Searchbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/action_search"));
		//driver.tap(1, Searchbtn, 500);
		MobileElement VincentChaseEyeglassesbtn = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Vincent Chase Eyeglasses']"));
		driver.tap(1, VincentChaseEyeglassesbtn, 500);
		MobileElement narrowbtn = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.lenskart.app:id/frame_image']/../../.."));
		driver.tap(1, narrowbtn, 500);
		MobileElement togglebtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/toggle_on"));
		driver.tap(1, togglebtn, 500);
		MobileElement wishlisthearticon = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/wishlist_icon"));		
		driver.tap(1, wishlisthearticon, 500);
		MobileElement addtocart = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='ADD TO CART']"));
		driver.tap(1, addtocart, 500);
		MobileElement selectnewlensesbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/select_lenses"));
		driver.tap(1, selectnewlensesbtn, 500);
		MobileElement frameonlybtn = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Frame Only']"));
		driver.tap(1, frameonlybtn, 500);
		MobileElement addframeplusbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/button_increase_quantity"));
		driver.tap(1, addframeplusbtn, 500);
		driver.findElement(By.id("com.lenskart.app:id/item_shortlist_icon")).click();
		MobileElement checkoutsmall = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/btn_checkout_small"));
		driver.tap(1, checkoutsmall, 500);
		MobileElement addresseditbtn = (MobileElement) driver.findElement(By.id("com.lenskart.app.store:id/address_edit"));
		driver.tap(1, addresseditbtn, 500); 
		MobileElement continuebtn = (MobileElement) driver.findElement(By.id("com.lenskart.app:id/btn_continue"));
		driver.tap(1, continuebtn, 500); 
		//MobileElement placeorderbtn = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup"));
		//driver.tap(1, placeorderbtn, 500);

	}
}
