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
public class Zad3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tab[] = new double [10];
        int wybor = 0;
        
        System.out.println("Wypelnianie tablicy. Podaj 10 liczb: ");
        for(int i=0;i<10;i++){
            tab[i] = input.nextDouble();
        }
        
        System.out.println("Wybierz co chcesz zrobic z tablica: ");
        do{
            System.out.println("1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
            System.out.println("2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
            System.out.println("3. Wyświetlanie elementów o nieparzystych indeksach.");
            System.out.println("4. Wyświetlanie elementów o parzystych indeksach.");
            System.out.println("5. Zakoncz.");
            wybor = input.nextInt();
            if(wybor==1){
                for(int i=0;i<10;i++){
                    System.out.println(tab[i]);
                }
            }
            else if(wybor==2){
                for(int i=9;i>=0;i--){
                    System.out.println(tab[i]);
                }
            }
            else if(wybor==3){
                for(int i=1;i<10;i+=2){
                    System.out.println(tab[i]);
                }
            }
            else if(wybor==4){
                for(int i=0;i<10;i+=2){
                    System.out.println(tab[i]);
                }
            }
            else if(wybor==5){
                continue;
            }
            else{
                System.out.println("Zly numer.");
            }
        }while(wybor!=5);
    }
    
}
