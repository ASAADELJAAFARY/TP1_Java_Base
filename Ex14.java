package partie4;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez une chaîne pour vérifier si c'est un palindrome : ");
        String original = sc.nextLine();
        
        
        String str = original.toLowerCase();
        
        String inverse = "";

        
        for (int i = str.length() - 1; i >= 0; i--) {
            inverse = inverse + str.charAt(i);
        }

        
        if (str.equals(inverse)) {
            System.out.println("\"" + original + "\" est un palindrome.");
        } else {
            System.out.println("\"" + original + "\" n'est pas un palindrome.");
        }

        sc.close();
    }
}
