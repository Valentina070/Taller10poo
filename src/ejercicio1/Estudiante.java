
package ejercicio1;

public class Estudiante extends Persona {
    
    // Propiedades
    protected String grado;
    
    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }
    
    // Método para presentarse
    @Override
    public void presentarse() {
        System.out.println("Mi nombre es " + nombre); 
        System.out.println("Mi edad es "+ edad);
        System.out.println("Pertenezco al grado "+ grado);
    }
}
