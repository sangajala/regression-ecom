package medicalapplication;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class VerifyUserAccount {

    static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.patientbooking.co.uk/lgpdev/#/login");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        //Cookie cookie = new Cookie()

      //  driver.manage().addCookie(new Cookie());
    }

    @Before
    public void logintoApp(){
      //  login("chhabra.teena@gmail.com","London12");
    }


    @After
    public void logOut(){
        driver.navigate().to("https://test.patientbooking.co.uk/lgpdev/#/login");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void close(){
        driver.quit();
    }

    @Test
    public void verifyInvalidUserLogin(){

         login("chabra.testst@ttest.com","dflsdhfkdhs");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //read the error message - actual

        WebElement er = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div/div/div[2]/div[2]/div/form/span"));

        String actual = er.getText();
        Assert.assertEquals("Login failed due to incorrect username or password. Please try again.",actual);
    }
    @Test
    public void verifyValidUserLogin(){
       login("chhabra.teena@gmail.com","London12");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //read the error message - actual
        WebElement successs = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/ul/li"));
        String actual = successs.getText();
        Assert.assertEquals("Here you can access a range of services and information. Below you will find all the available options to you in the tiles. If you have any questions, please visit our help section.",actual);

    }

    @Test
    public void checkDropDown(){
        WebElement forgotLink = driver.findElement(By.linkText("Forgot password?"));
        forgotLink.click();
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div/div/div[2]/div[2]/div/form/div[2]/div/div[2]/select"));
        Select dropDownElement = new Select(webElement);
        dropDownElement.selectByVisibleText("Feb");
        dropDownElement.selectByValue("string:04");
        dropDownElement.selectByIndex(12);
        WebElement element = dropDownElement.getFirstSelectedOption();
        Assert.assertEquals("Feb",element.getText());
    }


    public void login(String username,String password){
        //enter user name
        WebElement us = driver.findElement(By.id("inputEmail"));

        us.sendKeys(username);
        //enter invalid password

        WebElement ps = driver.findElement(By.id("inputPassword"));

        ps.sendKeys(password);
        //click on login

        WebElement signIn = driver.findElement(By.className("text"));
        signIn.click();
    }

}
