public class MainAbstraction21 {
    public static void main(String[] args){
        //abstract => used to define abstract classes and methods
        //Abstraction is the process of hiding implementation details
        //and showing only the essential features.
        //Abstract classes CAN'T be instantiated directly
        //Can contain 'abstract' methods => which must be implemented
        //Can contain 'concrete' methods => which are inherited

        //Shape shape = new Shape();
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
    }
}
