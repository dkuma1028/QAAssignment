package WordProblem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class fetchWords {
	/*
	 * We can run the mai method directly from here and get result
	 * or use maven command mvn exec:java -Dexec.mainClass="main class"
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letters");
		//my dictionary has all words in upper case so changing the input to upper case
		String letters = sc.nextLine().toUpperCase();
		Dictionary dict = new Dictionary();
		System.out.println(dict.getAllWords(letters));
	}
	
}
