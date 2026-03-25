package partie3;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[3][3];
        int somme = 0; 

        System.out.println("Saisir les éléments de la matrice 3x3 :");

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matrice[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextInt();
                
                somme = somme + matrice[i][j]; 
            }
        }

        
        System.out.println("\nLa matrice saisie :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("La somme de tous les éléments est : " + somme);
        System.out.println("-------------------------------------------");
        
        sc.close();
    }
}
