/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.micalculadora2;

/**
 *
 * @author Multipropósito2
 */
public class calculadora {
    private int operador1;
    private int operador2;
    
    
    public calculadora(){
    
}
    public calculadora(int operador1, int operador2 ){
        this.operador1 = operador1;
        this.operador2 = operador2;
        
    }
    
    public int sumar(){
        
int suma = this.operador1 + this.operador2;
     
     return suma;
        
    }
    public int restar(){
        
int resta = this.operador1 - this.operador2;
     
     return resta;
        
    }
        public int multiplicar(){
        
int multiplicacion = this.operador1 * this.operador2;
     
     return multiplicacion;
        
    }
                public double dividir(){
        
double division = (double)this.operador1 / (double)this.operador2;
     
     return division;
        
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
                
    
    
}
