import java.util.Random;

public class MainStatments {
    public static void main(String[] args){
        //if staments

        int age = -5;

        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if (age < 0 ) {
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        //random numbers
        Random random = new Random();
        int number = random.nextInt(1,6);
        double number2 = random.nextDouble(1,6);
        boolean number3 = random.nextBoolean();
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);


    }
}