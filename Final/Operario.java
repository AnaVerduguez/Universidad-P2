package SistemaEmpleados;

public class Operario extends Empleado{
	/*
	Permiten sólo un ingreso y un egreso en cualquier
	orden, día y horario pero con un máximo de permanencia en planta de
	12hs.
	*/
	public Operario(String nombre, String apellido, int numeroTarjeta) {
		super(nombre, apellido, numeroTarjeta);
	
    int horasTrabajadas =+ 1 ;
    
	//Verifico el tiempo maximo de permanencia (12 horas)
    if (horasTrabajadas <= 12) {
    	System.out.println("Ingreso correcto");
    } else {
        System.out.println("Ingreso incorrecto.El empleado ha superado el tiempo máximo de permanencia (12 horas)");
    }
  }
}
