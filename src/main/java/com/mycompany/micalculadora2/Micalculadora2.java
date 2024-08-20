/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.micalculadora2;

/**
 *
 * @author Multipropósito2
 */
public class Micalculadora2 {
    static int operador1;
    static int operador2;
    

    public static void main(String[] args) {
      calculadora micalculadora = new calculadora(operador1,operador2);
      
      System.out.println("Escribe el primer numero :");
              operador1 = micalculadora.getOperador1();
      System.out.println("Escribe el segundo numero :");
              operador2 = micalculadora.getOperador2();
              int suma = micalculadora.sumar();
              
              System.out.println("La suma es: " + suma);
              System.out.println("La resta es: " + micalculadora.restar());
              System.out.println("La multiplicacion es: " + micalculadora.multiplicar());
              System.out.println("La divicion es: " + micalculadora.dividir());
              
    }
}
 