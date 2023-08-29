package SistemaEmpleados;

public class Main {

	public static void main(String[] args) {
		
	//Creo 2 objetos por cada tipo de empleado -> Contratista | Administrativo | Operario
	Contratista contratista1 = new Contratista ("Carlos", "Urquiza", 47821421); 	
	Contratista contratista2 = new Contratista ("Antonia", "Calletano", 76452143); 
	
	Administrativo administrativo1 = new Administrativo ("Jose", "Montella", 16218328);
	Administrativo administrativo2 = new Administrativo ("Gabriela", "Ramiño", 72187372);	
	
	Operario operario1 = new Operario ("Hernan", "Marruecos", 12345678);
	Operario operario2 = new Operario ("Mario", "Ruiz", 86271623);
	
	//Almaceno los objetos creados en un arreglo
	Empleado empleado[] = {contratista1, contratista2, administrativo1, administrativo2, operario1,operario2};
	
	//Muestro los objetos con sus detalles iterando el arreglo anterior
	for (Empleado i : empleado) {
		System.out.println(i.toString());
		System.out.println("------------------------------------------------");
		}
	}
}
