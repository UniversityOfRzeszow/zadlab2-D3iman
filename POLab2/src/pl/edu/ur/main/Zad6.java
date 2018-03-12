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
public class Zad6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int liczba = 0;
        
        System.out.println("Podaj liczby calkowite: ");
        while(true){
            liczba = input.nextInt();
            if(liczba<0){
                break;
            }
        }
        
    }
    
}
