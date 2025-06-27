public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    public Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    //overload constructors  => Allow a class to have multiple constructors with different parameters


    public void study(){
        System.out.println(this.name + " is studying.");
    }

}
