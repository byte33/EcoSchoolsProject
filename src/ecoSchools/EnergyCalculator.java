//Client code
//Matteo Tullo 2018
package ecoSchools;

import java.io.*;

public class EnergyCalculator{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		EnergyMethods instance = new EnergyMethods();
		int [] array;
		array = instance.read();  //needs to happen to read the file
		instance.analyze();  //prints info
		instance.write();  //writes to a file "output.txt"

	}
}
