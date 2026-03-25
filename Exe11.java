package partie4;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne de caractères : ");
        
        
        String chaine = sc.nextLine();

        
        int longueur = chaine.length();

        
        System.out.println("La longueur de la chaîne est : " + longueur);

        sc.close();
    }
}
