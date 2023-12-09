
package com.nene.practicalogica;

public class Practica2 {
    
    public static void main(String[] args) {
        
        /*2. Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
        * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
        * 0, 1, 1, 2, 3, 5, 8, 13...*/
        
        long numero[] = new long[50];
        long figgo = 0;
        long aux = 1;
        long aux2 = 0;
        
        for (int i = 0; i < 50; i++) {
            
            //forma #1
            if (i >= 1) { 
               numero[i] = aux;
               aux = numero[i] + numero[i-1];
            }
            System.out.println(numero[i]);
            
            //forma2
            System.out.println(figgo);
            
            figgo = aux;
            aux = aux2 + figgo;
            aux2 = figgo;   
        }
    }
}
