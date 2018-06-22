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
		try {
			write("Hello World");
		}
		catch (IOException e) {
			System.out.println("Sorry, the program was unable to write.");
			e.printStackTrace();
		}
	}
	void readIn() throws FileNotFoundException {
		File text = new File("data.txt");
		Scanner input = new Scanner(text);
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
		
	}
	int [] read() throws FileNotFoundException {
		int x = 0;
		File text = new File("data.txt");
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
	void write(String message) throws IOException {
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		writer.println("A small program by Matteo Tullo");
		writer.println();
		writer.println(initial);
		writer.println(KWH);
		writer.println(KWD);
		writer.println();
		writer.println();
		writer.println(message);
		writer.flush();
		System.out.println("File 'output.txt' written successfully");
		writer.close();
	}
	
	void write() throws IOException {
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		writer.println("A small program by Matteo Tullo");
		writer.println();
		writer.println(initial);
		writer.println(KWH);
		writer.println(KWD);
		writer.flush();
		System.out.println("File 'output.txt' written successfully");
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
