import java.util.Vector;

public class Universitaet {
	
	private String name = "Türkisch-Deutsche Universitaet";
	
	public Vector Studenten = new Vector();
	
	public void addStudent (String matrikelnummer, String vorname, String nachname) {	
		Student stu = new Student(matrikelnummer, vorname, nachname);
			for(int i =0; i<Studenten.size(); i++) {
				if((Studenten.get(i)).equals(stu)) {
					System.out.println("Es können nicht 2 Studenten mit derselben Nummer sein.");
					return;
				}
			}
			if(Student.kontrollieren(matrikelnummer) == false) {
				System.out.println("Matrikelnummern dürfen nur aus Ziffern bestehen.");
				System.out.println("Die Länge  muss 7 sein und Die erste Ziffer darf nicht 0 sein.");
				return;
			}
			
			Studenten.add(stu); 
	}
	
	public void printStudenten() {
		for(int i =0; i<Studenten.size() ; i++) {
			System.out.println((Studenten.get(i)).toString());
		}
	}
	
	public void suchenStudenten(String vorname, String nachname) {
		for(int i=0; i<Studenten.size(); i++) {
			if (((Student)Studenten.get(i)).getVorname().equals(vorname) && ((Student)Studenten.get(i)).getNachname().equals(nachname)) {
				System.out.println((Studenten.get(i)).toString());
				return;
			}
		}
		System.out.println("Der Student wurde nicht gefunden.");
	}
	
   public void loschenStudenten(String matrikelnummer) {
	   for(int i=0; i<Studenten.size(); i++) {
			if (((Student)Studenten.get(i)).getMatrikelnummer().equals(matrikelnummer)) {
				Student a = new Student(matrikelnummer);
				Studenten.remove(a);
				System.out.println("Der Student wurde gelöscht.");
				return;
			}else {
				System.out.println("Der Student wurde nicht gefunden.");
			}
		}

   }
}
