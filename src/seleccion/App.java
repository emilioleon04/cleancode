package seleccion; // nombre de paquetes en lowecase

public class App {
    public static void main(String[] args) {
        
        Futbolista futbolista1 = new Futbolista(1, "Santiago", "Gimenez", 24, 7, "DC");
        Entrenador entrenador1 = new Entrenador(1, "Carlo", "Ancelotti", 60, 5);
        Masajista masajista1 = new Masajista(1, "Yael", "Toledo", 20, "Fisioterapeuta", 5);


        System.out.println(futbolista1.numJugador);
        System.out.println(futbolista1.posicionEnCancha);
        futbolista1.concentrarse();
        entrenador1.dirigirEntrenamiento();
        masajista1.darMasaje();

    }
}
