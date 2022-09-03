/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.util.Scanner;

/**
 *
 * @author pc de jhordan
 */
public class ejer01 {
    //MODIFICANDO EJERCICIO ANTERIOR
    public static void main(String[] args) {
        int a,b,res,sum;
        String d,s;
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
        System.out.println("desea sumar si(s) o no(n) ");
        s=n.next();
        sum = a+b;
        res = a-b;
        if (s.equals("s")) {
	    System.out.println("la suma es : "+sum);
	} else {
	    System.out.println("desea realizar la resta o desea salir ? si(s) o no(n)");
            d = n.next();
	if (d.equals("s")) {
            System.out.println("la resta es : "+res);
	} else {
	    System.out.println("gracias por ver ");
	}
       }
    }


}
