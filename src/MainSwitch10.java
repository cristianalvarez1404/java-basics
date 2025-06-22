import java.util.Scanner;

public class MainSwitch10 {
    public static void main(String[] args){
        //Enhance switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekday");
            case "Sundat" -> System.out.println("It is a weekday");
            default -> System.out.println(day + " is not a day");
        }

        switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"
                    -> System.out.println("It is a weekday");
            case "Saturday", "Sunday"
                    -> System.out.println("It is a weekday");
            default -> System.out.println(day + " is not a day");
        }

    }
}
