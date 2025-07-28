#Feature: Form Validation for Name, Email, Phone, and Age Fields
#
  #Scenario: Enter valid first name and leave last name blank
    #Given the user is on the form page
    #When the user enters "Ishan" as the first name
    #And leaves the last name blank
    #And enters a valid age "25"
    #And enters a valid email "ishan@example.com"
    #And enters a valid phone number "9876543210"
    #Then the form should display a validation error for the last name
#
  #Scenario: Leave first name blank and enter valid last name
    #Given the user is on the form page
    #When the user leaves the first name blank
    #And enters "Singha" as the last name
    #And enters a valid age "25"
    #And enters a valid email "ishan@example.com"
    #And enters a valid phone number "9876543210"
    #Then the form should display a validation error for the first name
#
  #Scenario: Enter invalid email and valid phone number
    #Given the user is on the form page
    #When the user enters "Ishan" as the first name
    #And enters "Singha" as the last name
    #And enters a valid age "25"
    #And enters an invalid email "ishan#example"
    #And enters a valid phone number "9876543210"
    #Then the form should display a validation error for the email field
#
  #Scenario: Enter valid email and invalid phone number
    #Given the user is on the form page
    #When the user enters "Ishan" as the first name
    #And enters "Singha" as the last name
    #And enters a valid age "25"
    #And enters a valid email "ishan@example.com"
    #And enters an invalid phone number "abc123"
    #Then the form should display a validation error for the phone number field
#
  #Scenario: Enter invalid age input
    #Given the user is on the form page
    #When the user enters "Ishan" as the first name
    #And enters "Singha" as the last name
    #And enters an invalid age "abc"
    #And enters a valid email "ishan@example.com"
    #And enters a valid phone number "9876543210"
    #Then the form should display a validation error for the age field
    #
    #Feature: Work and Card Section Validation
#
  #Scenario: Select Student and enter School Name
    #Given the user is on the form page
    #When the user selects "Student" in the Work section
    #And enters "Springfield High School" as the school name
    #And selects "Apply New Card" from the Action dropdown
    #Then the form should accept the input and proceed
#
  #Scenario: Select Student and leave School Name blank
    #Given the user is on the form page
    #When the user selects "Student" in the Work section
    #And leaves the school name field blank
    #And selects "Renewal Old Card" from the Action dropdown
    #Then the form should display a validation error for the school name
#
  #Scenario: Select Employee and enter Company Name
    #Given the user is on the form page
    #When the user selects "Employee" in the Work section
    #And enters "TechCorp Pvt Ltd" as the company name
    #And selects "Renewal Old Card" from the Action dropdown
    #Then the form should accept the input and proceed
#
  #Scenario: Select Employee and leave Company Name blank
    #Given the user is on the form page
    #When the user selects "Employee" in the Work section
    #And leaves the company name field blank
    #And selects "Apply New Card" from the Action dropdown
    #Then the form should display a validation error for the company name
#
  #Scenario: Do not select any action from Card dropdown
    #Given the user is on the form page
    #When the user selects "Student" in the Work section
    #And enters "Springfield High School" as the school name
    #And does not select any option from the Action dropdown
    #Then the form should display a validation error for the Action field
#
#
  #Scenario: Enter valid data for all fields
    #Given the user is on the form page
    #When the user enters "Ishan" as the first name
    #And enters "Singha" as the last name
    #And enters a valid age "25"
    #And enters a valid email "ishan@example.com"
    #And enters a valid phone number "9876543210"
    #Then the form should be submitted successfully


Feature: Library Card Form Validation

  # --- Name, Email, Phone, Age Field Validations ---

  Scenario: Enter valid first name and leave last name blank
    Given the user is on the form page
    When the user enters "Ishan" as the first name
    And leaves the last name blank
    And enters a valid age "25"
    And enters a valid email "ishan@example.com"
    And enters a valid phone number "9876543210"
    Then the form should display a validation error for the last name

  Scenario: Leave first name blank and enter valid last name
    Given the user is on the form page
    When the user leaves the first name blank
    And enters "Singha" as the last name
    And enters a valid age "25"
    And enters a valid email "ishan@example.com"
    And enters a valid phone number "9876543210"
    Then the form should display a validation error for the first name

  Scenario: Enter invalid email and valid phone number
    Given the user is on the form page
    When the user enters "Ishan" as the first name
    And enters "Singha" as the last name
    And enters a valid age "25"
    And enters an invalid email "ishan#example"
    And enters a valid phone number "9876543210"
    Then the form should display a validation error for the email field

  Scenario: Enter valid email and invalid phone number
    Given the user is on the form page
    When the user enters "Ishan" as the first name
    And enters "Singha" as the last name
    And enters a valid age "25"
    And enters a valid email "ishan@example.com"
    And enters an invalid phone number "abc123"
    Then the form should display a validation error for the phone number field

  Scenario: Enter invalid age input
    Given the user is on the form page
    When the user enters "Ishan" as the first name
    And enters "Singha" as the last name
    And enters an invalid age "abc"
    And enters a valid email "ishan@example.com"
    And enters a valid phone number "9876543210"
    Then the form should display a validation error for the age field

  # --- Work and Card Section Validations ---

  Scenario: Select Student and enter School Name
    Given the user is on the form page
    When the user selects "Student" in the Work section
    And enters "Springfield High School" as the school name
    And selects "Apply New Card" from the Action dropdown
    Then the form should accept the input and proceed

  Scenario: Select Student and leave School Name blank
    Given the user is on the form page
    When the user selects "Student" in the Work section
    And leaves the school name field blank
    And selects "Renewal Old Card" from the Action dropdown
    Then the form should display a validation error for the school name

  Scenario: Select Employee and enter Company Name
    Given the user is on the form page
    When the user selects "Employee" in the Work section
    And enters "TechCorp Pvt Ltd" as the company name
    And selects "Renewal Old Card" from the Action dropdown
    Then the form should accept the input and proceed

  Scenario: Select Employee and leave Company Name blank
    Given the user is on the form page
    When the user selects "Employee" in the Work section
    And leaves the company name field blank
    And selects "Apply New Card" from the Action dropdown
    Then the form should display a validation error for the company name

  Scenario: Do not select any action from Card dropdown
    Given the user is on the form page
    When the user selects "Student" in the Work section
    And enters "Springfield High School" as the school name
    And does not select any option from the Action dropdown
    Then the form should display a validation error for the Action field

  # --- Successful Submission ---

  Scenario: Enter valid data for all fields
    Given the user is on the form page
    When the user enters "Ishan" as the first name
    And enters "Singha" as the last name
    And enters a valid age "25"
    And enters a valid email "ishan@example.com"
    And enters a valid phone number "9876543210"
    Then the form should be submitted successfully

