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
public class Zad4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double tab[] = new double [10];
        int wybor = 0;
        
        System.out.println("Wypelnianie tablicy. Podaj 10 liczb: ");
        for(int i=0;i<10;i++){
            tab[i] = input.nextDouble();
        }
        System.out.println("Co zrobic z podanymi liczbami: ");
        do{
        System.out.println("1. Oblicz sume elementow tablicy.");
        System.out.println("2. Oblicz iloczyn elementow tablicy.");
        System.out.println("3. Wyznacz wartosc srednia.");
        System.out.println("4. Wyznacz wartosc minimalna.");
        System.out.println("5. Wyznacz wartosc maksymalna.");
        System.out.println("6. Zakoncz.");
        wybor = input.nextInt();
         switch(wybor){
            case 1:
                double suma=0;
                 for(int i=0;i<10;i++){
                    suma+=tab[i];
                 }
                System.out.println("Suma: "+suma);
                break;
            case 2:
                double iloczyn=1;
                 for(int i=0;i<10;i++){
                    iloczyn*=tab[i];
                 }
                System.out.println("Iloczyn: "+iloczyn);
                break;
            case 3:
                double srednia=0;
                 for(int i=0;i<10;i++){
                    srednia+=tab[i];
                 }
                 System.out.println("Srednia: "+(srednia/10));
                break;
            case 4:
                double min=tab[0];
                 for(int i=1;i<10;i++){
                    if(min>tab[i]){
                        min=tab[i];
                    }
                 }
                 System.out.println("Wartosc minimalna: "+min);
                break;
            case 5:
                double max=tab[0];
                 for(int i=1;i<10;i++){
                    if(max<tab[i]){
                        max=tab[i];
                    }
                 }
                 System.out.println("Wartosc maksymalna: "+max);
                break;
            case 6:
                break;
            default:
                System.out.println("Zly numer.");
                break;
         }
        }while(wybor!=6);
    }
    
}
