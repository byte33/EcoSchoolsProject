//Class code
//Matteo Tullo 2018
package ecoSchools;

import java.io.*;
import java.util.*;

public class EnergyMethods {
	void helloWorld() {
		System.out.println("Hello World!");
	}
	void write(String word) {
		System.out.println(word);
	}
	public void readIn() throws FileNotFoundException {
		File text = new File("C:\\Users\\mltul\\Desktop\\git\\EcoSchoolsProject\\data.txt"); //Change file path accordingly
		Scanner input = new Scanner(text);
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
		
	}

	
}
