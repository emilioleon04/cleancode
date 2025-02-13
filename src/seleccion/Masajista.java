package seleccion;

public class Masajista extends Persona { // cada clase debe tener su propio archivo 
    
    protected String profesion;
    protected int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }


    @Override
    public void concentrarse() {
        System.out.println("Concentrado para juego");
    }


    @Override
    public void viajar() {
        System.out.println("Viajando para partido de visitante");  
    }


    protected void darMasaje(){
        System.out.println("Dando masaje a futbolista");
    }

    
}
