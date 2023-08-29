package SistemaEmpleados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Empleado {
	public String nombre, apellido;
	public int numeroTarjeta;
	
	public Empleado(String nombre, String apellido,int numeroTarjeta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

    public boolean movimientoMolinete(String numeroTarjeta, String direccionMovimiento, LocalDateTime fechaHoraOperacion) {
        //Lee el archivo de tarjetas
        String archivo = "Tarjetas.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().equals(numeroTarjeta)) {
                    //Verifico si la direccion de movimiento es "ingreso" y la tarjeta es valida
                    if (direccionMovimiento.equalsIgnoreCase("Ingreso")) {
                        return true;
                    }
                    //Si la direccion del movimiento es "egreso" permitir la operacion
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Si no se encontro el numero de tarjeta en el archivo o la direccion de movimiento no es valida no se permite la operacion
        return false;
    }

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", numeroTarjeta=" + numeroTarjeta + "]";
	}
}
