public class Studentt extends Person{
    double gpa;

    public Studentt(String first,String last,double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    public void showGPA(){
        System.out.println(this.first + " 's gpa is: " + this.gpa );
    }
}
