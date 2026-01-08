Feature: login Feature

  Scenario: Verify login page
    Given User is on home Page
    When the login page should display the following elements
    | element               | expected             |
    | logo                  | true                 |
    | bannerImg             | true                 |
    | welcomeTitle          | Welcome              |
    | signINTo              | Sign In to Continue  |
    | userEmailTxt          | Username or email    |
    | userIcon              | true                 |
    | passwordTxt           | Password             |
    | eyeIcon               | true                 |
    | forgotPasswordTxt     | Forgot Password?     |
    | signInWith            | Or sign in with      |
