Feature:user account

  Background:
    Given user is in login page

 @smoke
  Scenario: 1 valid user logs into application

#    Given user is in login page
    When he logins into the application username "sriram.angajala@gmail.com" password "London12"
    Then he should see a dashboard

  Scenario Outline: 2 valid user cannot logs into application with invalid details

#    Given user is in login page
    When he logins into the application username "<username>" password "<password>"
    Then he should see an error message as "<message>"

    Examples:
      | username         | password | message                                                          |
      |                  | London12 | Please enter your email                                          |
      |                  |          | Please enter your email                                          |
      | dsffd            | dsffd    | Wrong email                                                      |
      | tenna@banana.com | dsffd    | Login was unsuccessful. Please correct the errors and try again. |


@radha1
  Scenario: user change the address

  When he logins into the application username "sriram.angajala@gmail.com" password "London12"
  When he go to my account
  When he go to my address
  When he fill the details of account "sriram","angajala","test@test.com","United Kingdom","London","121","12121","1212121"
  Then the account should have text "12121"



#    sneha - basket
#  indu advance search
#  prasanna - register and login
#  sirisha - my account
#  hima - apply as vendor - https://demo.nopcommerce.com/vendor/apply
#  VIndo - https://demo.nopcommerce.com/new-online-store-is-open
#  euloze - https://demo.nopcommerce.com/contactus
#  checkout - https://demo.nopcommerce.com/cart

