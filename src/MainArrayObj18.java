public class MainArrayObj18 {
    public static void main(String[] args){
        // array objects

        Car2 car1 = new Car2("Mustang","Red");
        Car2 car2 = new Car2("Corvette","Blue");
        Car2 car3 = new Car2("Charger", "Yellow");

        //Car[] cars = new Car[3];
        Car2[] cars = {car1,car2,car3};

//        for (int i = 0; i < cars.length; i++){
//            cars[i].drive();
//        }
        for(Car2 car : cars){
            car.drive();
        }
    }
}
