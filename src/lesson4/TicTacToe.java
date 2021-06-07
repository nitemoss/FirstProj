package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private static String[] gameBoard = {" ", " ", " ", " ", " ", " ", " ", " ", " " };

    private static Integer[][] wins = new Integer[][]{
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},

            {0, 4, 8},
            {2, 4, 6},

            {1, 4, 7},
            {2, 5, 8},
            {0, 3, 6},


    };
    private static ArrayList<Integer> movesX = new ArrayList<Integer>();
    private static ArrayList<Integer> movesO = new ArrayList<Integer>();



    private static String winner = "";
    private static String current_player = "X";

    public static void displayBoard(){
        System.out.println("-1-2-3-");
        System.out.println("-4-5-6-");
        System.out.println("-7-8-9-");



        System.out.println("-" + gameBoard[0] + "-" + gameBoard[1] + "-" + gameBoard[2] + "-" );
        System.out.println("-" + gameBoard[3] + "-" + gameBoard[4] + "-" + gameBoard[5] + "-" );
        System.out.println("-" + gameBoard[6] + "-" + gameBoard[7] + "-" + gameBoard[8] + "-");

    }
    public static void startGame(){
        displayBoard();
        Scanner scanner = new Scanner (System.in);
        while(winner == ""){
            System.out.println(current_player + "'s move (1-9): ");
            int move = scanner.nextInt();

            if(move > 9 || move < 1 || gameBoard[move - 1] != " "){
                System.out.println("enter a free valid move (1-9");
                continue;
            }
            if(current_player == "X"){
                movesX.add(move - 1);
            }
            if(current_player == "O"){
                movesO.add(move - 1);
            }

            gameBoard[move - 1] = current_player;


            for(Integer[] win : wins){
               
                int win_moves_total = 0;
                for(int win_move : win){
                    if(movesX.contains(win_move)){
                        win_moves_total++;
                    }
                }
                if(win_moves_total == 3){
                    System.out.println("Won X");
                    return;
                }
            }
            for(Integer[] win : wins){

                int win_moves_total = 0;
                for(int win_move : win){
                    if(movesX.contains(win_move)){
                        win_moves_total++;
                    }
                }
                if(win_moves_total == 3){
                    System.out.println("Won X");
                    return;
                }
            }

            displayBoard();
            current_player = (current_player == "X" ? "O" : "X");


        }



    }
}
