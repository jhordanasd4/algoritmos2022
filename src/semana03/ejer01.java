/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

import java.util.Scanner;

/** 
 * 
 * @author pc de jhordan
 * 
 */
public class ejer01 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner es=new Scanner(System.in);
        System.out.println("Ingresa el valor de A: ");
        a=es.nextInt();
        System.out.println("Ingresa el valor de B: ");
        b=es.nextInt();
        if(a==b){
            System.out.println(a+" es igual al valor a "+b);
        }else{
            if(a>b){
                System.out.println(a+" es mayor a "+b);
            }else{
                System.out.println(b+" es mayor a "+a);
            }
        }
    }
}
