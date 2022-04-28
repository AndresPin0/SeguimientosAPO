package ui;
import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        List list = new List();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        System.out.println("Welcome to Bancolombia's turn system...");
        System.out.println("What do you want to do?\n");
        do{
            System.out.println(
                    "1)Give turn\n" +
                    "2)Show turn\n" +
                    "3)Pass turn\n" +
                    "4)Delete actual turn\n" +
                    "5)Finish app\n");
             ans = Integer.parseInt(br.readLine());

             switch (ans){
                 case 1:
                     int turn = 0;
                     System.out.println("Insert the turn:: ");
                     turn = Integer.parseInt(br.readLine());
                     list.giveTurn(turn);
                     break;
                 case 2:
                     list.showTurn();
                     break;
                 case 3:
                     list.passTurn();
                     break;
                 case 4:
                     list.deleteActualTurn();
                     break;
                 default:
                     System.out.println("Incorrect option try again!");
             }
        }while(ans != 5);
        System.out.println("Closing app :)");
    }
}
