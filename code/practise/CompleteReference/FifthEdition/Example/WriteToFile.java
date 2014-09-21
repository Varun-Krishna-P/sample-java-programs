package code.practise.CompleteReference.FifthEdition.Example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printwriter = new PrintWriter("Test.txt");
		printwriter.println("This is the first line in the file");
		printwriter.println("This is the second Line");
		printwriter.close();
	}
}
