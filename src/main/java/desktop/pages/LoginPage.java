package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBarFragment;
import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(css = ".primary-wrap")
    WebElement header;
    @FindBy(css = "#signin-embedded-layout")
    WebElement signInForm;
    @FindBy(css = ".register-iframe-wrapper")
    WebElement joinForm;
    @FindBy(css = ".footer")
    WebElement footer;
    @FindBy(css = ".newsletter-section")
    WebElement newsletterSection;

    NavigationBarFragment navigationBarFragment;

    public <LoginPage extends AbstractPage> LoginPage navigate() {

        SingletonDriver singletonDriver = new SingletonDriver();
        WebDriver driver = new ChromeDriver();

        singletonDriver.setupDriver();

        driver = singletonDriver.getDriver();

        driver.get("https://www.bookdepository.com/account/login/to/account");

        return null;
    }
}
