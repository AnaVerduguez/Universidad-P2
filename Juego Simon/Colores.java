package simondice;

import java.awt.Color;
import java.util.Random;

//Esta clase me permite definir los 4 colores para mi juego. Estos son constantes por ende no se cambian.
public class Colores{
	//Los colores estaran almacenados dentro de un arreglo de Strings. Tendremos 4 elementos o colores
    private static String[] colores ={"verde","rojo","azul","amarillo"};
    public static Color ROJO = new Color(255,0,0);
    public static Color AZUL = new Color(0,0,203);
    public static Color VERDE = new Color(0, 192, 0);
    public static Color AMARILLO = new Color(253,231,47);
    private static Random rand = new Random();
    
    //RandomColor me permite elegir un color al azar entre los 4 para definir lo que Simon Diga
    public static String getRandomColor(){
        return colores[rand.nextInt(colores.length)];
    }
    
    //El metodo get me permite devolver o mostrar el color que se eligio 
    public static Color getROJO() {
        return ROJO;
    }

    public static Color getAZUL() {
        return AZUL;
    }

    public static Color getVERDE() {
        return VERDE;
    }

    public static Color getAMARILLO() {
        return AMARILLO;
    }
    
    
}
