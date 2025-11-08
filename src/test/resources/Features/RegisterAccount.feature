Feature: E-Commerce Shopping Application

  Scenario Outline: Verify user registration for E-Commerce Shopping Application

    Given Click on register account button
    Then User enters all personal details "<FirstName>", "<LastName>", "<E-Mail>", "<Telephone>", "<Password>", "<PasswordConfirm>"
    When Check radio button for subscriber "<Newsletter>"
    Then Select check box for reading and agreeing to permission "<AgreeButtonCheckBox>"
    When Click on continue button

    Examples:
      | FirstName | LastName | E-Mail                  | Telephone  | Password  | PasswordConfirm | Newsletter | AgreeButtonCheckBox |
      | Amit      | Verma    | amit.verma@example.com  | 9812345670 | Amit@789  | Amit@789        | Yes        | Checked             |
