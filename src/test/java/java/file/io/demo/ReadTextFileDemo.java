package java.file.io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTextFileDemo {

	public static void main(String[] args) throws Exception {

		// to get the root folder
		String rootFolderpath = System.getProperty("user.dir");

		// Passing the path to the file as a parameter
		FileReader fr = new FileReader(rootFolderpath + "//src//test//resources//sample.txt");

		int i;
		// It will be true until there is nothing to read
		while ((i = fr.read()) != -1)

			// Print all the content of a file
			System.out.print((char) i);

		FileWriter fileWriter = new FileWriter(rootFolderpath + "//src//test//resources//sample.txt");
		fileWriter.write("new data written in text file");
		fileWriter.close();
		
		while ((i = fr.read()) != -1)
			// Print all the content of a file
			System.out.print((char) i);
	}
}
