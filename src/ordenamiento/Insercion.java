/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author manff
 */
public class Insercion {
    public static void insercionAsc(int []a){
        int i, j, aux;
        for (i = 0; i < a.length; i++) {
            j = i;
            aux = a[i];
            while (j > 0 && aux < a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }
    public static void insercionDesc(int []a){
        int i, j, aux;
        for (i = 0; i < a.length; i++) {
            j = i;
            aux = a[i];
            while (j > 0 && aux > a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }
}
