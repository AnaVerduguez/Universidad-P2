import java.util.*;

public class VehiculoNoAbonado extends Vehiculo{
	/* Vehículos NO-Abonados: En este caso el vehículo paga $4 por minuto en
	 * el momento de retirarse del garaje.
	 */
	
	private static final double precioMinuto = 4.00;
	private double pagoFinal= 0.0;
	
	//Calculo la cantidad que debe pagar un Vehiculo No Abonado
	pagoFinal= Calendar.getInstance() * precioMinuto;
			
	public double pagoFinal() {
		return pagoFinal;
			
	}
}
