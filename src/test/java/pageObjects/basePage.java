package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class basePage {




    @FindBy(how = How.CLASS_NAME, using = "cart-label")
    private WebElement cart;

    WebDriver driver;

    public basePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void selectDropDown(WebElement element,String text){
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    public void gotoCart(){
        cart.click();
    }

}
