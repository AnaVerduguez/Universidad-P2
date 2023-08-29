//Comprobamos si nuestra clase Empleado funciona correctamente
class EmpleadoPrueba {
  public static void main (String[] args) {
	//Creo dos objetos para probar la clase Empleado
    Empleado empleado1 = new Empleado("Ana", "Verduguez", 200000);
    Empleado empleado2 = new Empleado("Juan", "Doblas", 80000);

    //Mostramos por pantalla el salario anual de cada empleado usando el metodo OBTENER
    System.out.println("El salario anual de " + empleado1.obtenerNombre() + " " + empleado1.obtenerApellidoP() + " es de $" + empleado1.obtenerSalario() *12);
    System.out.println("El salario anual de " + empleado2.obtenerNombre() + " " + empleado2.obtenerApellidoP() + " es de $" + empleado2.obtenerSalario() *12);
    
    //Multiplicamos el salario por 0.10 para obtener un aumento del 10% y luego lo sumamos al salario anual
    empleado1.establecerSalario((empleado1.obtenerSalario()* 0.10) + empleado1.obtenerSalario());
    empleado2.establecerSalario((empleado2.obtenerSalario()* 0.10) + empleado2.obtenerSalario());

    //Mostramos los salarios finales
    System.out.println("El salario anual con aumento de " + empleado1.obtenerNombre() + " " + empleado1.obtenerApellidoP() + " es de $" + empleado1.obtenerSalario() * 12);
    System.out.println("El salario anual con aumento de " + empleado2.obtenerNombre() + " " + empleado2.obtenerApellidoP() + " es de $" + empleado2.obtenerSalario() * 12);
  }
}