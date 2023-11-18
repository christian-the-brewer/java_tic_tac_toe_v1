import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] board = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
        };

        printBoard(board);
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
            case "3":
                board[0][2] = 'X';
                break;
            case "4":
                board[1][0] = 'X';
                break;
            case "5":
                board[1][1] = 'X';
                break;
            case "6":
                board[1][2] = 'X';
                break;
            case "7":
                board[2][0] = 'X';
                break;
            case "8":
                board[2][1] = 'X';
                break;
            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println("Error");
        }
printBoard(board);
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
    }
}
