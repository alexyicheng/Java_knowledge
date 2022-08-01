import java.util.Scanner; //that is class who create the function Scanner for us

public class read1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Please insert the value : ");
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		
		Scanner scan2 = new Scanner(System.in);
				
		System.out.println("Please insert your Name: ");
		
		//Insert value without space
		//String zeichenkette = scan2.next();
		
		//Insert value with space
		String zeichenkette = scan2.nextLine();
		
		System.out.println("Please inser your Age : ");
		
		int alter = scan2.nextInt();
		
		System.out.println("My Name is " + zeichenkette + ". Ich bin " + alter);
		
		
		
		
	}

}
