package seleccion;

public class Entrenador extends Persona {
    
    protected int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }


    @Override
    public void concentrarse() {
        System.out.println("Concentrado para juego");
    }


    @Override
    public void viajar() {
        System.out.println("Viajando para partido de visitante");  
    }


    protected void dirigirPartido(){
        System.out.println("Dirigiendo partido");
    }


    protected void dirigirEntrenamiento(){
        System.out.println("Dirigiendo entrenamiento");
    }

}
