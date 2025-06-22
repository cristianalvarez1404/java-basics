import java.util.Scanner;

public class MainTenary {
    public static void main(String[] args){
        //Ternary operator
        //Return 1 of 2 values if a condition is true
        //variable = condition ? iftrue : iffalse;

        int score = 70;
//        if(score > 60){
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours > 12) ? "PM" : "AM";
        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celcius or Fahranheit? (c/f): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°",newTemp);
        scanner.close();

    }
}
