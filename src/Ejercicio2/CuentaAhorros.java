package Ejercicio2;

public class CuentaAhorros extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaAhorros(int numeroCuenta, double saldo, String tipoCuenta, double tasaInteres) {
        super(numeroCuenta, saldo, tipoCuenta);
        this.tasaInteres = tasaInteres;
    }

    public double calcularInteres() {
        return getSaldo() * tasaInteres;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Interés generado: " + calcularInteres());
    }
}

