
package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Andrea",16);
        Estudiante estudiante = new Estudiante("Daniela Zuñiga", 17, "11");
        Profesor profesor = new Profesor("Carlos Martinez", 38, "Matematicas");
        
        persona.presentarse();
        System.out.println("");
        System.out.println("Estudiante");
        estudiante.presentarse();
        System.out.println();
        System.out.println("Profesor");
        profesor.presentarse();
    }
}
