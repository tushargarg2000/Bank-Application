public class SBI implements Bank{

    private int accountNo;
    private String name;
    private int balance;
    private double interestRate;

    private String password = "Bharat";

    public void setPassword(String password,String oldPassword) {

        if(this.password==oldPassword)
        this.password = password;

        else{
            System.out.println("Not an authenicated user");
        }
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

//    public void setBalance(int balance,String password) {
//
//        if(password=="Mallick") {
//            this.balance = balance;
//            System.out.println("Allowed to change the values");
//        }
//        else{
//            System.out.println("The password is wrong you cant access the balance");
//
//        }
//    }

    public double getInterestRate() {
        return interestRate;
    }

    public SBI(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = ;//Random Number
        this.name = name;
        this.balance = 0;

    }

    @Override
    public void addMoney(int money) {
            balance = balance + money;
        System.out.println("Your total balance is "+balance);
    }

    @Override
    public boolean withdrawMoney(int money) {

        if(money<=balance){
            balance = balance - money;
            System.out.println(money + "Has been withdrawn");
            System.out.println("Your total balance is "+balance);
            return true;
        }
        else {
            System.out.println("Kmm paise hein");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterestOnBalance(int year) {

        double interest = balance*interestRate*year/100;

        return interest;
    }
}
