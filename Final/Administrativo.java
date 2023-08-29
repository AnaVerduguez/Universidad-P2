package SistemaEmpleados;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Administrativo extends Empleado {
	/*
	 Tarjetas de Empleados Administrativos: Permiten ingresos o egresos
	 múltiples a la planta sólo de Lunes a Viernes de 7:00 a 19:00 y dentro de
	 un mismo día calendario.
	 */
	public Administrativo(String nombre, String apellido, int numeroTarjeta) {
		super(nombre, apellido, numeroTarjeta);
	
	//Obtengo la fecha y hora actual
    LocalDateTime fechaHoraActual = LocalDateTime.now();
    DayOfWeek diaSemana = fechaHoraActual.getDayOfWeek();
    LocalTime horaActual = fechaHoraActual.toLocalTime(); 

    //Verifico que el dia sea de Lunes a Viernes y la hora este dentro del rango permitido
    if (diaSemana.getValue() >= DayOfWeek.MONDAY.getValue() && diaSemana.getValue() <= DayOfWeek.FRIDAY.getValue() && horaActual.compareTo(LocalTime.parse("07:00")) >= 0&& horaActual.compareTo(LocalTime.parse("19:00")) <= 0) {
    	System.out.println("Ingreso correcto"); 	
	}else{
		System.out.println("Ingreso incorrecto. El empleado no puede ingresar en este rango horario");
	}
    
  }
}


 