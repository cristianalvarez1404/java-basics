import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Loops
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
    }
}
