public class MainLoops12 {
    public static void main(String[] args) throws InterruptedException {
        //Loops
//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while(name.isEmpty()){
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//
        //For loop
//        for(int i = 0; i <= 10; i+=2){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }

        //Break and continue
//        for(int i = 0; i < 10; i++){
//            if(i == 5) continue;
//            if(i == 8) break;
//            System.out.println(i);
//        }

        // nested loop
//        for(int i = 1; i <= 9; i++){
//
//            for(int y = 1; y <= 3 ; y++){
//                System.out.print("a");
//            }
//            System.out.print(i + " ");
//        }

        int column = 10;
        int row = 15;
        char character = '*';

        for(column = 1; column <= 5;  column++){
            System.out.println("");
            for(row = 1; row <= 10; row++){
                System.out.print(character);
            }
        }
    }
}
