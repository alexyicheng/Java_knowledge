import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[7];

		array[3] = 50;
		array[5] = 500;
		array[0] = 40;

		String[] person = { "Peter", "Müller", "35" };
		System.out.println("Name: " + person[0]);
		System.out.println("Alter: " + person[2]);

//		int [] lottoarray = new int[6];
//		
//		for(int i = 0; i< lottoarray.length; i++) {
//			
//			Scanner scan = new Scanner(System.in);
//			int input = scan.nextInt();
//			
//			lottoarray[i] =  input;
//			
//			System.out.println(i + ": " + lottoarray[i]);
//			
//		}

		String[] question = { "Wie viel ist 5 + 4 ?", "Wie viel ist 3 * 5 ?" };

		// option 1
//		int[] answer = { 9, 15 };
//
//		int count = 0;
//		while (count < question.length) {
//			System.out.println(question[count]);
//
//			Scanner scan2 = new Scanner(System.in);
//			int input_1 = scan2.nextInt();
//
//			if (input_1 == answer[count]) {
//				System.out.println("Richtig");
//				count++;
//			} else {
//				System.out.println("Falsch");
//			}
//
//		}

		// Optinon 2
		String[] ansStrings = { "9", "15" };
		
		int i = 0;
		
		while (i<ansStrings.length){
			System.out.println(question[i]);
			
			Scanner scan_3 = new Scanner(System.in);
			String input_3 = scan_3.nextLine();
			
			if (input_3.contains(ansStrings[i]))
			{
				System.out.println("Korrekt");
				i++;
			}
			else {
				System.out.println("Wrong");
			}
			
		}
			
		}

	}


