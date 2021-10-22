public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /** Constructor. */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /** operation's setter. */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /** operation's getter. */
    public String getOperation() {
        return operation;
    }

    /** amount's setter. */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** amount's getter. */
    public double getAmount() {
        return amount;
    }

    /** balance's setter. */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** balance's getter. */
    public double getBalance() {
        return balance;
    }
}
