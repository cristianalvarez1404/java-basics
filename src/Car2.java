public class Car2 {
    String model;
    String color;

    public Car2(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
