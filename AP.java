package net.ukr.andy777;

import java.io.*;

public class AP {

	// splitting a text file into words = розбивка текстового файлу на слова
	public static String[] wordsOfTextFile(String filename) {
		String[] res = new String[0];
		try {
			String str = null;
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((str = br.readLine()) != null) {
				res = expandArray(res, str.split(" "));
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error open file - " + filename);
		}
		return res;
	}

	// remove dubbing words = видаляємо слова-дубляжі
	public static String[] nonRepeatingWords(String[] arr) {
		String[] res = new String[1];
		res[0] = arr[0];
		for (String wordArr : arr) {
			boolean isSame = false;
			for (String wordRes : res) {
				if (wordArr.equals(wordRes)) {
					isSame = true;
					break;
				}
			}
			if (!isSame) {
				res = expandArray(res, wordArr.split(" "));
			}
		}
		return res;
	}

	// search repeating words in two arrays = пошук однакових слів у двох
	// масивах
	public static String[] repeatWords(String[] arr1, String[] arr2) {
		String[] res = new String[0];
		for (String word1 : arr1) {
			boolean isSame = false;
			for (String word2 : arr2) {
				if (word1.equals(word2)) {
					res = expandArray(res, word1.split(" "));
					break;
				}
			}
		}
		return res;
	}

	// expanding array of additional array = розширення масиву додатковим масивом
	public static String[] expandArray(String[] res, String[] add) {
		String[] temp = new String[res.length + add.length];
		System.arraycopy(res, 0, temp, 0, res.length);
		System.arraycopy(add, 0, temp, res.length, add.length);
		res = temp;
		return res;
	}
	
	// print string array = друк масиву слів
	public static void scPrintStringArray(String[] arr) {
		for (String str : arr) {
			System.out.print(str + "\t");
		}
		System.out.println();
	}
}
