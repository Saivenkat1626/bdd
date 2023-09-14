@all @login
Feature: User Login
Registered User Should be able to Login to acess account Details
Background: 
Given user Launch Chrome Browser
When user open url "https://tutorialsninja.com/demo/"
And click on myaccount
And click Login

@validcredentials
Scenario Outline: Succesful Login with validcredentials
When user enter email as <email> and password <password>
And click on login
Then page  should be"Edit your account information"
And close browser
Examples: 
|email                     |password|
|"saivenkatesh.m@gmail.com"|"Sairam"|
|"iggsr@gmail.com"         |"Sairam"|
@invalidcredentials
Scenario Outline: Succesful Login with invalidcredentials
When user enter email as <invalidemail> and password <invalidpassword>
And click on login
Then page  should be"Warning No match for E-Mail Address and or Password"
And close browser
Examples: 
|invalidemail                     |invalidpassword|
|"saivenkatesh@gmail.com"         |"Saira"|
|"igr@gmail.com"                  |"Sairm"|
@invalidemailandvalidpassword
Scenario Outline: Succesful Login with invalidemail and valid password
When user enter email as <invalidemail> and password <validpassword>
And click on login
Then page  should be"Warning No match for E-Mail Address and or Password"
And close browser
Examples: 
|invalidemail                     |validpassword|
|"saivenkatsh@gmail.com"          |"Sairam"|
|"igr@gmil.com"                   |"Sairam"|
@validemailandinvalidpassword
Scenario Outline: Succesful Login with validemail and invalid password
When user enter email as <validemail> and password <invalidpassword>
And click on login
Then page  should be"Warning No match for E-Mail Address and or Password"
And close browser
Examples: 
|validemail                     |invalidpassword|
|"saivenkatsh.m@gmail.com"      |"Saram"|
|"igr@gmail.com"                |"Sairm"|
@withoutenterdetails
Scenario: Succesful Login without enter details
And click on login
Then page  should be"Warning No match for E-Mail Address and or Password"
And close browser
@forgetpassword
Scenario: Click on Forget Password
When click on forgetpassword
Then page should be"Forgot Your Password?"
And close browser
@placeholdertext
Scenario: Verify E-Mail Address and Password text fields in the Login page have the place holder text 
When verify email address field place holder text visible or not
And verify password field place holder text visivle or not
And close browser