package app.data;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DataWriter {

	public static final String FILE_OUT = "";
	private static FileWriter dataWriter;
	
	static {
		try{
			dataWriter = new FileWriter(FILE_OUT, true);
		}
		catch (Exception e) {
			System.out.println("Had file opening error");
		}
	}
	
	public static void write(String... args) {
		String out = "";
		for (String eachElement : args) out += eachElement;
		try {
			dataWriter.write(out);
		} catch (IOException e) {
			System.out.println("");
			JOptionPane.showMessageDialog(null, "Wow.  There was a data error.  Please alert the scouting captain with the following message: " + out);
		}
	}
}
