
package com.nene.practicalogica;

import java.util.Scanner;
import java.util.Stack;

public class Practica5 {
    
    /*Implementa una función que tome una cadena que contiene paréntesis, 
    corchetes y llaves, y determine si la secuencia de estos caracteres 
    es válida. Una secuencia es válida si cada paréntesis, 
    corchete o llave se cierra correctamente.*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena");
        String caracteres = sc.nextLine();
        validacionCadena(caracteres);
    }
        
    private static void validacionCadena(String cade){ 
        int aux = 0;
        Stack <Character> pila = new <Character>Stack();
        for (int i = 0; i < cade.length(); i++) {
            if (cade.charAt(i) == '(' || cade.charAt(i) == '{' || cade.charAt(i) == '[') {
                pila.push(cade.charAt(i));
                aux++;
            } else if (cade.charAt(i) == ')' || cade.charAt(i) == '}' || cade.charAt(i) == ']') {
                if (pila.isEmpty()) {
                    System.out.println("llaves invalidas");
                    return;
                } 
                pila.pop();
                aux--;
                
            }
        }
        if (aux == 0) {
            System.out.println("sirve");
        } 
    }
        
}
