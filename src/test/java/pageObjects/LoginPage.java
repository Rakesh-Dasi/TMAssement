package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage {
	
	@SuppressWarnings("unused")
	private AndroidDriver<AndroidElement> driver;
	
    public LoginPage() {    	
    }
    
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
  
    @AndroidFindBy(id = "email")
    @iOSFindBy(id = "email")
    private AndroidElement emailInput;
    
    @AndroidFindBy(id = "pass")
    @iOSFindBy(id = "pass")
    private AndroidElement passwordInput;
    
    @AndroidFindBy(id = "loginbutton")
    @iOSFindBy(id = "loginbutton")
    private AndroidElement loginBtn;
    
    public boolean isDisplayed() {
        return emailInput.isDisplayed();
    }
    
    public void typeName(String name) {
        emailInput.sendKeys(name);
    }
    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }
    public void clickLogin() {
        loginBtn.click();
    }

    public void login (String name, String password) {      
        typeName(name);
        typePassword(password);
        clickLogin();
    }

}
