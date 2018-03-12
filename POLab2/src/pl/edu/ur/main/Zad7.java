/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Deiman
 */
public class Zad7 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n=1;
        
        System.out.println("Ile liczb chcesz wprowadzic?");
        n = input.nextInt();
        
        double tab[] = new double [n];
        
        System.out.println("Podaj liczby : ");
            for(int i=0;i<n;i++){
                tab[i] = input.nextDouble();
            }
        
        System.out.println("Liczby nie posortowane: ");
         for(int i=0;i<n;i++){
            System.out.print(tab[i]+" ");
         }
        System.out.println("");
            
        System.out.println("Sortowanie...");
        double temp;
        boolean koniec;
        do{
        koniec = true;
         for(int i=0;i<n-1;i++){
            if(tab[i]>tab[i+1]){
                temp = tab[i+1];
                tab[i+1] = tab[i];
                tab[i] = temp;
                koniec = false;
            }
         }
        }while(koniec==false);
        
        System.out.println("Posortowane liczby: ");
         for(int i=0;i<n;i++){
            System.out.println(tab[i]+" ");
         }
        
    }
    
}
