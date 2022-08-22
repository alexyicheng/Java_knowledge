import java.util.Scanner;

public class Code_Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] answerString = {"ABC"};

		boolean check = true;
		int count = 0;
		
		while(check == true && count < 3) {
			System.out.println("Geben sie ein");
			Scanner scan = new Scanner(System.in);
			String scanString = scan.nextLine();
			if(answerString[0].contains(scanString)) {
				System.out.println("korrekt");
				check = false;
			}else {
				System.out.println("wrong");
				count++;
			}
			
		}
		
		
		
	}

}
