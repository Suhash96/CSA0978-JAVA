 class Account {
    private double balance;
    private final double PENALTY_FEE = 5.0; // Penalty fee for withdrawals that exceed the balance
    private double interestRate;

    public Account(double initialBalance) {
        balance = initialBalance;
        interestRate = 0.01; // 1% interest rate
    }

    public Account() {
        this(0.0); // default initial balance of $0
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeds the available balance. Penalty fee of $" + PENALTY_FEE + " applied.");
            balance -= PENALTY_FEE;
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
}