package memo1.ejercicio1;

public class Account {
    private Long cbu;
    private Double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public boolean withdraw(Double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(Double amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }
}

