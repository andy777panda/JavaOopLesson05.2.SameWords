package net.ukr.andy777;

import java.io.*;

public class FileOperation {

	public static void fileWrite(String fileName, String[] arr)
			throws FileNotFoundException {

		// jdk1.7
		// try(PrintWriter pw = new PrintWriter(file)){
		// for (String str : arr) {
		// pw.print(str + "\t");
		// } pw.println();
		// } catch(FileNotFoundException e){
		// throw e;
		// }

		// jdk1.6
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(fileName));
			for (String str : arr) {
				pw.print(str + "\t");
			}
			pw.println();
			pw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}