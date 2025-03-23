import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Character[] board = {'0','1','2','3','4','5','6','7','8'};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe Game !");

        Boolean x = true;

        printBoard(board);

        while (!checkWinner(board)){
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

    static boolean checkWinner(Character[] board) {
        if (isWinner(board, 'x')) {
            System.out.println("X Wins!");
            return true;
        }
        if (isWinner(board, 'o')) {
            System.out.println("O Wins!");
            return true;
        }
        if (isDraw(board)) {
            System.out.println("It's a Draw!");
            return true;
        }
        return false;
    }

    static Boolean isWinner(Character[] board, Character currentPlay) {

        return ((board[0] == currentPlay && board[1] == currentPlay && board[2] == currentPlay) ||
                (board[3] == currentPlay && board[4] == currentPlay && board[5] == currentPlay) ||
                (board[6] == currentPlay && board[7] == currentPlay && board[8] == currentPlay) ||

                (board[0] == currentPlay && board[3] == currentPlay && board[6] == currentPlay) ||
                (board[1] == currentPlay && board[4] == currentPlay && board[7] == currentPlay) ||
                (board[2] == currentPlay && board[5] == currentPlay && board[8] == currentPlay) ||

                (board[0] == currentPlay && board[4] == currentPlay && board[8] == currentPlay) ||
                (board[2] == currentPlay && board[4] == currentPlay && board[6] == currentPlay));


        }

    static boolean isDraw(Character[] board) {
        for (Character cell : board) {
            if (Character.isDigit(cell)) {
                return false;
            }
        }
        return true;
    }

    static Boolean toggle(Boolean ok, Character[] board, Scanner scanner){

        char currentPlay;

        if (ok){
            System.out.print("It's X's turn, what's your move : ");
            currentPlay = 'x';
        }
        else {
            System.out.print("It's O's turn, what's your move : ");
            currentPlay = 'o';
        }


        int selectedCell = scanner.nextInt();

        while (!checkPlay(board, selectedCell)){
            System.out.println("Invalid move, Try again !");
            selectedCell = scanner.nextInt();
        }

        board[selectedCell] = currentPlay;

        return !ok;



    }

    static Boolean checkPlay(Character[] board, Integer selectedCell){
        Character n = board[selectedCell];
        return (Character.isDigit(n));

    }



}