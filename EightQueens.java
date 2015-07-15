/**
 * @author kzaiter
 * 04.07.2015 CS342
 * This program solves the 8 queens puzzle using only using recursive methods
 * This class is the puzzle solving logic
 */
public class EightQueens {    

	public static int Queens()
	{
		System.out.println("SOLUTIONS FOR THE 8 QUEENS PUZZLE" );
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int [] board = new int [8]; // creating chess board
		return Queens(board, 0, 0);
	}
 
	private static int Queens(int [] board, int loc, int count)
	{
		if (loc == board.length) { // base case
			System.out.println("    " + Printer.printBorder("",board.length + 2, 0, "* ")); // print top border
			Printer.printBoard(board, 0);
			return 1;
		}
		if (board[loc] == board.length) // if out of bounds
			return board[loc] = 0;
		if (!isValid(board, 0, loc)) { // if conflict, advance by one
			board[loc]++;
			return Queens(board, loc, 0);
		}
		count += Queens(board, loc + 1, 0); // checks to the right in the board
		board[loc]++;
		return count + Queens(board, loc, 0); // checks to the bottom in the board
	}

	// isValid checks the validation of the placement of the Queens in the board, up to the argument 'to'.
	private static boolean isValid(int [] board, int i, int to)
	{
		if (i == to) // base case
			return true;
		if (board[i] == board[to] // in the same line
				|| Math.abs (board[to] - board[i]) == to - i ) // in the same diagonal
			return false;
		return isValid (board, i+1, to);
	}
}
