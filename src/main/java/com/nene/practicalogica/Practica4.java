
package com.nene.practicalogica;

import java.util.Scanner;

public class Practica4 {
    
    public static void main(String[] args) {
        
        /*Crea una función que determine si una cadena de texto es un palíndromo. 
        Un palíndromo es una palabra, frase, número o cualquier otra secuencia de 
        caracteres que se lee de la misma manera hacia adelante que hacia atrás, 
        ignorando los espacios, puntuaciones y mayúsculas/minúsculas.*/
        
        System.out.println("Ingrese su palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        boolean validacion = false;
        int numeroPalabras = palabra.length();
        numeroPalabras--;
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabra.charAt(numeroPalabras)) {
                numeroPalabras--;
                validacion = true;
            } else {
                System.out.println("la palabra no es palindromo");
                validacion = false;
                break;
            }
        }
        
        if (validacion == true) {
            System.out.println("la palabra es valida");
        }

    }
}
