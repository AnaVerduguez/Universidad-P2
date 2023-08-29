/* Modifique la clase Cuenta (figura 3.8) para proporcionar un método llamado retirar, que retire dinero de un objeto Cuenta. 
Asegúrese de que el monto a retirar no exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin cambio y el método 
debe imprimir un mensaje que indique “El monto a retirar excede el saldo de la cuenta”. Modifique la clase 
PruebaCuenta (figura 3.9) para probar el método retirar.
*/

//Copiamos los datos de la clase cuenta y le agregamos las modificaciones que nos pide el ejercicio
public class CuentaModificada {
  private String nombre;
  private double saldo;

  //Constructor de la clase Cuenta
  public CuentaModificada(String nombre, double saldo) {
    this.nombre = nombre;
    
    if (saldo > 0.0) {
      this.saldo = saldo;
    }
  }
  
  //Metodo que me permite depositar dinero en la cuenta
  public void depositar (double montoDeposito) {
    if (montoDeposito > 0.0) {
      saldo= saldo + montoDeposito;
    }
  }

  //Metodo que me permitira retirar dinero de la cuenta
  public void retirar (double montoRetiro) {
	//Condicional que me permitira extraer o no el dinero
    if (montoRetiro > saldo) { 
      System.out.println("El monto a retirar excede el saldo de la cuenta");
      //Si el monto es menor al saldo disponible entonces se hace la extraccion
    } else if (montoRetiro <= saldo) { 
      saldo = saldo - montoRetiro; //Se le resta o descuenta de la cuenta
    }
  }
  
  //Metodo que devuelve el saldo actual de la cuenta
  public double obtenerSaldo() {
    return saldo;
  }
  
  //Metodo que establece el nombre
  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }

  //Metodo que devuelve el nombre
  public String obtenerNombre() {
    return nombre;
  }

}