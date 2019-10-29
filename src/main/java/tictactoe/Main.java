package tictactoe;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
                "Welcome to Tic Tac Toe! Please enter a number to make a move:",
                "",
                "| 1 | 2 | 3 |",
                "| 4 | 5 | 6 |",
                "| 7 | 8 | 9 |",
                "",
                "X's Move: "
        );
        lines.forEach(System.out::println);
    }
}
