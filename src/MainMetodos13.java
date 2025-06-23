import java.util.Scanner;

public class MainMetodos13 {
    // DECLARE VARIABLES
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //methods => a block of reusable code that is executed whem called()
        //overloaded methods = methods that share the same name, but different parameter signiture = name + properties

        //JAVA BANKING PROGRAM
        double balance = 10.99;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            // DISPLAY MENU
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // GET AND PROCESS USER CHOICE
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                //SHOW BALANCE()
                case 1 -> showBalance(balance);
                //DEPOSIT()
                case 2 -> balance += deposit();
                //WITHDRAW()
                case 3 -> balance -= withdraw(balance);
                //EXIT()
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }

    public static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n",balance);
    }

    public static double deposit(){
        double amount;
        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount > 0 ){
            return amount;
        }else {
            System.out.println("Only positive values");
            return 0;
        }
    }

    public static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient fonds");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}
