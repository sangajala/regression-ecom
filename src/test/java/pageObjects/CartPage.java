package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends basePage {

//    discountcouponcode
@FindBy(how = How.ID, using = "discountcouponcode")
private WebElement discountcouponcode_TextBox;

//    applydiscountcouponcode
@FindBy(how = How.ID, using = "applydiscountcouponcode")
private WebElement applydiscountcouponcode_Button;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void applyDiscount(String discount){
        discountcouponcode_TextBox.sendKeys(discount);
        applydiscountcouponcode_Button.click();

    }
}
