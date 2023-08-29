/* Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipo int) y un año (tipo int).
Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los valores que se proporcionan
son correctos. Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione un método 
mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/). Escriba una aplicación de prueba llamada 
PruebaFecha, que demuestre las capacidades de la clase Fecha.
*/

//Creo la clase fecha
class Fecha {
  //Creo las variables de instancia = privadas de la clase empleado
  private int mes;
  private int dia;
  private int año;

  //Constructor de la clase fecha que inicializa las tres variables de instancia
  public Fecha(int mes, int dia, int año) {
    this.mes = mes;
    this.dia = dia;
    this.año = año;
  }

  //Metodos que me permiten ESTABLECER las variables de instancia
  public void establecerMes(int mes) {
    this.mes = mes;
  }

  public void establecerDia(int dia) {
    this.dia = dia;
  }

  public void establecerAño(int año) {
    this.año = año;
  }

  //Metodos que me permiten OBTENER las variables de instancia
  public int obtenerMes() {
    return mes;
  }

  public int obtenerDia() {
    return dia;
  }
  
  public int obtenerAño() {
    return año;
  }

  //Metodo que me muestra la fecha con diagonales /
  public String mostrarFecha() {
    String fecha = mes + "/" + dia + "/" + año;
    System.out.println(fecha);    
    return fecha;
  }
}