import java.util.Scanner;

public class main {
   
	public static void main(String[] args) {

	        Universitaet uni = new Universitaet();

	        int operation = 0;

	        while (operation != 16) {

	        	System.out.println("Welche Operation moechten Sie durchfuehren?");
	                
	        	System.out.println("1- Student hinzufuegen");
	        	System.out.println("2- Studenten auflisten");
	        	System.out.println("3- Student suchen");
	        	System.out.println("4- Student loeschen");
	            
	        	Scanner scan = new Scanner(System.in);
	            operation = scan.nextInt();
	            
	            switch(operation) {
	            
	           		case 1: //Student hinzufuegen
		            	System.out.println("Vorname : ");
		            	String vorName = scan.next();
		                   
		                System.out.println("Nachname");
		                String nachName =scan.next();
		                    
		                System.out.println("Matrikelnummer");
		                String Matrikelnummer = scan.next();
		                   
		                uni.addStudent(Matrikelnummer, vorName, nachName);
		                break;
	            	
		            case 2: //Studenten auflisten
		            	uni.printStudenten();
		                break;
		                  
		            case 3: //Student suchen
		            	System.out.println("Vorname : ");
		            	vorName = scan.next();
		            	
		            	System.out.println("Nachname");
		            	nachName = scan.next();
		            	
		            	uni.suchenStudenten(vorName, nachName);
		                break;
		         
		            case 4: //Student loeschen
		            	System.out.println("Geben Sie die Matrikelnummer des Studenten ein, den Sie löschen wollen");
		            	Matrikelnummer = scan.next();
		            	
		            	uni.loschenStudenten(Matrikelnummer);
		            	break;
		            	
	            }
	       }
	}
	
}
