package lesson6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lesson6 {
    public static final String OUT_PATH = System.getProperty("user.dir") + "/src/lesson6/";
    public static void fileWriter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iterations count: ");
        var it = scanner.nextInt();

        try (FileWriter file = new FileWriter(OUT_PATH + "out1.txt")) {
            for(var i = 1; i <= it; i++){
                for(var u = 0; u <= i; u++){
                    System.out.println(i);
                    file.write("" + i);

                }
                System.out.println("\n");
                file.write("\n");
            }
            for(var i = it - 1; i > 0; i--){
                for(var u = i; u > 0; u--){
                    System.out.println(i);
                    file.write("" + i);

                }
                System.out.println("\n");
                file.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void wordsGame() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String user_word = "";
        String guessed_word;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(OUT_PATH + "words.txt"))) {
            while (true){
                guessed_word = reader.lines().skip(rand.nextInt(10000)).limit(1).collect(Collectors.joining());
                while(user_word != ""){
                    guessed_word = reader.lines().skip(rand.nextInt(10000)).limit(1).collect(Collectors.joining());
                    System.out.println(guessed_word);
                    if(guessed_word.charAt(0) == user_word.charAt(user_word.length() - 1)){

                        break;
                    }
                }

                System.out.println(guessed_word);
                System.out.println("Your word: ");
                user_word = scanner.nextLine();

                System.out.println(user_word.toLowerCase().charAt(0));
                System.out.println(guessed_word.charAt(guessed_word.length() - 1));
                if(user_word.toLowerCase().charAt(0) != guessed_word.charAt(guessed_word.length() - 1)){
                    System.out.println("You lose");
                    return;
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }






    }

}
