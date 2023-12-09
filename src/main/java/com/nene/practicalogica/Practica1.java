
package com.nene.practicalogica;

import java.util.Scanner;

public class Practica1 {
    
    public static void main(String[] args) {
        
        /*1. Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
        * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
        * NO hace falta comprobar que ambas palabras existan.
        * Dos palabras exactamente iguales no son anagrama.*/      
        
        String palabra1, palabra2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su primera palabra");
        palabra1 = sc.nextLine();
        
        System.out.println("Ingrese su segunda palabra");
        palabra2 = sc.nextLine(); 
        
        
        if (anagrama(palabra1, palabra2)) {
            System.out.println("La palabra es un anagrama");
        } else {
            System.out.println("La palabra no es un anagrama");
        }
        
    }
    
    private static boolean anagrama(String palabra1, String palabra2){
        
        if (palabra1.length() == palabra2.length() && !palabra1.equals(palabra2)) {
            char cadena[] = new char[palabra1.length()];
            
            for (int i = 0; i < palabra1.length(); i++) {
                cadena[i] = palabra1.charAt(i);
            }
            
            byte validacion2 = (byte) palabra1.length(), validacion3 = 0;
            
            for (int i = 0; i < cadena.length; i++) {
                for (int j = 0; j < cadena.length; j++) {
                    if (cadena[i] == palabra2.charAt(j)) {
                        cadena[i] = '.';
                        validacion3++;
                    }
                } 
            }
            
            if (validacion2 == validacion3) {
                return true;  
            } else {
                return false;
            }
            
        } else {
            return false;   
        }
    }
}
