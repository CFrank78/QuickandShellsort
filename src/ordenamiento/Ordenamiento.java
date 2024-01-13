/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import java.util.*;
/**
 *
 * @author manff
 */
public class Ordenamiento {

    public static void main(String[] args) {
        int casos; int ord;
        do{
            Random r = new Random();
            Scanner usop = new Scanner(System.in);
            int[] lista = new int[15];
            for (int i = 0; i < lista.length; i++) {
                lista[i]=r.nextInt(100);
            }
            System.out.println("Ordenamiento\nSeleccione una tipo de ordenamiento\n1. Seleccion\n2. Insercion\n3. Shell\n4. Quicksort\n5. Salir");
            System.out.println("Lista: "+Arrays.toString(lista));
            casos = usop.nextInt();
        
            switch (casos){
                case 1:
                    System.out.println("Ordernar: \n1. Ascendente\n2. Descendente");
                    ord = usop.nextInt();
                    Seleccion sel = new Seleccion();
                    if (ord == 1) {
                        sel.SeleccAsc(lista);
                        System.out.println("Lista: "+ Arrays.toString(lista));
                    }
                    if (ord == 2) {
                        sel.SeleccDesc(lista);
                        System.out.println("Lista: "+Arrays.toString(lista));
                    }
                    System.out.println("Regresar a menu \n1. Si\n5. No");
                    casos = usop.nextInt();
                    if (casos == 1) {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Ordernar: \n1. Ascendente\n2. Descendente");
                    ord = usop.nextInt();
                    Insercion ins = new Insercion();
                    if (ord == 1) {
                        ins.insercionAsc(lista);
                        System.out.println("Lista: "+ Arrays.toString(lista));
                    }
                    if (ord == 2) {
                        ins.insercionDesc(lista);
                        System.out.println("Lista: "+Arrays.toString(lista));
                    }
                    System.out.println("Regresar a menu \n1. Si\n5. No");
                    casos = usop.nextInt();
                    if (casos == 1) {
                        break;
                    }
                    break;                    
                case 3:
                    System.out.println("Ordernar: \n1. Ascendente\n2. Descendente");
                    ord = usop.nextInt();
                    Shellsort shell = new Shellsort();
                    if (ord == 1) {
                        shell.shellAsc(lista);
                        System.out.println("Lista: "+ Arrays.toString(lista));
                    }
                    if (ord == 2) {
                        shell.shellDesc(lista);
                        System.out.println("Lista: "+Arrays.toString(lista));
                    }
                    System.out.println("Regresar a menu \n1. Si\n5. No");
                    casos = usop.nextInt();
                    if (casos == 1) {
                        break;
                    }
                    break;
                case 4:  
                    System.out.println("Ordernar: \n1. Ascendente\n2. Descendente");
                    ord = usop.nextInt();
                    QuickSorts quick = new QuickSorts();
                    if (ord == 1) {
                        quick.quickAsc(lista);
                        System.out.println("Lista: "+ Arrays.toString(lista));
                    }
                    if (ord == 2) {
                        quick.quickDesc(lista);
                        System.out.println("Lista: "+Arrays.toString(lista));
                    }
                    System.out.println("Regresar a menu \n1. Si\n5. No");
                    casos = usop.nextInt();
                    if (casos == 1) {
                        break;
                    }
                    break;
            }
        }while(casos != 5);
        System.out.println("Bye!");           
   }
    
    
}
