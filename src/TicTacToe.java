import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
        };
        boolean gameOver = false;

        printBoard(board);
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {


            playerMove(board, scanner);
            computerTurn(board);
            printBoard(board);
        }
        scanner.close();
    }

    private static void computerTurn(char[][] board) {
        Random randomNum = new Random();
        int computerMove;
        while (true) {
               computerMove = randomNum.nextInt(9) + 1;
            if (isMoveValid(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    private static boolean isMoveValid(char[][] board, int position) {
        switch (position) {
            case 1:
                return Character.isDigit(board[0][0]);
            case 2:
                return Character.isDigit(board[0][1]);

            case 3:
                return Character.isDigit(board[0][2]);
            case 4:
                return Character.isDigit(board[1][0]);
            case 5:
                return Character.isDigit(board[1][1]);
            case 6:
                return Character.isDigit(board[1][2]);
            case 7:
                return Character.isDigit(board[2][0]);
            case 8:
                return Character.isDigit(board[2][1]);
            case 9:
                return Character.isDigit(board[2][2]);
            default:
                System.out.println("Error");
                return false;
        }
    }

    private static void playerMove(char[][] board, Scanner scanner) {
        System.out.println("Where would you like to play? (1-9):");

        String userInput = scanner.nextLine();

        placeMove(board, userInput, 'X');

    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Error");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
    }
}
