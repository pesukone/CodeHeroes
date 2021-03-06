Feature: User can delete a reference by clicking "Delete" button

  Scenario: user can delete a book reference
    Given a book reference with key "MW34" author "Mika Waltari" title "Sinuhe" year "1934" publisher "Otava" is created
    And Edit is pressed
    When Delete is pressed
    And popup is accepted
    Then system will respond with "Reference deleted successfully!"

  Scenario: user can cancel deleting a book reference
    Given a book reference with key "MW34" author "Mika Waltari" title "Sinuhe" year "1934" publisher "Otava" is created
    And Edit is pressed
    When Delete is pressed
    And popup is not accepted
##    Then system will respond with "Deletion cancelled"
