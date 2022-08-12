

public class Hund {

	
		
		String name;
		int alter;
		String rasse;
	
		
		
		public Hund (String nameString, int alter, String rasseString) {
			
			this.alter = alter;
			this.name = nameString;
			this.rasse = rasseString;
			
		}
		
		
		public void bellen()
		{
			System.out.println(this.name + " bellt");
		}
		
		
		
	}

