public class VehiculoAbonado extends Vehiculo {
	/* Vehículos Abonados: Estos vehículos pagan a fin de mes a razón de $2
	 * por minuto, de modo que el sistema debe ir acumulando la cantidad de
     * minutos que estuvieron en el garaje durante el mes.
	 */

	private static final double precioMinuto = 2.00;
	
	private int tiempoAcumulado = 0;
	
	
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	
	public double pagoMes() {
		return tiempoAcumulado*precioMinuto;
	}
}
}
