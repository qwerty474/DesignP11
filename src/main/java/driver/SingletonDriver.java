package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

public class SingletonDriver {

    private final static String DRIVER_PATH = "./src/main/resources/chromedriver.exe";
    private static WebDriver driver;


    public SingletonDriver() {

    }

    public void setupDriver() {
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY, DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}