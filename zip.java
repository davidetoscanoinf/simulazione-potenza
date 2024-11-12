/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _20241028_4id_toscano_potenzaProj;

import Toscano_potenzaProc.toscano_potenza_Proc;
import java.util.Scanner;

/**
 *
 * @author Davide
 */
public class zip {
    public static void main(String[] args) {
        System.out.println("inserire il valore della base : ");
        int base; 
        int esponente; 
        toscano_potenza_Proc potenza = new toscano_potenza_Proc();
    } 
   int variabili(){
       int base ; 
       int esponente; 
       int potenza = 1 ; 
       Scanner scanner = new Scanner(System.in);
       System.out.println("inserisci il valore della base : ");
       base = scanner.nextInt();
       System.out.print("inserisci il valore dell'esponente ");
       esponente = scanner.nextInt();
       System.out.println("la base e' " + base);
       System.out.println("l'esponente è "+esponente);
       for(int i=0 ; i<esponente ; i++){
           potenza = potenza * base ; 
       }
       System.out.println("la potenza è " +potenza );
       return 0;
       
   }
}



