/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana03;

import javax.swing.JOptionPane;

/**
 *
 * @author pc de jhordan
 */
   class Operacion {
    // atributos
    int num1;
    int num2;
    int suma;
    int resta;
    
    //metodos
    public void leerNumero(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }
    public void sumar(){
        suma = num1 + num2;
    }
    public void restar(){
        resta = num1 - num2;
    }
   
    public void mostrar(){
        System.out.println("la suma es : "+suma);
        System.out.println("la resta es: "+resta);
        
    }
}
    public class ejer04{
    public static void main(String[] args) {
        Operacion op=new Operacion();
        op.leerNumero();
        op.sumar();
        op.restar();
        op.mostrar();
        
    }
}
