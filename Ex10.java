package partie3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes (L) : ");
        int L = sc.nextInt();
        System.out.print("Entrez le nombre de colonnes (C) : ");
        int C = sc.nextInt();

        int[][] M = new int[L][C];
        int[][] T = new int[C][L]; 

        
        System.out.println("Saisir les éléments de la matrice :");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                T[j][i] = M[i][j]; 
            }
        }

        
        System.out.println("\nLa matrice transposée est :");
        for (int i = 0; i < C; i++) { 
            for (int j = 0; j < L; j++) { 
                System.out.print(T[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
