package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	private AndroidDriver<AndroidElement> driver;
	
    public HomePage() {    	
    }
    
    public HomePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
  
    @AndroidFindBy(id = "name")
    private AndroidElement nameElement;
    
    @AndroidFindBy(id = "password")
    private AndroidElement passwordElement;
    
    @AndroidFindBy(id = "login")
    private AndroidElement loginElement;
    
    public boolean isDisplayed() {
        return loginElement.isDisplayed();
    }
    
    public void typeName(String name) {
        nameElement.sendKeys(name);
    }
    public void typePassword(String password) {
        passwordElement.sendKeys(password);
    }
    public void clickLogin() {
        loginElement.click();
    }

    public void login (String name, String password) {      
        typeName(name);
        typePassword(password);
        clickLogin();
    }

}
