public class Mainvarargs15 {
    public static void main(String[] args){
        //varargs = allow a method to accept a varying # of arguments

        add(4,5,6);
    }

    static int add(int ...numbers){
        System.out.println(numbers);
        return 1;
    }
}
