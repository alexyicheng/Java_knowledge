import java.util.Scanner;

//schleife = loop


//difference between for and while loop
//for - use for if you know how many loop 
//while - use for if you donot know how many loop
public class Schleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<10; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("//////////////////////////////////");
		
		for (int j = 0 ; j < 10; j++) {
			if (j == 5)
			{
				System.out.println("you get me");
				break;
			}
			else {
				System.out.println(j);
			}
		}
		
		System.out.println("//////////////////////////////////");
		
		int a = 1;
		
		while(a<10) {
			
			System.out.println(a);
			
			a+=3;			
			
		}
		
		System.out.println("//////////////////////////////////");
		int b = 1;
		while(true) {
			System.out.println("Hi");
			if (b == 3 ) {
				break;
			}
			b++;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte den schwierigkeitsgrad von 1 - 5 wählen (1 für höchste und 5 für nirderigste)");
		
		
		
		int input = scan.nextInt();
		int enemy = 0;
		
		switch(input) {
		
		case 1: 
			enemy = input * 5 ;
			break;
			
		case 2:
			enemy = input * 5 ;
			break;
			
		case 3:
			enemy = input * 5 ;
			break;
			
		case 4:
			enemy = input * 5 ;
			break;
		
		case 5:
			enemy = input * 5 ;
			break;	
			
		default: {
			System.out.println("Falsch Eingabe");
		}
		
		}
		
		
		
		
		
		
		while (input < 6 || input > 0 ) {
			System.out.println(enemy);
		
			break;
			
		}
		
		
		
//		
	}

}
