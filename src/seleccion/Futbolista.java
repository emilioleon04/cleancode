package seleccion;

public class Futbolista extends Persona {
    
    protected int numJugador;
    protected String posicionEnCancha;

    public Futbolista(int id, String nombre, String apellido, int edad, int numJugador, String posicionEnCancha) {
        super(id, nombre, apellido, edad);
        this.numJugador = numJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

    
    @Override       // poner la etiqueta Override cada que se sobreescriba un metodo
    public void concentrarse() {
        System.out.println("Concentrado para juego");
    }


    @Override
    public void viajar() {
        System.out.println("Viajando para partido de visitante");
    }


    protected void jugarPartido(){  // metodos escritos en lowerCamelCase y tipicamente se utilizan verbos o frases con verbos 
        System.out.println("Jugando partido");
    }


    protected void entrenar(){
        System.out.println("Entrenando");
    }
   
}
