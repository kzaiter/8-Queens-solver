public class Driver {

	public static void main(String[] args) {
		Splash splash = new Splash();
		splash.printer();
		System.out.println("THERE ARE " + EightQueens.Queens() + " POSSIBLE SOLUTIONS");
	}
}
