package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        Transporte bicicleta = new Bicicleta();
        bicicleta.moverse();
        
        Transporte carro = new Coche();
        carro.moverse();
    }
    
}
