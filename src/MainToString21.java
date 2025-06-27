public class MainToString21 {
    public static void main(String[] args){
        //Method overriding = when a subclass provides its own implementation of a method that already exists.
        Dogg dog = new Dogg();
        Catt catt = new Catt();
        Fishh fishh = new Fishh();

        dog.move();
        catt.move();
        fishh.move();
        //tostring method => Method inherit from the Object class
        //Used to return a string representation of an object
        Car car = new Car();
        System.out.println(car);
    }


}
