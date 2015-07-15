/**
 * @author kzaiter
 * 04.07.2015 CS342
 * This class handles printing the console output
 */
public class Printer {

	// prints the chess board
	static void printBoard (int [] board, int i)
	{
		if (i == board.length) { // base case
			System.out.println("    " + printBorder("", board.length + 2, 0, "* ")); //print bottom border
			System.out.println(printBorder("", board.length + 6, 0, "~~"));            
			return;
		}
		System.out.println("    * " + printSquare(board[i], 0, "", board.length) + "*"); // prints each row of the board 
		printBoard(board, i+1);
	}

	// prints each square with a "-" or "Q" of the board
	static String printSquare (int board, int col, String s, int length)
	{
		if (col == length)
			return s;
		s += (col == board ? "Q " : "- "); // only one queen per line
		return printSquare(board, col+1, s, length);
	}

	// print borders for chess board 
	static String printBorder(String s, int length, int i, String x)
	{
		if (i == length) 
			return s;
		return printBorder(s + x, length, i+1, x);
	}    

}
