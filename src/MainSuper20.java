public class MainSuper20 {
    public static void main(String[] args){
        //super => Refers to the parent class
        //used in constructors and method overriding
        //Calls the parent constructor to initialize attributes

        Person person = new Person("Tom","Riddle");
        Studentt student = new Studentt("Harry","Potter",3.25);
        Employee employee = new Employee("Bob","Marley",3000);
        person.showName();
        student.showGPA();
        employee.showSalary();
    }
}
