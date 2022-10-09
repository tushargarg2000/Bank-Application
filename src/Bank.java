public interface Bank {

    void addMoney(int money);

    boolean withdrawMoney(int money);

    int checkBalance();

    double calculateInterestOnBalance(int year);
}
