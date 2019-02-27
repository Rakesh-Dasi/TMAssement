package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePage {
	
	@SuppressWarnings("unused")
	private AndroidDriver<AndroidElement> driver;
	
    public HomePage() {    	
    }
    
    public HomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
  
    @AndroidFindBy(xpath = "//span[text()='Facebook']")
    @iOSFindBy(xpath = "//span[text()='Facebook']")
    private AndroidElement facebookLogo;    
 
    
    public boolean isDisplayed() {
        return facebookLogo.isDisplayed();
    }
    
  

}
