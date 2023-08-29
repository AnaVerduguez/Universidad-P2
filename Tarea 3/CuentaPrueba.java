import java.util.Scanner;

//Comprobamos si nuestra clase CuentaModificada funciona correctamente
public class CuentaPrueba {
  public static void main(String[] args) {
	//Creo dos objetos para probar la clase Cuenta
    CuentaModificada cuenta1 = new CuentaModificada("Julia Rodriguez", 1000.00);
    CuentaModificada cuenta2 = new CuentaModificada("Roberto Sanchez", 711.15);

    //Muestra el saldo incial de cada objeto
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + " es de $" + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + " es de $" + cuenta2.obtenerSaldo());

    //Objeto scanner para que el usuario ingrese datos por teclado
    Scanner entrada = new Scanner(System.in);

    //Deposito el monto ingresado en la cuenta 1
    System.out.println("Escriba el monto a depositar para cuenta 1: ");
    double montoADepositar = entrada.nextDouble();
    System.out.println("Sumando " + montoADepositar + " al saldo de la cuenta 1");
    cuenta1.depositar(montoADepositar);

    //Muestra los saldos por pantalla
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + ":$ " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + ":$ " + cuenta2.obtenerSaldo());

    //Deposito el monto ingresado en la cuenta 2
    System.out.println("Escriba el monto a depositar para cuenta 2: ");
    montoADepositar = entrada.nextDouble();
    System.out.println("Sumando " + montoADepositar + " al saldo de la cuenta 2");
    cuenta2.depositar(montoADepositar);

    //Vuelve a mostrar los saldos por pantalla
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + ":$ " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + ":$ " + cuenta2.obtenerSaldo());

    //Probamos el metodo de retiro
    System.out.println("Escriba el monto a retirar para cuenta 1: ");
    double montoRetiro = entrada.nextDouble();
    System.out.println("Restando " + montoRetiro + " al saldo de la cuenta 1");
    cuenta1.retirar(montoRetiro);

    //Muestra los saldos finales por pantalla
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + " es de $" + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + " es de $" + cuenta2.obtenerSaldo());

  }
}