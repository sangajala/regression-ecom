package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends basePage {

    @FindBy(how = How.ID, using = "add-to-cart-button-2")
    private WebElement addToCartButton;
    @FindBy(how = How.ID, using = "bar-notification")
    private WebElement greenRibbon;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(){
        addToCartButton.click();
//        2
//        WebDriverWait webDriverWait = new WebDriverWait(driver,60);
//        3
//        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("bar-notification")));
    }


}
