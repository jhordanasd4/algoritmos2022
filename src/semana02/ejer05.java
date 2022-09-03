/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author pc de jhordan
 */
//MODIFICANDO EL EJERCICIO DE CLASE
class Perro{
    String raza;
    String color;
    float peso;
    String vacu;
    //constructor: inicializar las variables
    public Perro(){
        raza="";
        color="";
        peso=0f;
        vacu="";
    }
    public Perro(String a){
        raza=a;
        color="";
        peso=0f;
        vacu="";
    }
    public Perro(String a, String b){
        raza=a;
        color=b;
        peso=0f;
        vacu="";
    }
    public Perro(String a, String b, float c){
        raza=a;
        color=b;
        peso=c;
        vacu="";
    }
     public Perro(String a, String b, float c,String v){
        raza=a;
        color=b;
        peso=c;
        vacu=v;
    }
    void dormir(){
        
    }
    void comer(){
        
    }
    void ladral(){
        //System.out.println("vacunado: "+this.vacu);
    }
    void informacion(){
        System.out.println("Raza: "+this.raza+"\nColor: "
                +this.color+"\nPeso: "+this.peso+"\nvacunado: "+this.vacu);
    }
}
public class ejer05 {
    public static void main(String[] args) {
        //Creando mi primer objeto en Java
        Perro p=new Perro();
        Perro p1=new Perro("Boxer");
        Perro p2=new Perro("Chiwuawua","Blanco");
        Perro p3=new Perro("Pitbull","Marron",30,"Siuu");
        //Perro p4=new Perro("si");
        p3.informacion();
        p2.informacion();
        p1.informacion();
        //Perro p4=new Perro("si");
        //p4.ladral();
    }
    
}
