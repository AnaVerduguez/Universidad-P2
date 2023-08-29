public class Estacionamiento {
	
	public static void main(String[] args) {
		
		//Creo mis objetos en el programa principal
		Vehiculo vehiculo1 = new Vehiculo("Ford","Fiesta","Negro","AZDVD","Oficial");
		
		Vehiculo vehiculo2 = new Vehiculo("Peugeot","207","Blanco","DEFEW","Abonado");
		
		Vehiculo vehiculo3 = new Vehiculo("Ford","Ecosport","Gris","DUJFOL","NoAbonado");
		
		//Muestro por pantalla algunos resultados
		vehiculo1.mostrarDatos();
		vehiculo2.mostrarDatos();
		vehiculo3.mostrarDatos();
		
		
	}

}
