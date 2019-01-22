package net.ukr.andy777;

/*
 Lesson05.Task2
 Напишите программу, которая примет на вход два текстовых файла, а вернет один. 
 Содержимым этого файла должны быть слова, которые одновременно есть и в первом и во втором файле.
 */

public class Main {
	public static void main(String[] args) {

		String fileNeme3 = "3.txt";

		String[] wordsFile1 = AP.wordsOfTextFile("1.txt");
		// remove dubbing words = видаляємо слова-дубляжі
		wordsFile1 = AP.nonRepeatingWords(wordsFile1);
		AP.scPrintStringArray(wordsFile1);
		System.out.println();

		String[] wordsFile2 = AP.wordsOfTextFile("2.txt");
		// remove dubbing words = видаляємо слова-дубляжі
		wordsFile2 = AP.nonRepeatingWords(wordsFile2);
		AP.scPrintStringArray(wordsFile2);
		System.out.println();

		AP.scPrintStringArray(AP.repeatWords(wordsFile1, wordsFile2));
		FileOperation.fileWrite(fileNeme3, AP.repeatWords(wordsFile1, wordsFile2));
	
	}
}