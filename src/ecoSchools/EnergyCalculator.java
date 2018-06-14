//Client code
//Matteo Tullo 2018
package ecoSchools;

import java.io.*;
import java.util.Scanner;

public class EnergyCalculator{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		EnergyMethods instance = new EnergyMethods();
		Scanner input = new Scanner(System.in);
		int [] arrayClient;
		String message = new String();
		
		System.out.println("If you want to add a message, type it here:");
		message = input.nextLine();
		
		arrayClient = instance.read();  //needs to happen to read the file
		instance.analyze();  //Calculations
		instance.write(message);  //writes to a file "output.txt"
		input.close();

	}
}
