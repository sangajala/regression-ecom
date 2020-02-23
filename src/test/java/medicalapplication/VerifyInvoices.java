package medicalapplication;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvoices {

    static WebDriver driver;
    @BeforeClass
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://test.patientbooking.co.uk/lgpdev/#/login");
    }

    @Before
    public void logintoApp(){
        login("chhabra.teena@gmail.com","London12");
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
    public void verifyUserCanSeeInvoicesInHomePage(){
        //read the error message - actual
        WebElement successs = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/ul/li"));
        String actual = successs.getText();
        Assert.assertEquals("Here you can access a range of services and information. Below you will find all the available options to you in the tiles. If you have any questions, please visit our help section.",actual);
        WebElement firstInvoice = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/div/div[1]/div/div[2]/ul/li[1]/div/div[2]/h4"));
        Assert.assertEquals("Invoice",firstInvoice.getText());
    }

    @Test
    public void verifyUserCanSeeInvoicesInInvoicesPage(){

        //read the error message - actual
        WebElement successs = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/ul/li"));
        String actual = successs.getText();
        Assert.assertEquals("Here you can access a range of services and information. Below you will find all the available options to you in the tiles. If you have any questions, please visit our help section.",actual);

        WebElement invoice_Link = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[1]/div[1]/div[1]/div/ng-include/ul/li[10]/a/span[1]"));

        invoice_Link.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstText = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/ul/li[1]"));

        String text = firstText.getText();

        boolean expectedResult = text.contains("605");

        Assert.assertTrue(expectedResult);

        ////*[@id="ng-app"]/body/div/div[1]/div[1]/div[1]/div/ng-include/ul/li[10]/a/span[1]

    }

    @Test
    public void verifyUserCanGotodetailsofInvoice(){


        //read the error message - actual
        WebElement successs = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/ul/li"));
        String actual = successs.getText();
        Assert.assertEquals("Here you can access a range of services and information. Below you will find all the available options to you in the tiles. If you have any questions, please visit our help section.",actual);

        WebElement invoice_Link = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[1]/div[1]/div[1]/div/ng-include/ul/li[10]/a/span[1]"));

        invoice_Link.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstText = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/ul/li[1]"));

       firstText.click();

       WebElement emailInvoice = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[4]/button[2]"));

       boolean expected = emailInvoice.isDisplayed();
       Assert.assertTrue(expected);
    }


    public void login(String username,String password){
        //enter user name
        WebElement us = driver.findElement(By.id("inputEmail"));

        us.clear();
        us.sendKeys(username);
        //enter invalid password

        WebElement ps = driver.findElement(By.id("inputPassword"));
        ps.clear();
        ps.sendKeys(password);
        //click on login

        WebElement signIn = driver.findElement(By.className("text"));
        signIn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
