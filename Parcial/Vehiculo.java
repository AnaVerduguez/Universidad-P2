import java.util.*;

public class Vehiculo {
	
	//Creo los atributos de mi clase VEHICULO ABSTRACTO. Es padre es las demas subclases.
	//El tipo de vehiculo me permitirá saber que tarifa le corresponde abonar
	private String marca, modelo,color,patente,tipoVehiculo;
	private Calendar horaEntrada, horaSalida;
	
	//Creo el metodo constructor
	public Vehiculo(String marca,String modelo,String color,String patente,String tipoVehiculo){
		this.marca= marca;
		this.modelo= modelo;
		this.color= color;
		this.patente= patente;
		this.tipoVehiculo= tipoVehiculo;
	}

	//Creo los metodos de mi clase VEHICULO
	//El metodo get me permitira mostrar los atributos
	public String getMarca() {
	        return marca;
	}
	
	public String getModelo() {
        return modelo;
	}
	
	public String getColor() {
        return color;
	}
	
	public String getPatente() {
        return patente;
	}
	
	public String getTipoVehiculo() {
        return tipoVehiculo;
	}
	
	public Calendar getHoraEntrada() {
		return horaEntrada;
	}
	
	public Calendar getHoraSalida() {
		return horaSalida;
	}
	
	//Mensaje salida por pantalla
	public void mostrarDatos() {
        System.out.println(marca+ " " + modelo + " " + color + " " + patente + " " + tipoVehiculo);
    }
}
