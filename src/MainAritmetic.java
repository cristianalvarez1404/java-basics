
public class MainAritmetic {
    public static void main(String[] args){
        //Aritmetic operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;
        z = x % y;

        //Aumented assigment operators
        x = x + y;
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;

        //Incremenet and Decrement operators
        int a = 1;
        a++;
        a--;

        //Order operators => [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(z);
        System.out.println(x);
        System.out.println(a);
        System.out.println(result);
    }
}