/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saidm
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio){
    this.radio = radio;
    }

    @Override
    public void calcularArea(){
        double area = Math.PI * (radio*radio);
        System.out.println("El area del circulo es: "+area);
    }
}
