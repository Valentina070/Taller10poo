
package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        
        Vehiculo vehiculo= new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();
        
        vehiculo.moverse();
        System.out.println();
        bicicleta.moverse();
        System.out.println("");
    }
}
