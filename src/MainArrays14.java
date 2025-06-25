import java.util.*;

public class MainArrays14 {
    public static void main(String[] args){
        //array = a collection of values of the same data type
        String[] fruits = {"apple","orange","bananas"};
        int[] nun = new int[5];
        int[] num2 = {1,2,3,4,5};
        int[][] num4 = new int[5][3];
        int[][] num5 = {
                {1,2,3,4},
                {1,2}
        };

        //lista dinamica => Agregar o quitar elementos dinamicamente. Solo pueden contener objetos no tipos primitivos
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("cri");
        nombres.add("and");

        //List - interfaz gráfica Se usa cuando quieres cambiar fácilmente entre diferentes implementaciones (como LinkedList).
        //ArrayList implementa List
        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);

        //Array - clase utilitaria para trabajar con arrays normales
        int[] numss = {3,1,2};
        Arrays.sort(numss);

        //LinkedList => lista enlazada
        LinkedList<String> nombress = new LinkedList<>();
        nombress.add("Ana");

        //Set => sin duplicados, se utiliza el Hashset

        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Manzana");

        //Map => Es como un diccionario, cada entrada tiene clave-valor. Se utiliza el hashMap
        HashMap<String,Integer> edades = new HashMap<>();
        edades.put("Ana",25);
        edades.put("Luis",30);

        System.out.println(edades);


        fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
        //Arrays.sort(fruits);
        //Arrays.fill(fruits,"pineapple");

        for(String banana : fruits){
            System.out.println(banana);
        }

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = numbers[3];



    }

}
