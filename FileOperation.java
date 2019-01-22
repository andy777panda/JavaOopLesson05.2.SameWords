package net.ukr.andy777;

import java.io.*;

public class FileOperation {

	public static void fileWrite(String fileName, String[] arr) {

		// jdk1.7
		// try(PrintWriter pw = new PrintWriter(new File(fileName)){
		// for (String str : arr) {
		// pw.print(str + "\t");
		// }
		// pw.println();
		// } catch (FileNotFoundException e) {
		// System.out.println("Error found file" + fileName);
		// }

		// jdk1.6
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(fileName));
			for (String str : arr) {
				pw.print(str + "\t");
			}
			pw.println();
		} catch (FileNotFoundException e) {
			System.out.println("Error found file" + fileName);
		} finally {
			pw.close();
		}
	}
}