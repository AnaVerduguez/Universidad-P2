/*Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π.
[nota: también puede utilizar la constante predefinida Math.PI para el valor de π. Esta constante es más precisa que el valor
3.14159.

Use las siguientes fórmulas (r es el radio):
diámetro = 2r
circunferencia = 2πr
área = πr2

No almacene los resultados de cada cálculo en una variable. En vez de ello, especifique cada cálculo como el valor que
se imprimirá en una instrucción System.out.printf. Los valores producidos por los cálculos del área y de la circunferencia son 
números de punto flotante. Dichos valores pueden imprimirse con el especificador de formato %f 
*/

import java.util.Scanner;

public class diametro {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		
		//Declaro mis variables a utilizar
		int radio;
		
		//Pido al usuario que ingrese por teclado el radio del circulo que me permitira realizar luego las operaciones
		System.out.println("Ingrese el radio de un circulo:");
		radio= entrada.nextInt();
		
		//Imprimo por pantalla los resultados obtenidos del circulo en una instruccion
		System.out.printf("El diametro del circulo es: " + 2 * radio);
		System.out.printf(". La circunferencia del circulo es: " + 2 * Math.PI * radio);
		System.out.printf(". El area del circulo es: " + Math.PI * (radio*radio));
		
	}
}