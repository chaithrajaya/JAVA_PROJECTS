import java.util.Scanner;
class BankAccount{
    private String name;
    private double balance;

BankAccount(String n,double b){
    name = n;
    balance = b;
}
public void deposit(double amount){
    if(amount>0){
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
    else{
        System.out.println("Invalid Amount");
    }
}
public void withdraw(double amount){
    if(amount>0 && amount<=balance){
        balance-=amount;
        System.out.println("Withdrawn: "+amount);
    }
    else{
        System.out.println("Insufficient amount");
    }

}
public void showDetails(){
    System.out.println("Name: "+ name);
    System.out.println("Balance: "+balance);
}
}
public class BankApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter Initial balance: ");
        double balance = sc.nextDouble();

        BankAccount B = new BankAccount(name,balance);

        int choice;
        do{
           System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account Details");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

             choice = sc.nextInt();

             switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    B.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                     B.withdraw(withdrawAmount);
                    break;

                case 3:
                    B.showDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank App!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        


    }
}