public class MainPoly24 {
    public static void main(String[] args){
        //Polymorphism => Objects can identify as other objects;
        //Objects can be treated as objects of a common superclass
        Vehiculo vehiculo = new Carro();
        Vehiculo vehiculo2 = new Bike();

        Carro carro = new Carro();
        Bike bike = new Bike();

        Vehiculo[] carros = {carro,bike};

        for(Vehiculo vehiculos : carros){
            vehiculos.go();
        }

        //runtime polymorphims => method executed basen on actual type of object
    }
}
