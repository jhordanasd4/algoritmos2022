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
public class ejer04 {
    //MODIFICANDO ALGORITMO ANTERIOR
    public static void main(String[] args) {
        Carro carro1=new Carro();
        carro1.color = "Negro";
        carro1.modelo = "Porsh";
        carro1.año = 2019;
        System.out.println("EL COLOR DEL PRIMER CARRO ES: " +carro1.color);
        System.out.println("EL MODELO DEL PRIMER CARRO ES: " +carro1.modelo);
        System.out.println("EL AÑO DEL PRIMER CARRO ES: " +carro1.año);
        Carro carro2=new Carro();
        carro2.color = "Rojo";
        carro2.modelo = "Deportivo";
        carro2.año = 2015;
        System.out.println("EL COLOR DEL SEGUNDO CARRO ES: " +carro2.color);
        System.out.println("EL MODELO DEL SEGUNDO CARRO ES: " +carro2.modelo);
        System.out.println("EL AÑO DEL SEGUNDO CARRO ES: " +carro2.año);
    }
    
}
