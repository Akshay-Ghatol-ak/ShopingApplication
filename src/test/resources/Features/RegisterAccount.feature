Feature: E-Commerce Shopping Application
  Scenario Outline: Verify User Register the Account for E-Commerce Shopping Application

    Given Click on register account button
    Then User enters all persanal details "<FirstName>","<LastName>","<E-Mail>", "<Telephone>" ,"<Password>", "<PasswordConfirm>"
    When Check radio button for subscriber "<Newsletter>"
    Then Select check box button for read and aggree permission "<AgrreeButtonCheckBoxx>"
    When Click on continue button

    Examples:
      | FirstName | LastName | E-Mail               | Telephone  | Password  | PasswordConfirm | Newsletter | AgrreeButtonCheckBoxx |
      | Akshay 4  | Ghatol   | akshay@testmail.com  | 9876543210 | Test@1234 | Test@1234       | Yes        | Checked               |
      | Rahul  7  | Patil    | rahul.patil@mail.com | 9123456789 | Pass@123  | Pass@123 7      | No         | Checked               |
