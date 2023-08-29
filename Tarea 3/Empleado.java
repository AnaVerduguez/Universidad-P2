/* Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer nombre (tipo String), un apellido paterno
(tipo String) y un salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia. Si el salario mensual no es positivo, no 
establezca su valor. Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. 
Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y 
muestre el salario anual de cada Empleado otra vez. 
 */

//Creo la clase empleado 
class Empleado {
  //Creo las variables de instancia = privadas de la clase empleado
  private String nombre;
  private String apellido_paterno;
  private double salario;

  //Constructor de la clase empleado que inicializa las tres variables de instancia
  public Empleado(String nombre, String apellido_paterno, double salario) {
    this.nombre = nombre;
    this.apellido_paterno = apellido_paterno;
    //Condicional que me permite establecer el salario que sea positivo
    if (salario > 0.0) {
      this.salario = salario;
    }
  }

  //Metodos que me permiten ESTABLECER las variables de instancia
  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }

  public void establecerApellidoP(String apellido_paterno) {
    this.apellido_paterno = apellido_paterno;
  }

  public void establecerSalario(double salario) {
    if (salario > 0.0) {
      this.salario = salario;
    } else {
      System.out.println("El salario establecido debe ser mayor a $0");
    }
  }

  //Metodos que me permiten OBTENER las variables de instancia
  public String obtenerNombre() {
    return nombre;
  }

  public String obtenerApellidoP() {
    return apellido_paterno;
  }

  public double obtenerSalario() {
    return salario;
  }

}