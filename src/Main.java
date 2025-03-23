import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Character[] board = {'0','1','2','3','4','5','6','7','8'};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe Game !");

        Boolean x = true;

        while (!checkWinner()){
            x = toggle(x, board, scanner);
            printBoard(board);
        }

    }




    static void printBoard(Character[] board){
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    static Boolean checkWinner(){
        return false;
    }

    static Boolean toggle(Boolean ok, Character[] board, Scanner scanner){

        Character currentPlay;
        if (ok){
            System.out.print("It's X's turn, what's your move : ");
            currentPlay = 'x';
        }
        else {
            System.out.print("It's O's turn, what's your move : ");
            currentPlay = 'o';
        }


        Integer selectedCell = scanner.nextInt();

        while (!checkPlay(board, selectedCell)){
            System.out.println("Invalid move, Try again !");
            selectedCell = scanner.nextInt();
        }

        board[selectedCell] = currentPlay;

        return !ok;



    }

    static Boolean checkPlay(Character[] board, Integer selectedCell){
        Character n = board[selectedCell];
        if (n == 'x' || n == 'o'){
            return false;
        }
        else{
            return true;
        }
    }



}