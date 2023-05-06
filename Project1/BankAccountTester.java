package Project1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("MOMO", 8675309);

        System.out.println(myAccount.name);

        BankAccount yourAccount = new BankAccount("Katara", 1234567, 10000, 101, "01/01/2000");

        System.out.println(yourAccount.name);

        BankAccount secondAccount = new BankAccount("Sokka", 2345678, 5000, 102, "01/01/2001");

        System.out.println(yourAccount.getbalance());
        System.out.println(yourAccount.getdob());
        System.out.println(yourAccount.getssn());
        System.out.println(yourAccount.getaccountNumber());
        System.out.println("===========");

        System.out.println(myAccount.getbalance());
        System.out.println(myAccount.getdob());
        System.out.println(myAccount.getssn());
        System.out.println(myAccount.getaccountNumber());

        System.out.println("===========");
        myAccount.setdob("01/02/2000");
        System.out.println(myAccount.getdob());
        myAccount.setaccountNumber(102);
        System.out.println(myAccount.getaccountNumber());
        System.out.println("===========");
        System.out.println(myAccount.getbalance());
        myAccount.deposit(100);
        System.out.println(myAccount.getbalance());

        System.out.println(yourAccount.getbalance());

        BankAccount.interact(yourAccount, secondAccount);
    }
}
