import java.util.Scanner;

public class HolaMundo {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
	
		//Declaro mis variables 
        int respuesta= 0;
        
		//Mostramos un mensaje por pantalla al usuario
		System.out.println("Bienvenido a Programacion 2. Estas listo para comenzar?");
		System.out.println("Elija una respuesta:");
		System.out.println("1.POR SUPUESTO QUE SI!");  
        System.out.println("2.NO, AUN NO");
        
		//Guardo la respuesta en una variable
		respuesta=in.nextInt();
		
		//Creo un condicional que me muestre un resultado u otro segun elija el usuario
		if(respuesta == 1){
			System.out.println("HOLA MUNDO");
		}else{
			System.out.println("ERROR- VUELVA A INTENTARLO");
		}
	}
}
