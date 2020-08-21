package medicalapplication;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import pageObjects.basePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory extends basePage {

    static WebDriver driver;

    public static final String USERNAME = "rumana4";
    public static final String AUTOMATE_KEY = "qbbdcGakicqgZzzArKwg";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public BrowserFactory(WebDriver driver) {
        super(driver);
    }

    public static WebDriver getDriver(boolean cloud, String browserName,boolean browserstack) throws MalformedURLException {

        if(driver!=null){
            return driver;
        }

        if (cloud) {

            if(browserstack)
            {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "80.0");
                caps.setCapability("os", "OS X");
                caps.setCapability("os_version", "Sierra");
                caps.setCapability("resolution", "1024x768");
                caps.setCapability("name", "Bstack-[Java] Sample Test");

                driver = new RemoteWebDriver(new URL(URL), caps);
                return driver;

            }
            else if (browserName.equals("chrome")) {

                MutableCapabilities sauceOptions = new MutableCapabilities();

                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "macOS 10.15");
                browserOptions.setCapability("browserVersion", "80.0");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL("https://2020consulting:50f65bf3-aaf6-4139-8c6d-dc451d52f517@ondemand.saucelabs.com:443/wd/hub"), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browserName.equals("firefox")) {
                MutableCapabilities sauceOptions = new MutableCapabilities();

                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "macOS 10.14");
                browserOptions.setCapability("browserVersion", "58.0");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL("https://2020consulting:50f65bf3-aaf6-4139-8c6d-dc451d52f517@ondemand.saucelabs.com:443/wd/hub"), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
            else if(browserName.equals("IE")){
                MutableCapabilities sauceOptions = new MutableCapabilities();

                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "79.0");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL("https://2020consulting:50f65bf3-aaf6-4139-8c6d-dc451d52f517@ondemand.saucelabs.com:443/wd/hub"), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            else {
                Assert.fail("This browser is not supported");
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        } else {
            if (browserName.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserName.equals("safari")) {
                driver = new SafariDriver();
            }
            else {
                Assert.fail("This browser is not supported");
            }
        }
        try{
        Thred.sleep(60000)
        }
        catch(Exception e)
        {
        }
        return driver;

    }
}
