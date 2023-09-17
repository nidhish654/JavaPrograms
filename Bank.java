import java.util.Scanner;
class Bank{
    int accno;
    float balance;
    String name;
    public void read_data(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The Name: ");
        name = inp.nextLine();
        System.out.println("Enter The Account Number :");
        accno = inp.nextInt();
        System.out.println("Enter Balance :");
        balance = inp.nextFloat();
    }
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Ammount to be Deposited");
        int dep = sc.nextInt();
        balance = dep + balance;
        System.out.println("\nAMOUNT DEPOSITED SUCCESSFULLY\n");
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Ammount to be Withdrawn");
        int depp = sc.nextInt();
        balance = balance - depp;
        System.out.println("\nAMOUNT WITHDRAWN SUCCESSFULLY");
    }
    public void check(){
        System.out.println("\nYOUR ACCOUNT BALANCE:" + balance);
    }
    public static void main(String[] args){
        int n;
        Scanner inp = new Scanner(System.in);
        Bank bank = new Bank();
        bank.read_data();
        while(true){
            System.out.println("\n1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check");
            System.out.println("4. Exit");
            System.out.println("Enter The Option : ");
            int opp = inp.nextInt();
            switch(opp){
                case 1: bank.deposit();
                break;
                case 2: bank.withdraw();
                break;
                case 3: bank.check();
                break;
                case 4: System.exit(0);
                break;
                default: break;
            }
        }
    }
}