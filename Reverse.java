/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Reverse {
    Scanner leer = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    pila Pila = new pila();
    pila PilaIn = new pila();


        public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
            
           System.out.println("1. Agregar 1");
           System.out.println("2. Mostrar 2");
           System.out.println("3. Esta vacía? 3");
           System.out.println("4. Quien esta arriba 4");
           System.out.println("5. Tamaño 5");
           System.out.println("6. Invertir 6");
           System.out.println("7. exit 7");
           System.out.println("Escribe una de las opciones:");
           opcion = in.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Pila");
                   Pila.push(false,0);
                   break;
                           
               case 2:
                    System.out.println("Pila");
                    Pila.pop();
                   break;
                case 3:
                   System.out.println("Pila");
                   System.out.println(" Esta vacía? " + Pila.isEmpty());
                   break;
                case 4:
                   if(!Pila.isEmpty()){
                        System.out.println("Cola 1 Esta vacía? ");
                        System.out.println(Pila.cima());
                    }else{
                        System.out.println("Cola 1 Esta vací?");
                    }
                   break;
                case 5:
                   System.out.println("Tamaño Pila 1; " + Pila.size());
                   break;
                case 6:
                   Invertir(false,0);
                   break;
                case 7:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
    
    
            }
        }
    }
    public void Invertir(boolean esResultado, int recibido){
        int r;
        PilaIn = new pila();
        Nodo Npila = new Nodo();
        Npila = Pila.cima;
        if(Npila != null){
            for(int i = 0; i < Pila.size();i++){
                    Npila = Pila.cima;
                if(!esResultado){
                    r = Npila.dato;
                    PilaIn.push(true, r);
                }else{
                    Npila.dato = recibido;
                
                }
                    Npila = Npila.siguiente;
                    Npila.siguiente = PilaIn.cima;
                    PilaIn.cima = Npila;
                    PilaIn.tamaño--;
                    break;
            }
            System.out.println("Pila Invertida");
            PilaIn.pop();
        }else{
            System.out.println("Vacia");
        
        }
    }   

    public static void main(String[] args) {
        Reverse Pilas = new Reverse();
        Pilas.menu();
    } 
}        
