import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Character[] board = {'1','2','3','4','5','6','7','8','9'};
        printBoard(board);



    }


    static void printBoard(Character[] board){
        for (Character cell: board){
            if (Character.getNumericValue(cell) % 3 == 0){
                System.out.println(cell + " | ");
            }
            else {
                System.out.print(cell + " | ");
            }
        }
    }



}