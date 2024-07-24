package memo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.*;

public class AccountSteps {
    private Account account;
    private boolean operationResult;

    @Given("Account with a balance of {double}")
    public void accountWithBalance(Double initialBalance) {
        account = new Account(initialBalance);
    }

    @When("Trying to withdraw {double}")
    public void tryingToWithdraw(Double amount) {
        operationResult = account.withdraw(amount);
    }

    @When("Trying to deposit {double}")
    public void tryingToDeposit(Double amount) {
        operationResult = account.deposit(amount);
    }

    @Then("Account balance should be {double}")
    public void accountBalanceShouldBe(Double expectedBalance) {
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }

    @Then("Operation should be denied due to insufficient funds")
    public void operationShouldBeDeniedDueToInsufficientFunds() {
        assertFalse(operationResult);
    }

    @Then("Operation should be denied due to negative sum")
    public void operationShouldBeDeniedDueToNegativeSum() {
        assertFalse(operationResult);
    }
    @Then("Account balance should remain {double}")
    public void accountBalanceShouldRemain(Double expectedBalance) {
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }
}
