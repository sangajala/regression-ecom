package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccount extends basePage {


    //elments
    //Generde male
    @FindBy(how = How.ID, using = "gender-male")
    private WebElement maleRadio;
    //gender female
    @FindBy(how = How.ID, using = "FirstName")
    private WebElement firstname;

    @FindBy(how = How.LINK_TEXT, using = "Addresses")
    private WebElement myAddressLink;

    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/input")
    private WebElement addnewButton;
    //lastname
    //Date of DOB
    //Month of DOB
    //Year of DOB
    //emial
    //company name
    //newsletter
    //save

    @FindBy(how = How.NAME, using = "Address.FirstName")
    private WebElement Address_FirstName;
    //Address.FirstName

    @FindBy(how = How.NAME, using = "Address.LastName")
    private WebElement Address_LastName;
    //Address.LastName

    //Address.Email
    @FindBy(how = How.NAME, using = "Address.Email")
    private WebElement Address_Email;

    //Address.CountryId
    @FindBy(how = How.NAME, using = "Address.CountryId")
    private WebElement Address_CountryId;

    //Address.StateProvinceId
    @FindBy(how = How.NAME, using = "Address.StateProvinceId")
    private WebElement Address_StateProvinceId;

    //Address.City
    @FindBy(how = How.NAME, using = "Address.City")
    private WebElement Address_City;

    //Address.Address1
    @FindBy(how = How.NAME, using = "Address.Address1")
    private WebElement Address_Address1;

    //Address.ZipPostalCode
    @FindBy(how = How.NAME, using = "Address.ZipPostalCode")
    private WebElement Address_ZipPostalCode;

    //Address.PhoneNumber
    @FindBy(how = How.NAME, using = "Address.PhoneNumber")
    private WebElement Address_PhoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(how = How.CLASS_NAME, using = "info")
    private WebElement address;

    //actions- methods


    public MyAccount(WebDriver driver) {
        super(driver);
    }



    public void updatePersonalDetails() {

        Address_FirstName.sendKeys();

        updateDOB();
    }

    public void updateDOB() {

    }

    public void gotoAddressTab() {
        myAddressLink.click();
    }

    //public void updateDOB(12/12/2019)

    //gotoAddress

    //adduseraddress
    public void addUserAddress(String first, String last, String email, String country, String city, String address1, String zip, String phone) {


        addnewButton.click();
        Address_FirstName.sendKeys(first);
        Address_LastName.sendKeys(last);
        Address_Email.sendKeys(email);
        Address_City.sendKeys(city);
        Address_Address1.sendKeys(address1);
        Address_ZipPostalCode.sendKeys(zip);
        Address_PhoneNumber.sendKeys(phone);

        selectDropDown(Address_CountryId, country);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        saveButton.click();

    }

    public String getAddress() {
        return address.getText();
    }

    //verify orders

    //change password


}
