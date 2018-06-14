//Class code
//Matteo Tullo 2018
package ecoSchools;

import java.io.*;
import java.util.*;

public class EnergyMethods {
	final int watt = 14;
	int [] array = new int[22];
	String KWH, KWD, initial;
	
	void helloWorld() {
		System.out.println("Hello World!");
	}
	void write(String word) {
		System.out.println(word);
	}
	void readIn() throws FileNotFoundException {
		File text = new File("C:\\Users\\mltul\\Documents\\GitHub\\EcoSchoolsProject\\data.txt"); //Change file path accordingly
		Scanner input = new Scanner(text);
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
		
	}
	int [] read() throws FileNotFoundException {
		int x = 0;
		File text = new File("C:\\Users\\mltul\\Documents\\GitHub\\EcoSchoolsProject\\data.txt"); //Change file path accordingly
		Scanner input = new Scanner(text);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner linescan = new Scanner(line);
			while (linescan.hasNextInt()) {
				int lights = linescan.nextInt();
				array[x] = (lights);
				x++;
			}	
		}
		return(array);
	}
	void write() throws IOException {
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		writer.println("A small program by Matteo Tullo");
		writer.println();
		writer.println(initial);
		writer.println(KWH);
		writer.println(KWD);
		writer.close();
	}
	
	
	void analyze() {
		int totalLights = 0;
		for (int i=0; i<array.length; i++) {
			int value = array[i];
			totalLights = value + totalLights;
		}
		initial = (totalLights + " Total Lights drawing " + watt + " watts per hour");
		int totalWatt = (watt * totalLights);
		double totalKwatt = (totalWatt/1000.000);
		KWH = (totalKwatt + " Kilowatts per hour");
		totalKwatt = 24 * totalKwatt;
		KWD = (totalKwatt + " Kilowatts per day");
		
		
	}

	
}
