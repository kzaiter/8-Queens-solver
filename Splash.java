/**
* @author kzaiter
* Class I previously created for printing a title splash to console
* save the planet recycle (insert laugh here) 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Splash {
	
	public void printer(){
		try{
			File z = new File("/Users/kzaiter/Documents/workspace/CSC342/src/eightQueens/splash.txt"); 
			Scanner zLoad = new Scanner(z);
			String buffer=""; // temp buffer for the while loop

			while(zLoad.hasNext()){
				buffer += zLoad.nextLine() +"\n";
			}

			System.out.println(buffer);
			zLoad.close();	

		}catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}


