package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends basePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "My account")
    private WebElement myAccountLink;

    public void gotoMyAccountPage(){
        myAccountLink.click();
    }

    public void selectCurrecy(){
       // selectDropDown();
    }
}
