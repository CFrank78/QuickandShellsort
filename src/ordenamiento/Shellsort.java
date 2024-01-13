/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import static ordenamiento.Intercambio.intercambiar;

/**
 *
 * @author manff
 */
public class Shellsort {
    public static void shellAsc(int a[]){
        int intervalo, i, j, k;
        int n=a.length;
        
        intervalo = n/2;
        while(intervalo > 0){
            for (i = 0; i < n; i++) {
                j = i - intervalo;
                while(j>=0){
                    k = j + intervalo;
                    if (a[j] <= a[k]) {
                        j = -1;
                    }else{
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo/2;
        }
    }
    public static void shellDesc(int a[]){
        int intervalo, i, j, k;
        int n=a.length;
        
        intervalo = n/2;
        while(intervalo > 0){
            for (i = 0; i < n; i++) {
                j = i - intervalo;
                while(j>=0){
                    k = j + intervalo;
                    if (a[j] >= a[k]) {
                        j = -1;
                    }else{
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo/2;
        }
    }
}
