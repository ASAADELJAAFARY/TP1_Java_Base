package partie2;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] T = new int[10];

        System.out.println("Remplir le tableau de 10 entiers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        System.out.print("Entrez le nombre à rechercher: ");
        int x = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < 10; i++) {
            if (T[i] == x) {
                pos = i;
                break; // Ghir nlqawh n-hbso l-boucle
            }
        }

        if (pos != -1) {
            System.out.println("Le nombre " + x + " est à la position: " + pos);
        } else {
            System.out.println("Nombre non trouvé.");
        }
    }
}
