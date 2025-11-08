package Pages_Module_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
    WebDriver driver;

public loginPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);

}

@FindBy(xpath = "//*[text()='Login']")
private WebElement ClickOnLogin;
public void UserClickonLoginButton(){
    ClickOnLogin.click();
}


    @FindBy(xpath="//*[@id='input-email']")
    private WebElement UserName;
    public void EnterUserName(String EmailAddress) {
        UserName.sendKeys(EmailAddress);
    }


    @FindBy(xpath="//*[@id='input-password']")
    private WebElement USerPassword;
    public void EnterPassword(String Password) {
        USerPassword.sendKeys(Password);
    }

@FindBy(xpath = "//*[@value='Login']")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
        LoginButton.click();
    }


}
