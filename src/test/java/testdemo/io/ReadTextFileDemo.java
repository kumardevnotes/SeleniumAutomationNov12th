package testdemo.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTextFileDemo {

	public static void main(String[] args) throws Exception {

		// to get the root folder
		String rootFolderpath = System.getProperty("user.dir");

		// Passing the path to the file as a parameter
		FileReader frObj = new FileReader(rootFolderpath + "//src//test//resources//sample.txt");

		int i;
		// It will be true until there is nothing to read
		while ((i = frObj.read()) != -1)

			// Print all the content of a file
			System.out.print((char) i);

		FileWriter fileWriter = new FileWriter(rootFolderpath + "//src//test//resources//sample.txt");
		fileWriter.write("new data has been added into this text doc");
		fileWriter.close();
		
		while ((i = frObj.read()) != -1)
			// Print all the content of a file
			System.out.print((char) i);
	}
}
