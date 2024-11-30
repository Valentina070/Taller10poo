
package ejercicio1;

public class Profesor extends Persona {
    
    // Propiedades
    protected String materia;
    
    // Constructor
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
    
    // Método para presentarse
    @Override
    public void presentarse() {
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi Edad es "+ edad);
        System.out.println("Hoy les estare impartiendo la materia de "+ materia);
         
    }
}
