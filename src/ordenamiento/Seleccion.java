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
public class Seleccion {
    
    
    public static void SeleccAsc(int a[]){
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n-1; i++) {
            indiceMenor = i;
            for (j = i+1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor=j;
                }
            }if (i != indiceMenor) {
                    intercambiar(a, i, indiceMenor);
            }
        }
    }
    
    public static void SeleccDesc(int a[]){
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n-1; i++) {
            indiceMenor = i;
            for (j = i+1; j < n; j++) {
                if (a[j] > a[indiceMenor]) {
                    indiceMenor=j;
                }
            }if (i != indiceMenor) {
                    intercambiar(a, i, indiceMenor);
            }
        }
    }
}
