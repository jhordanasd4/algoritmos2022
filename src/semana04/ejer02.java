/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

import java.util.Scanner;

/**
 *
 * @author pc de jhordan
 */
public class ejer02 {
     public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar A");
        a = sc.nextInt();
        System.out.println("Ingresar B");
        b = sc.nextInt();
        if (a == b) {
            System.out.println("Son iguales");
        } else if (a > b) {
            System.out.println("a es mayor a B");
        } else {
            System.out.println("b es mayor a A");
        }
    }
    
    
}
