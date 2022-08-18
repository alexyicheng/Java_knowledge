import java.util.Scanner;

public class Account {

	private String benutzernameString;
	private String passwordString;

	public Account(String benutzername, String password) {
		this.benutzernameString = benutzername;
		this.passwordString = password;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		
		if(passwordString.equals(this.passwordString)) {

			System.out.println("Wollen Sie Ihr Password ändern? Y/N");
			Scanner inputScanner = new Scanner(System.in);
			String eingabeString;
			eingabeString = inputScanner.next();
			if (eingabeString.equals("Y")) {
				
					System.out.println("Password kann geändert werden,bitte geben sie ein neues Password ein");
					Scanner scan = new Scanner(System.in);
					String new_pwString = scan.nextLine();
					this.passwordString = new_pwString;
					System.out.println("Password erfolgreich aktualisiert");
//					break;
				}
			
			else {
				System.out.println("Process beendet");
//				break;
			}
		}
		else {
			System.out.println("Password stimmt nicht überein, es kann nicht geändert werden.");
		}
			
			

	}

	public String getBenutzernameString() {
		return benutzernameString;
	}

	public void setBenutzernameString(String benutzernameString) {
		this.benutzernameString = benutzernameString;
	}

}
