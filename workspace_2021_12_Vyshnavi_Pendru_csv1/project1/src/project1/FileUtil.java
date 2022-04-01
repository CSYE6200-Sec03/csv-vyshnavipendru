package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

//Writing csv

	public static void write(String fileName, List data) {
		//System.out.println(label);
		try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false))) {
			for (Object line : data) {
				out.write(line.toString());
				out.newLine();
				
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reading csv
	public static List<String> read(String fileName) {
		List<String> student = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				student.add(line);

			}
			br.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return student;
	}

	

}
