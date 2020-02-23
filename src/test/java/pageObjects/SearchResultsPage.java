package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends basePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void gotoProduct(String product){
        driver.findElement(By.linkText(product)).click();
    }


}
