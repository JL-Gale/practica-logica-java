
package com.nene.practicalogica;

import java.util.Scanner;

public class Practica3 {
    
    public static void main(String[] args) {
        
        /*3. Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
        * Hecho esto, imprime los números primos entre 1 y 100.*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea comprar para saber si es primo");
        int numero = sc.nextInt();
        int validacion = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero%i == 0) {
                validacion++;
            }
        }
        
        System.out.println("---------------------");
        
        if (validacion == 2) {
                System.out.println("El numero "+numero+" es primo");
            } else {
                System.out.println("El numero "+numero+" no es primo");
        }
        
        validacion = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i%j == 0) {
                    validacion++;
                }
            }
            if (validacion == 2) {
                System.out.println("El numero "+i+" es primo");
            }
            validacion = 0;
        }
    }
}
