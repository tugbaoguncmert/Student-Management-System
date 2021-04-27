import java.util.Scanner;

public class main {
   
	public static void main(String[] args) {

	        Universitaet uni = new Universitaet();

	        int operation = 0;

	        while (operation != 8) {

	        	System.out.println("Welche Operation moechten Sie durchfuehren?");
	                
	        	System.out.println("1- Student hinzufuegen");
	        	System.out.println("2- Studenten auflisten");
	        	System.out.println("3- Student suchen");
	        	System.out.println("4- Student loeschen");
	        	
	        	System.out.println("5- Dozent hinzufuegen");
	        	System.out.println("6- Dozenten auflisten");
	            System.out.println("7- Dozent suchen");
	        	System.out.println("8- Dozent loeschen");
	        	
	        	System.out.println("9- LVA hinzufuegen");
	        	System.out.println("10- LVA auflisten");
	        	System.out.println("11- LVA suchen");
		      	System.out.println("12- LVA loeschen");
	            
	        	Scanner scan = new Scanner(System.in);
	            operation = scan.nextInt();
	            
	            switch(operation) {
	            
	            	//Student
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
		            	System.out.println("Geben Sie die Matrikelnummer des Studenten ein, den Sie löschen wollen :");
		            	Matrikelnummer = scan.next();
		            	
		            	uni.loschenStudenten(Matrikelnummer);
		            	break;
		            	
		            //Dozenten
		            case 5: //Dozent hinzufuegen
		            	System.out.println("Vornama : ");
		             	vorName = scan.next();
		                   
		             	System.out.println("Nachname : ");
		             	nachName =scan.next();
		                    
		              	System.out.println("ID : ");
		            	String dozentId = scan.next();
		                    
		             	uni.addDozent(dozentId, vorName, nachName);
		              	break;
		                   
		            case 6: //Dozenten auflisten
		            	uni.printDozenten();
		            	break;
		            	
		            case 7: //Dozent suchen
		            	System.out.println("Vorname : ");
		            	vorName = scan.next();
		            	
		            	System.out.println("Nachname :");
		            	nachName = scan.next();
		            	
		            	uni.suchenDozenten(vorName, nachName);
		                break;
		                
		            case 8: //Dozent loeschen
		            	System.out.println("Geben Sie die Matrikelnummer des Dozenten ein, den Sie löschen wollen :");
		            	dozentId = scan.next();
		            	
		            	uni.loschenDozenten(dozentId);
		            	break;
		            
		            //LVA
		            case 9: //LVA hinzufügen
		            	System.out.println("der Code der Lehrveranstaltung :");
		            	String code =scan.next();
		            	
		            	System.out.println("der Name der Lehrveranstaltung :");
		            	String Name = scan.next();
		            	
		            	uni.addLva(Name,code);
		            	break;
		          	  
		            case 10: //LVAen auflisten
		            	uni.printLvaen();
		            	break;
		            	  
		            case 11: //LVA suchen
		            	System.out.println("der Name der Lehrveranstaltung :");
		            	Name= scan.next();
		            	
		            	System.out.println("der Code der Lehrveranstaltung :");
		            	code = scan.next();
		            	
		            	uni.suchenLvaen(Name, code);
		            	break;
		           	
		            case 12: //LVA loeschen
		            	System.out.println("Geben Sie der Code der Lehrveranstaltung ein, den Sie löschen wollen :");
		            	code = scan.next();
		            	
		            	uni.löschenLvaen(code);
		            	break;
	
	            }
	       }
	}
	
}
