package lesson3;

import java.util.Scanner;

public class Cypher {
    public static void CeasarCypher(){
        int offset = 10;
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();
        for(var i = 0; i < input.length(); i++){
            char ch = (char)(((int)input.charAt(i) + offset - 97) % 26 + 97);
        }
    }
    

}
