import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//        quadratic();
//        fibo();
//        sort();
//        threeRocks();
        isDateValid();
    }
    public static void isDateValid(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Date DD/MM/YYYY: ");
        String date = scanner.nextLine();

        String[] parts = date.split("/");
        if(parts.length != 3){
            parts = date.split("-");
        }
        int[] operableDate = new int[3];


        for(var i = 0; i < parts.length; i++){
            Array.set(operableDate, i, Integer.valueOf(parts[i]));
        }


        int day   = operableDate[0];
        int month = operableDate[1];
        int year  = operableDate[2];

        if(month < 1 || month > 12){
            System.out.println("Format error (month");
            return;
        }
        if(day < 1 || day > 31){
            System.out.println("Format error (day)");
            return;
        }

        if(month == 2 && year % 4 == 0){
            System.out.println("Format error (year & month)");
            return;
        }

        if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30){
                System.out.println("Format error (day & month)");
                return;
            }
        }

        System.out.println("Valid date");
        return;
    }
    public static void quadratic(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        System.out.println("c: ");
        int c = scanner.nextInt();


        int D = b*b - 4 * a * c;
        if (D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if(D == 0){
            float x = (float) ((-b) / (2*a));
            System.out.println("x = " + x);

        } else {
            System.out.println("No roots.");
        }
    }

    public static void fibo(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Iterations count: ");
        int c = scanner.nextInt();

        int sum0 = 1;
        int sum1 = 1;

        for(var i = 0; i < c; i++){

            sum0 += sum1;
            System.out.println("sum1 = " + sum1);
            sum1 += sum0;
            System.out.println("sum0 = " + sum0);
        }
    }


    public static void sort(){
        // unfinished
        Random rand = new Random();

        int[] arr = new int[7];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(20);
        }



        System.out.println("arr = " + Arrays.toString(arr));



    }
    public static void threeRocks(){
        int playersCount = 4;
        int[] settedStones = new int[playersCount];
        int[] attempts = new int[playersCount];


        Random rand = new Random();
        for(int i = 0; i < playersCount; i++){
            settedStones[i] = rand.nextInt(4); // 0 — 4
        }
        for(int round = 0; round < 2; round++){
            System.out.println("round " + round);
            for(int i = 0; i < playersCount; i++){
                Scanner scanner = new Scanner (System.in);

                System.out.println("#" + i + " player's stones count? ");
                int attempt = scanner.nextInt();
                if (settedStones[i] == attempt){
                    System.out.println("Correct!");
                    settedStones[i] = rand.nextInt(3);
                }
            }
        }




    }



}
