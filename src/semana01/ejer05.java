/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.io.*;
/**
 *
 * @author pc de jhordan
 */
public class ejer05 {
    //PROVANDO EL JAVA.IO
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		System.out.println("ingrese primer numero: ");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("ingrese segundo numero: ");
		b = Integer.parseInt(bufEntrada.readLine());
		if (a<b) {
			System.out.println(a+" es menor que , "+b);
		} else {
			System.out.println(a+" es mayor que , "+b);
		}
	}
    
}
 