package testCases;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class PositiveLoginTest {
	 private final static String APP_PACKAGE_NAME = "com.facebook.katana";
	    private final static String APP_ACTIVITY_NAME = ".dbl.activity.FacebookLoginActivity";
	    private final static String PASSWORD = "12345789";
	    public static void main(String[] args) throws Exception {
	        // Prepare Appium session
	        DesiredCapabilities capabilities = DesiredCapabilities.android();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	        capabilities.setCapability(MobileCapabilityType.UDID, "YOUR_DEVICE_UDID");	        
	        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
	        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
	        // Initialize driver
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	        driver.resetApp();
	        LoginPage loginPage = new LoginPage(driver);
	        if (!loginPage.isDisplayed()) {
	            return;
	        }
	        loginPage.login("dasi.rakesh09@gmail.com", PASSWORD);
	        HomePage homePage = new HomePage(driver);
	        if (!homePage.isDisplayed()) {
	            return;
	        }
	        System.out.println("Test completed successfully");
	        // Close session
	        driver.quit();
	    }

}
