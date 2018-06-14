//Client code
//Matteo Tullo 2018
package ecoSchools;

import java.io.*;

public class EnergyCalculator{

	public static void main(String[] args) throws FileNotFoundException {
		EnergyMethods instance = new EnergyMethods();
		int [] input;
		input = instance.read();  //needs to happen to read the file
		instance.analyze();  //prints totalLights
		

	}
}
