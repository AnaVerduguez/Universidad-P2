//Comprobamos si nuestra clase fecha funciona correctamente
class FechaPrueba {
  public static void main(String[]args) {
	//Creo dos objetos para probar la clase Fecha
    Fecha fecha1 = new Fecha(10, 26, 2000);
    Fecha fecha2 = new Fecha(12, 28, 1995);

    //Mostramos por pantalla las fechas creadas
    fecha1.mostrarFecha();
    fecha2.mostrarFecha();

    //Cambiamos los meses y los dias de las fechas
    fecha1.establecerMes(11);
    fecha2.establecerMes(7);

    fecha1.establecerDia(15);
    fecha2.establecerDia(10);

    //Mostramos las 2 fechas finales
    System.out.println("Las fechas finales son: ");
    fecha1.mostrarFecha();
    fecha2.mostrarFecha();
  }
}
