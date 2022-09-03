/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author pc de jhordan
 */
class Carro{
    String color;
    String modelo;
    int año;
}
public class ejer03 {
    public static void main(String[] args) {
        Carro carro1=new Carro();
        carro1.color = "Negro";
        carro1.modelo = "Porsh";
        carro1.año = 2019;
        System.out.println("EL COLOR DEL CARRO ES: " +carro1.color);
        System.out.println("EL MODELO DEL CARRO ES: " +carro1.modelo);
        System.out.println("EL AÑO DEL CARRO ES: " +carro1.año);
    }
    
}
