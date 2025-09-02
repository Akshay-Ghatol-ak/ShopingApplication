Feature: E-Commerce Shopping Application
  Scenario Outline: Verify User  Register the Account for E-Commerce Shopping Application

    Given Click on register account button
    Then User enters all persanal details "<FirstName>","<LastName>","<E-Mail>", "<Telephone>" ,"<Password>", "<PasswordConfirm>"
    When Check radio button for subscriber "<Newsletter>"
    Then Select check box button for read and aggree permission "<AgrreeButtonCheckBoxx>"
    When Click on continue button


    Examples:
      | FirstName |  | LastName | E-Mail                         | Telephone  | Password     | PasswordConfirm | Newsletter | AgrreeButtonCheckBoxx |
      |           |  |          |                                |            |              |                 |            | SelectCheckBox        |
      | fghjjk    |  | Wilson   | em.ilson@gmail.com             | 12345      | Pauuuuss@2   | Pass@2024       | No         | SelectCheckBox        |
      | 1234567   |  | Smith    | em.ilson@gmail.com             | 9988776655 | Hello@2025   | Hello@2025      | Yes        | SelectCheckBox        |
      | Sophia    |  | Taylor   | kkadjnjnjndjanoa.t89@yahoo.com | 9123456789 | Qw6er8ty@202 | Qw6er8ty@202    | No         | SelectCheckBox        |
      | Sophia    |  | Taylor   | rjidjnndoha.tor@yahoo.com      | 9123456789 | dddy@2024    | dddy@2024       | Yes        | SelectCheckBox        |