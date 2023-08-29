import java.util.*;
//Subclase que me permite guardar la Estadia de un Vehiculo de Tipo Oficial sin pago alguno

public class Estadia {
	private Calendar horaEntrada;
	private Calendar horaSalida;	
		
	public Estadia(Calendar horaEntrada, Calendar horaSalida) {
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}	
		
	public Calendar getHoraEntrada() {
		return horaEntrada;
	}
	
	public Calendar getHoraSalida() {
		return horaSalida;
	}
	
}