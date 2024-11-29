/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saidm
 */
public class Rectangulo extends Figura {
    private double largo,ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
        public void calcularArea(){
            double area = largo*ancho;
            System.out.println("El area del rectangulo es: "+area);
        
       }
    
}
