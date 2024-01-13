/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author manff
 */
public class Intercambio {
    public static void intercambiar(int []a, int i, int j){
        int aux=a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
