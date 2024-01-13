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
public class QuickSorts {
    public static void quickAsc(int a[]){
        quickAsc (a, 0, a.length-1);
    }
    private static void quickAsc(int a[], int prim, int ult){
        int i, j, central;
        double pivote;
        central = (prim + ult)/2;
        pivote = a[central];
        i = prim;
        j= ult;
        do {
            while (a[i] < pivote) i++;
            while (a[j] > pivote) j--;
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (prim < j) {
            quickAsc(a, prim, j);
        }
        if (i < ult) {
            quickAsc(a, i, ult);
        }
    }
    public static void quickDesc(int a[]){
        quickDesc (a, 0, a.length-1);
    }
    private static void quickDesc(int a[], int prim, int ult){
        int i, j, central;
        double pivote;
        central = (prim + ult)/2;
        pivote = a[central];
        i = prim;
        j= ult;
        do {
            while (a[i] > pivote) i++;
            while (a[j] < pivote) j--;
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (prim < j) {
            quickDesc(a, prim, j);
        }
        if (i < ult) {
            quickDesc(a, i, ult);
        }
    }
}
