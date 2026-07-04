package Pages;

import Pojoclass.RegisterData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    //Constructor
    public RegisterPage(WebDriver driver)
    {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    //Locate Webelement


    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerLink;


    @FindBy(id="customer.firstName")
    WebElement Firstname;

    @FindBy(id="customer.lastName")
    WebElement Lastname;


    @FindBy(id="customer.address.street")
    WebElement Address;

    @FindBy(id = "customer.address.city")
     WebElement city;

    @FindBy(id = "customer.address.state")
     WebElement state;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
     WebElement ssn;

    @FindBy(id = "customer.username")
    WebElement username;

    @FindBy(id = "customer.password")
    WebElement password;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;

    // Actions / Methods

    public void clickRegisterLink() {
        registerLink.click();
    }

    public void enterFirstName(String fname) {
        Firstname.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        Lastname.sendKeys(lname);
    }

    public void enterAddress(String addr) {
        Address.sendKeys(addr);
    }

    public void enterCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void enterState(String stateName) {
        state.sendKeys(stateName);
    }

    public void enterZipCode(String zip) {
        zipCode.sendKeys(zip);
    }

    public void enterPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
    }

    public void enterSSN(String ssnNo) {
        ssn.sendKeys(ssnNo);
    }

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void enterConfirmPassword(String confirmPass) {
        confirmPassword.sendKeys(confirmPass);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }


    public void registerCustomer(RegisterData data) {

        Firstname.sendKeys(data.getFirstName());
        Lastname.sendKeys(data.getLastName());
        Address.sendKeys(data.getAddress());
        city.sendKeys(data.getCity());
        state.sendKeys(data.getState());
        zipCode.sendKeys(data.getZipCode());
        phoneNumber.sendKeys(data.getPhoneNumber());
        ssn.sendKeys(data.getSsn());
        username.sendKeys(data.getUsername());
        password.sendKeys(data.getPassword());
        confirmPassword.sendKeys(data.getConfirmPassword());

        registerButton.click();
    }


}
