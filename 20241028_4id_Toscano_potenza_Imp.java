/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toscano_potenzaProc;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Toscano_potenza_Imp {
    public static void main(String[] args){
        //dichiaro e inizializzo le varibili 
        
       int base ;
       int esponente ; 
       int prodotto  ; 
       int i ; 
       int potenza = 1 ; 
       Scanner scanner = new Scanner(System.in);
       System.out.print("inserisci il valore della base" );
       base = scanner.nextInt(); 
       System.out.print("inserisci il valore dell'esponente ");
       esponente = scanner.nextInt();
       System.out.println("la base e' " + base);
       System.out.println("l'esponente è "+esponente);
       for(i=0 ; i<esponente ; i++){
           potenza = potenza * base ; 
       }
       System.out.println("la potenza è " +potenza );
    }
}




