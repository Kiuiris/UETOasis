import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /** Constructor. */
    public Account() {
        balance = 0;
    }

    /** deposit. */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        }
        balance += amount;
    }

    /** withdraw. */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /** make a transaction. */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT)
                && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
        Transaction t = new Transaction(operation, amount, balance);
        transitionList.add(t);
    }

    /** print the transaction history. */
    public void printTransaction() {
        for (Transaction i: transitionList) {
            double amo = Math.round(i.getAmount() * 100.0) / 100.0;
            int num = transitionList.indexOf(i) + 1;
            System.out.print("Giao dich " + num);
            if (i.getOperation().equals(Transaction.WITHDRAW)) {
                System.out.print(": Rut tien $");
            } else {
                System.out.print(": Nap tien $");
            }
            System.out.printf("%.2f", amo);
            double bal = Math.round(i.getBalance() * 100.0) / 100.0;
            System.out.print(". So du luc nay: $");
            System.out.printf("%.2f", bal);
            System.out.println(".");
        }
    }

    /** main. */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();

        acc.addTransaction(1500, "withdraw");
        acc.addTransaction(500, "withdrawAll");
    }
}
