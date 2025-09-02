package Pages_Module_POM;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class RegisterAccountPage {
    WebDriver driver;

    public RegisterAccountPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//*[@title='My Account']")
private WebElement userClickOnAccountButton;
    public  void ClickOnAccountButton(){
        userClickOnAccountButton.click();

    }

    @FindBy(xpath = "//*[text()='Register']")
    private WebElement userClickOnRegitersButton;
    public  void ClickOnRegiterButton(){
        userClickOnRegitersButton.click();

    }


    @FindBy(xpath ="//*[@id='input-firstname']")
    private WebElement UserFirstName;
    @FindBy(xpath = "//*[@id='input-lastname']")
    private WebElement UserLastName;

    @FindBy(xpath = "//*[@id='input-email']")
    private WebElement UserEmail;
    @FindBy(xpath = "//*[@id='input-telephone']")
    private WebElement UsertelephoneNumber;

    @FindBy(xpath = "//*[@id='input-password']")
    private WebElement UserPassword;

    public  void UserInformation (String  FirstName, String LastName, String Email ,String Telephone ) {
       UserFirstName.sendKeys(FirstName);
       UserLastName.sendKeys(LastName);
        UserEmail.sendKeys(Email);
        UsertelephoneNumber.sendKeys(Telephone);
        //UserPassword.sendKeys(Password);

    }
public  void EnterPassword(String Password){
    UserPassword.sendKeys(Password);
}
    @FindBy(xpath = "//*[@id='input-confirm']")
    private WebElement UserConfirmPassword;
    public void EnterConfirmPassword(String PasswordConfirm ){
        UserConfirmPassword.sendKeys(PasswordConfirm );
    }

    @FindBy(xpath = "//*[text()='Yes']")
    private WebElement UserSelectSubcriberYes;
    public void YesRaidoButtonSubcriber(){
        UserSelectSubcriberYes.click();
    }

    @FindBy(xpath = "//*[text()='No']")
    private WebElement UserSelectSubcriberNO;
    public void NoRaidoButtonSubcriber(){
        UserSelectSubcriberNO.click();
    }

    @FindBy(xpath = "//*[@name='agree']")
    private WebElement UserSelectAgrreCheckBoxButton;
    public void SelectAgreeCheckBoButton(){
        UserSelectAgrreCheckBoxButton.click();
    }

    @FindBy(xpath = "//*[text()='Warning: You must agree to the Privacy Policy!']")
    private WebElement NotSelectAgreeButtonErrorMessgae;
    public  String ErrorMesssageDisplayAgreeCheckBox(){
       return NotSelectAgreeButtonErrorMessgae.getText();
    }



    @FindBy(xpath ="//*[@value='Continue']")
    private WebElement UserClikeOnContinueButton;
    public void SelectContinueButton(){
        UserClikeOnContinueButton.click();
    }


    @FindBy(xpath ="(//*[text()='Your Account Has Been Created!'])[1]")
    private WebElement AssetCheck;
    public String  AccountSuccessfully(){

        return AssetCheck.getText();
    }

    @FindBy(xpath = "//*[text()='First Name must be between 1 and 32 characters!']")
    private WebElement ErorMessageFirstname;

    @FindBy(xpath ="//*[text()='Last Name must be between 1 and 32 characters!']")
    private WebElement ErrorMessageLatsName;

    @FindBy(xpath ="//*[text()='E-Mail Address does not appear to be valid!']")
    private WebElement ErrorEmailMessage;

    @FindBy(xpath ="//*[text()='Telephone must be between 3 and 32 characters!']")
    private WebElement ErrorTelephoneNumerMessage;


    @FindBy(xpath ="//*[text()='Password must be between 4 and 20 characters!']")
    private WebElement ErrorPhoneNumberMessage;

    @FindBy(xpath = "//*[text()='Password confirmation does not match password!']")
    private WebElement ConfirmMessage;
    public String ConfirmeMessagenotMachPassword(){
        return ConfirmMessage.getText();
    }

    public String getAllmessage() {
      return  ErorMessageFirstname.getText()   + "  | " +
        ErrorMessageLatsName.getText()  + "  | " +
        ErrorEmailMessage.getText()  + "  | " +
        ErrorTelephoneNumerMessage.getText()   + "  | " +
        ErrorPhoneNumberMessage.getText();

    }

}
