/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Tarea2 {

 
    public static void main(String[] args) {
        // TODO code application logic here
       int n1=20, n2=10;
       Scanner leer = new Scanner(System.in);
      
    Recursos recursos = new Recursos();
    
    System.out.println("Metodo 1:\n");
recursos.metodo1();   

   System.out.println("Metodo 2:\n");
recursos.metodo2(); 

  System.out.println("Metodo 3:\n");
    System.out.println("La suma de :\n" + n1 + " + " + n2 + " = ");
  recursos.metodo3(n1, n2);
  
  
  System.out.println("\nMetodo 4:\n");
  System.out.println("Ingrese un numero\n");
   int x=leer.nextInt();
   recursos.metodo4(x);
  
    }
    public static class Recursos {
  public void metodo1() {
    System.out.println("Programación Orientada a Objetos 2021\n");
}
public void metodo2() {
     int x=50;
  if (x > 21){
     System.out.println("Mayor de edad");
  }else{
     System.out.println("Menor de edad");
     }
  
    }
public  int metodo3(int num1, int num2){
      int result;
        result=num1*num2;
        return(result);
    }
public void metodo4(int x){
    int y;
    for(y=1; y<=x; y++)    
    System.out.println(y +"\n");
        
}

}
}
