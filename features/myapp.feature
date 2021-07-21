Feature: Test smoke scenarios of Facebook

  Scenario Outline: Test facebook with valid credentials
    Given Open firefox and start application
    When I provide valid "<username>" and "<password>"
    Then User should be able to login

    Examples: 
      | username | password |
      | luckym99 | root123  |
      | akashm   | abc123   |
      | tejas123 | sai999   |
