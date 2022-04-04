/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class pila {
    Nodo cima;
    int tamaño;
    Scanner teclado = new Scanner(System.in);
    
    public pila(){
        cima = null;
        tamaño = 0;
    }
   
    public boolean isEmpty(){
        return cima == null;
    }
   
    public void push(boolean esResultado, int recibido){
        Nodo nuevo = new Nodo();
        if(!esResultado){
            System.out.println("Ingrese dato:");
            nuevo.dato = teclado.nextInt();
        }else{
            nuevo.dato=recibido;
        }
            nuevo.siguiente = cima;
            cima = nuevo;
            tamaño++;
    }
   
    public void pop(){
        Nodo actual = new Nodo();
        actual=cima;
        if(cima != null){
            while(actual != null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            
            }
        }else{
            System.out.println("Esta vacia");
        }
    }
   
    public int cima(){
        return cima.dato;
    }
   
    public int size(){
        return tamaño;
    }
   
    public void limpiar(){
        while(!isEmpty()){
            pop();
        }
    }
    
}
