/*Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e
imprima el resultado. [Sugerencia: use el operador residuo]. */

import java.util.Scanner;

public class multiplos {
	public static void main(String args[]){
		Scanner entrada=new Scanner(System.in);
		
		//Declaro mis variables a utilizar
		int num1, num2,resto;
				
		//Le pido al usuario que ingrese dos numeros enteros y los guardo en las variables
		System.out.println("Ingrese el primer numero entero:");
		num1= entrada.nextInt();
				
		System.out.println("Ingrese el segundo numero entero:");
		num2= entrada.nextInt();
		
		//El resto me permite saber si un numero es multiplo o no. Un numero es multiplo cuando su resto es igual a 0
		resto= num1 % num2;
		
		//Creamos un condicional que me permita saber si es multiplo o no
		if (resto==0) {
			System.out.println(num1 + " es multiplo de " + num2);
		}else {
			System.out.println(num1 + " NO es multiplo de " + num2);
		}
	}
}
