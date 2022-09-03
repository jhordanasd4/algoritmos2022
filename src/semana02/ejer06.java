/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author pc de jhordan
 */
class Persona{
    String nombre;
    String sexo;
    String nacionalidad;
    int edad;
    public Persona(String n, String s, String a, int e){
        nombre=n;
        sexo=s;
        nacionalidad=a;
        edad=e;
    }
    void informacion(){
        System.out.println("NOMBRE: "+this.nombre+"\nSEXO: "+this.sexo+"\nNACIONALIDAD: "+this.nacionalidad
        +"\nEDAD: "+this.edad);
    }
}

public class ejer06 {
    public static void main(String[] args) {
        Persona p=new Persona("Gaspar","Masculino","Egipcio",23);
        p.informacion();
        
    }
    
}
