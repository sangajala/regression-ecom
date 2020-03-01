package medicalapplication;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefs2 {

    static WebDriver driver;
    MyAccount myAccount;
    ProductDetailsPage productDetailsPage;



//    @Given("^user is in login page$")
//    public void sdflsdhfldsh() {
//
//        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
//
//    }
//
//
//
//    @Then("^he should see a dashboard$")
//    public void heShouldSeeADashboard() {
//        WebElement successs = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2"));
//        String actual = successs.getText();
//        Assert.assertEquals("Welcome to our store",actual);
//
//    }
//
//    @When("^he logins into the application username \"([^\"]*)\" password \"([^\"]*)\"$")
//    public void heLoginsIntoTheApplicationUsernamePassword(String arg0, String arg1) throws Throwable {
//        login(arg0,arg1);
//    }
//
//
//
//    public void login(String username,String password){
//        //enter user name
//        WebElement us = driver.findElement(By.id("Email"));
//
//        us.clear();
//        us.sendKeys(username);
//        //enter invalid password
//
//        WebElement ps = driver.findElement(By.id("Password"));
//        ps.clear();
//        ps.sendKeys(password);
//        //click on login
//
//        WebElement signIn = driver.findElement(By.xpath("//input[@value='Log in']"));
//        signIn.click();
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Then("^he should see an error message as \"([^\"]*)\"$")
//    public void heShouldSeeAnErrorMessageAs(String arg0) throws Throwable {
//        WebElement pageElement = driver.findElement(By.tagName("body"));
//        String pageElementText = pageElement.getText();
//        Assert.assertTrue(pageElementText.contains(arg0));
//    }
//
//
//    @Given("^user is in home page$")
//    public void userIsInHomePage() {
//        driver.get("https://demo.nopcommerce.com");
//    }
//
//    @When("^he search for \"([^\"]*)\"$")
//    public void heSearchFor(String arg0) throws Throwable {
//        WebElement search = driver.findElement(By.id("small-searchterms"));
//        search.sendKeys(arg0);
//        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
//        searchButton.click();
//    }
//
//    @Then("^i should see \"([^\"]*)\"$")
//    public void iShouldSee(String arg0) throws Throwable {
//        boolean testResult;
//        try {
//            WebElement link = driver.findElement(By.linkText(arg0));
//            testResult = true;
//        }
//        catch (NoSuchElementException e){
//            testResult=false;
//        }
//
//        Assert.assertTrue(testResult);
//    }
//
//    @When("^he selects the currency to \"([^\"]*)\"$")
//    public void heSelectsTheCurrencyTo(String currency) throws Throwable {
//        WebElement element=driver.findElement(By.id("customerCurrency"));
//        Select dropDown = new Select(element);
//        dropDown.selectByVisibleText(currency);
//    }
//
//    @Then("^the first product in homepage should have the price in \"([^\"]*)\"$")
//    public void theFirstProductInHomepageShouldHaveThePriceIn(String symbol) throws Throwable {
//////div[@class='product-grid home-page-product-grid']/div[@class='item-grid']/div[1]//span
//        ///html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span
//        WebElement price = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[@class='item-grid']/div[1]//span"));
//        String priceText = price.getText();
//        Assert.assertTrue(priceText.contains(symbol));
//
//    }

//    @Before
//    public void openBrowser(){
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
//
////        WebDriverManager.
////        driver = new SafariDriver();
//
////        driver = new InternetExplorerDriver();
//
////        MutableCapabilities sauceOptions = new MutableCapabilities();
////
////        EdgeOptions browserOptions = new EdgeOptions();
////        browserOptions.setCapability("platformName", "Windows 10");
////        browserOptions.setCapability("browserVersion", "18.17763");
////        browserOptions.setCapability("sauce:options", sauceOptions);
//
//        MutableCapabilities sauceOptions = new MutableCapabilities();
//
//        FirefoxOptions browserOptions = new FirefoxOptions();
//        browserOptions.setCapability("platformName", "macOS 10.14");
//        browserOptions.setCapability("browserVersion", "58.0");
//        browserOptions.setCapability("sauce:options", sauceOptions);
//
//        try {
//            driver = new RemoteWebDriver(new URL("https://2020consulting:50f65bf3-aaf6-4139-8c6d-dc451d52f517@ondemand.saucelabs.com:443/wd/hub"),browserOptions);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
//    }
//
//    @After
//    public void closeBrowserHooks(){
//        driver.quit();
//    }

//    @When("^he go to my account$")
//    public void heGoToMyAccount() {
//        HomePage homePage=new HomePage(driver);
//        homePage.gotoMyAccountPage();
//    }
//
//
//    @When("^he go to my address$")
//    public void heGoToMyAddress() {
//        myAccount = new MyAccount(driver);
//        myAccount.gotoAddressTab();
//    }
//
//    @When("^he fill the details of account$")
//    public void heFillTheDetailsOfAccount() {
//    }
//
//    @Then("^the account should have text \"([^\"]*)\"$")
//    public void theAccountShouldBeUpdatedWithNewAddress(String text) {
//        System.out.println("Address"+myAccount.getAddress());
//        Assert.assertTrue(myAccount.getAddress().contains(text));
//    }
//
//    @When("^he fill the details of account \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//    public void heFillTheDetailsOfAccount(String first, String last, String email, String country, String city, String address1,String zip,String phone) throws Throwable {
//        myAccount.addUserAddress(first,last,email,country,city,address1,zip,phone);
//    }
//
//    @When("^he add an item into cart$")
//    public void heAddAnItemIntoBasket() {
//        productDetailsPage = new ProductDetailsPage(driver);
//        productDetailsPage.addToCart();
//    }
//
//    @And("^go into the product \"([^\"]*)\"$")
//    public void goIntoTheProduct(String product) throws Throwable {
//        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
//        searchResultsPage.gotoProduct(product);
//    }
//
//    @And("^go to cart$")
//    public void goToBasket() {
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        productDetailsPage.gotoCart();
//    }
//
//    @And("^apply discount code with \"([^\"]*)\"$")
//    public void applyDiscountCodeWith(String discountcode) throws Throwable {
//        CartPage cartPage = new CartPage(driver);
//        cartPage.applyDiscount(discountcode);
//    }
//
//    @Then("^the code should show an error message$")
//    public void theCodeShouldShowAnErrorMessage() {
//
//    }
}
