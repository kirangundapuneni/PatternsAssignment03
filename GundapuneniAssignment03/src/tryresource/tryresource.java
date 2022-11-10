package tryresource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tryresource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(new File("tryresource.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		}

	}

}
