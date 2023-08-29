package SistemaEmpleados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Contratista extends Empleado {
	/*
	Tienen las mismas restricciones que las tarjetas
	de Empleados Administrativos, pero sólo se permite el ingreso si el
	contratista tiene trabajo planificado para el día calendario en el que se
	intenta el ingreso. 
	*/
	public Contratista(String nombre, String apellido, int numeroTarjeta) {
		super(nombre, apellido, numeroTarjeta);
        diasTrabajoPlanificado();
    }

    public void diasTrabajoPlanificado() {
        //Lee las fechas del archivo Programacion.txt y las agrega a la lista
        String archivo = "Programacion.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            LocalDateTime fechaHoraActual = LocalDateTime.now();

            while ((linea = br.readLine()) != null) {
                LocalDateTime fechaHora = LocalDateTime.parse(linea);

                if (fechaHora.toLocalDate().equals(fechaHoraActual.toLocalDate())) {
                    System.out.println("Ingreso correcto. El contratista tiene trabajo planificado para hoy.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo);
            e.printStackTrace();
        }
   }
}


