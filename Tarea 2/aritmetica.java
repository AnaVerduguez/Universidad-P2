/*Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números.*/

import java.util.Scanner;

public class aritmetica {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		
		//Declaro mis variables a utilizar
		int num1, num2, suma, producto, diferencia;
		double cociente;
		
		//Le pido al usuario que ingrese dos numeros y los guardo en las variables
		System.out.println("Ingrese el primer numero:");
		num1= entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero:");
		num2= entrada.nextInt();
		
		//Comienzo a realizar las operaciones con los numeros ingresados por teclado
		suma= num1 + num2;
		
		producto= num1 * num2;
	
		diferencia= num1 - num2;
		
		cociente= num1 / num2;
		
		//Realizo un print por pantalla con los resultados obtenidos
		System.out.println("Los numeros son: " + num1 + " y " +num2);
		System.out.println("La suma entre los dos numeros es: " +suma);
		System.out.println("El producto entre los dos numeros es: " +producto);
		System.out.println("La diferencia entre los dos numeros es: " +diferencia);
		System.out.println("El cociente entre los dos numeros es: " +cociente);
	}
}
