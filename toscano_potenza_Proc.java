/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Toscano_potenzaProc;

import java.util.Scanner;

/**
 *
 * @author Davide
 */
public class toscano_potenza_Proc {
    public static void main(String[] args) {
        System.out.println("inserire il valore della base : ");
        int base; 
        int esponente; 
        toscano_potenza_Proc potenza = new toscano_potenza_Proc();
        base = potenza.ScanBase();
        esponente = potenza.ScanEsponente();
        potenza.Pw(base , esponente);
    }
    int ScanBase(){
        int base;
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il valore della base" );
        
        base = scanner.nextInt();
        return base ; 
    }
    int ScanEsponente(){
        int esponente; 
        System.out.print("inserisci il valore dell'esponente ");
        Scanner scanner = new Scanner(System.in) ;
        esponente = scanner.nextInt();
        return esponente ; 
    }
    void Pw(int base ,int esponente ){
        int potenza = 1 ; 
        for(int i=0 ; i<esponente ; i++){
           potenza = potenza * base ; 
       }
        System.out.println(base+"^"+esponente+"="+potenza);
    }
}

