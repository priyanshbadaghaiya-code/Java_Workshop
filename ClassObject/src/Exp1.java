class Exp {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Setters
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getRemainingBalance() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Exp ba = new Exp();

        ba.setAccountHolder("Aniket Pandey");
        ba.setBalance(10000);
        ba.setWithdrawAmount(2500);

        System.out.println("Account Holder: " + ba.getAccountHolder());
        System.out.println("Remaining Balance: " + ba.getRemainingBalance());
    }
}