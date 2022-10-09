public class Main {

    public static void main(String[] args){

        SBI account = new SBI(123,"Tushar",0,5.2);

        Kotak_Bank account1 = new Kotak_Bank(1234,"Anand",1000000,7);


        account.addMoney(100);

        String password = "Azizul";

        account.setBalance(account1.balance, "Azizul");

        account.withdrawMoney(50);
        int balance = account.checkBalance();

        System.out.println("The balance is "+balance);

        double interest = account.calculateInterestOnBalance(10);

        System.out.println("Interest is "+interest);

    }

}
