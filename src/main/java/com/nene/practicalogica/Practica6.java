
package com.nene.practicalogica;

import java.util.Arrays;

public class Practica6 {
    
    public static void main(String[] args) {
        
        /*Algoritmos de para ordenar vectores*/
        
        int vector[] = {5,8,2,9,1,5,0,3,7};
        System.out.println("Antes");
        mostrar(vector);
        //quicksort(vector, 0, vector.length-1);
        //burbuja(vector);
        Arrays.sort(vector);
        System.out.println("\ndespues");
        mostrar(vector);
    }
    
    private static void mostrar(int vector[]) {
      
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
    }
    
    public static int Particion(int vector[], int izq, int der) {
        int pivote = vector[izq];
        while (true) {            
            while (vector[izq] < pivote) {                
                izq++;
            }
            while (vector[der] > pivote) {                
                der--;
            }
            if (izq >= der) {
                return der;
            } else {
                int aux = vector[izq];
                vector[izq] = vector[der];
                vector[der] = aux;
                izq++;
                der--;
            }
        }
    }
    
    public static void quicksort(int vector[], int izq, int der) {
        
        if (izq < der) {
            int indiceParticion = Particion(vector, izq, der);
            quicksort(vector, izq, indiceParticion);
            quicksort(vector, indiceParticion+1, der);
        }
    }
    
    public static void burbuja(int vector[]) {
        
        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] > vector[j+1]) {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
    }
}
