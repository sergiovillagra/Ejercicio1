Feature: Bank account operations
  Scenario: Successfully create an account with default balance
    Given I create an account with CBU 123456789
    Then The account balance should be 0.0

  Scenario: Successfully create an account with an initial balance
    Given I create an account with CBU 987654321 and a balance of 500.0
    Then The account balance should be 500.0

  Scenario: Successfully deposit money into an account
    Given An account with CBU 123456789 and a balance of 1000.0
    When I deposit 200.0 into the account
    Then The account balance should be 1200.0

  Scenario: Cannot deposit a negative amount
    Given An account with CBU 123456789 and a balance of 1000.0
    When I try to deposit -100.0 into the account
    Then The operation should be denied
    And The account balance should remain 1000.0

  Scenario: Successfully withdraw money when the balance is sufficient
    Given An account with CBU 123456789 and a balance of 1000.0
    When I withdraw 300.0 from the account
    Then The account balance should be 700.0

  Scenario: Cannot withdraw more money than available balance
    Given An account with CBU 123456789 and a balance of 1000.0
    When I try to withdraw 1100.0 from the account
    Then The operation should be denied due to insufficient funds
    And The account balance should remain 1000.0
