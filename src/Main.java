/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
 
     public static void main(String[] args) {
        int taban,us;
        Scanner scanner = new Scanner(System.in);
         System.out.println("Tabanı giriniz: ");  
         taban = scanner.nextInt();
         
         System.out.println("Üssü giriniz: ");
         us = scanner.nextInt();
         int sonuc=1;
         
         for(int i=1;i<=us;i++){
            sonuc*= taban;
         }
         
         System.out.println("Sonuç : " + sonuc);
        
        
    }
}
