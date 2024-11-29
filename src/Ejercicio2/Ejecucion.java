package Ejercicio2;

public class Ejecucion {

    public static void main(String[] args) {


        CuentaBancaria cuenta = new CuentaBancaria(9763143, 900000.0, "Bancaria");
        cuenta.mostrarDetalles();
        
        System.out.println("-------------------------");

        CuentaAhorros cuentaAhorros = new CuentaAhorros(2867345, 300000.0, "Ahorros", 0.05); //Este 0.05 es la tasa de interes
        cuentaAhorros.mostrarDetalles();
    }
}
