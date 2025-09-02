package org.StepDefinitions;

import Factory.DataFactory;
import Pages_Module_POM.RegisterAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterAccount {
    WebDriver driver;
    RegisterAccountPage AK2;

    @Given("Click on register account button")
    public void click_on_register_account_button() throws InterruptedException {
        driver = DataFactory.getDriver();
        AK2 = new RegisterAccountPage(driver);
        Thread.sleep(2000);
        AK2.ClickOnAccountButton();
        Thread.sleep(2000);
        AK2.ClickOnRegiterButton();

    }

    @Then("User enters all persanal details {string},{string},{string}, {string} ,{string}, {string}")
    public void user_enters_all_persanal_details_$ert43210_test_test(String FirstName, String LastName, String Email, String TelePhone, String Password, String PasswordConfirm) throws InterruptedException {
        AK2.UserInformation(FirstName,LastName,Email,TelePhone);
        Thread.sleep(2000);

        if (Password.equals(PasswordConfirm)) {
            Thread.sleep(1000);
            AK2.EnterPassword(Password);

            Thread.sleep(1000);
            AK2.EnterConfirmPassword(PasswordConfirm);
        } else if (!Password.equals(PasswordConfirm)) {
            AK2.EnterPassword(Password);
           // System.out.println("Akshay");
            // String ActualResultConfirmMessage=AK2.ConfirmeMessagenotMachPassword();
            // Assert.assertTrue(ActualResultConfirmMessage.contains("Password confirmation does not match password!"));
        }
        Thread.sleep(1000);


    }

    @When("Check radio button for subscriber {string}")
    public void check_radio_button_for_subscriber(String Newsletter) throws InterruptedException {
        if (Newsletter.equalsIgnoreCase("Yes")) {
            AK2.YesRaidoButtonSubcriber();
            Thread.sleep(1000);
        } else if (Newsletter.equalsIgnoreCase("No")) {
            AK2.NoRaidoButtonSubcriber();
            Thread.sleep(1000);
        }

    }

    @Then("Select check box button for read and aggree permission {string}")
    public void select_check_box_button_for_read_and_aggree_permission(String AgrreeButtonCheckBoxx) {
        if (AgrreeButtonCheckBoxx.equalsIgnoreCase("SelectCheckBox")) {

            AK2.SelectAgreeCheckBoButton();
            // AK2.SelectContinueButton();
        } else if (AgrreeButtonCheckBoxx.equalsIgnoreCase("NotSelectCheckBox")) {
            System.out.println("Check Box Not Select");
            // String AtcualMessageAree = AK2.ErrorMesssageDisplayAgreeCheckBox();
            //  Assert.assertTrue(AtcualMessageAree.contains("Warning: You must agree to the Privacy Policy!"));
        }
    }


    @When("Click on continue button")
    public void click_on_continue_button() {
        AK2.SelectContinueButton();

        try {
            String actualResult = AK2.AccountSuccessfully();
            String ExpectedResult = "Your Account Has Been Created!";
            //  Assert.assertEquals(actualResult,ExpectedResult);
            System.out.println("Account successfully" + actualResult);
        } catch (Exception e) {
            try {

                String ActualResultConfirmMessage = AK2.ConfirmeMessagenotMachPassword();
                Assert.assertTrue(ActualResultConfirmMessage.contains("Password confirmation does not match password!"));
            } catch (Exception e1) {
                try {
                    String ActualResultAll = AK2.getAllmessage();
                    // String AtcualMessageAree= AK2.ErrorMesssageDisplayAgreeCheckBox();


                    Assert.assertTrue(ActualResultAll.contains("First Name must be between 1 and 32 characters!"));
                    Assert.assertTrue(ActualResultAll.contains("Last Name must be between 1 and 32 characters!"));
                    Assert.assertTrue(ActualResultAll.contains("E-Mail Address does not appear to be valid!"));
                    Assert.assertTrue(ActualResultAll.contains("Telephone must be between 3 and 32 characters!"));
                    Assert.assertTrue(ActualResultAll.contains("Password must be between 4 and 20 characters!"));
                    //Assert.assertTrue(AtcualMessageAree.contains("Warning: You must agree to the Privacy Policy!"));
                } catch (Exception e3) {
                    String agreeMessage = AK2.ErrorMesssageDisplayAgreeCheckBox();
                    Assert.assertTrue(agreeMessage.contains("Warning: You must agree to the Privacy Policy!"));

                }
                finally {
                    System.out.println("All_Ready_Used_email_or_ResitedMail");

                }
            }


        }
    }


}
