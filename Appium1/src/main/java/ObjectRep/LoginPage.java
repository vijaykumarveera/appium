package ObjectRep;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage 
{
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement nametf;

	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleradiobtn;

	@AndroidFindBy(id= "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsshopbtn;

	public LoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	public WebElement getNametf() {
		return nametf;
	}

	public WebElement getMaleradiobtn() {
		return maleradiobtn;
	}

	public WebElement getLetsshopbtn() {
		return letsshopbtn;
	}
	public void loginpage()
	{
		nametf.sendKeys("vijaykumar");
		maleradiobtn.click();
		letsshopbtn.click();
	}
}
