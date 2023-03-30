 class Account {
    private double balance;
    private double interestRate;

    public Account(double initialBalance) {
        balance = initialBalance;
        interestRate = 0.05; // 5% interest rate
    }

    public Account() {
        this(0.0); // default initial balance of $0
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= 5.0; // apply $5 penalty
            System.out.println("Insufficient funds. Penalty of $5 applied.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
}