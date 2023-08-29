import java.util.Calendar;
import java.util.LinkedList;

public class VehiculoOficial extends Vehiculo {
	/* Vehículos Oficiales: Estos vehículos no pagan, pero a efecto de control
	 * deben quedar registradas las estadías (cada estadía tiene una patente,
	 * una fecha-hora de entrada y una fecha-hora de salida)
	 */
	
	private LinkedList<Estadia> estadias = new LinkedList<Estadia>();
	
	//Para que queden en la lista debemos guardarlas en la lista
	public void Estadia() {
		estadias.add(new Estadia(getHoraEntrada(),Calendar.getInstance()));
		}
}
