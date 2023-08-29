package simondice;

//Esta clase me permite almacenar la puntuacion del jugador
public class Puntuacion {
    private int puntaje;


    //Constructor que me permite crear e inicializar un objeto creado a partir de una clase. En este caso score
    public Puntuacion() {
        puntaje = 0;
    }
    
    //Acumulador que me permite guardar el puntaje (10 puntos) en caso de que acierte el jugador
   public void AumentarPuntaje() {
       puntaje= puntaje + 1;
   }

    //El metodo get me permite devolver o mostrar el puntaje del jugador
    public int getPuntaje() {
        return puntaje;
    }
}
