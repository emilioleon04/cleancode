package seleccion;

public abstract class Persona { // nombre de clases escrito en UpperCamelCase
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    
    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public abstract void concentrarse();


    public abstract void viajar();

}
