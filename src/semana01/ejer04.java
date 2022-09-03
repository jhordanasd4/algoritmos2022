/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.util.Scanner;

/**
 *
 * @author pc de jhordan
 */
public class ejer04 {
    //PEDIR 2 NUMEROS Y SABER EL MAYOR Y MENOR
    public static void main(String[] args) {
        int a,b;
        Scanner n=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        a=n.nextInt();
        System.out.println("Tngrese el segundo numero: ");
        b=n.nextInt();
        if(a<b){
            System.out.println(a+" es menor que , "+b);
        } else {
	    System.out.println(a+" es mayor que , "+b);
        }
    }
    
}
