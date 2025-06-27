public class Car {
    private String make = "Ford";
    private String model = "Mustang";
    private int year = 2025;
    private double price = 58000.99;
    private boolean isRunning = false;

    public void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    public void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    public void drive(){
        System.out.println("You drive the " + model);
    }

    public void brake(){
        System.out.println("You brake the " + model);
    }

    public String getModel(){
        return this.model;
    }

    @Override
    public String toString() {
        return this.make + " " + this.year + " " + this.model;
    }
}
