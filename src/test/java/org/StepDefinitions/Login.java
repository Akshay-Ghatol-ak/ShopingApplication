package org.StepDefinitions;

import Factory.DataFactory;
import Pages_Module_POM.RegisterAccountPage;
import Pages_Module_POM.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class Login {

    WebDriver driver;
    loginPage Ak1;
    RegisterAccountPage Ak2;


@Given("open the browser")
public void open_the_browser() throws InterruptedException {
   driver= DataFactory.getDriver();
    Thread.sleep(3000);
    Ak1=new loginPage(driver);
    Thread.sleep(3000);
   Ak2=new RegisterAccountPage(driver);
   Ak2.ClickOnAccountButton();
    Thread.sleep(3000);
     Ak1.UserClickonLoginButton();


}

   @Then("User Enters username {string} and  Pass  {string}")
   public void user_enters_username_and_pass(String EmailAddress, String Password) {
       Ak1=new loginPage(driver);
      Ak1.EnterUserName(EmailAddress);
       Ak1.EnterPassword(Password);
       Ak1.ClickOnLoginButton();
       //Ak1.ClickOnLoginButton();
   }

@When("Log out the application")
public void log_out_the_application() {
    System.out.println("currently sate in Ahemdabad");
    System.out.println();
}
}