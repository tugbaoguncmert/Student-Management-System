
public class Student {
	
	//Studenten Attribute 
	private String matrikelnummer = " ";
	private String vorname = " ";
	private String nachname = " ";
	
	//get-set functions
	public String getVorname() {
		 return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname; 
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
	     this.nachname = nachname; 
	}
	
	public String getMatrikelnummer() {
		return matrikelnummer;
	}
	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	//Konstruktoren von hinzufügen
	public Student (String matrikelnummer, String vorname, String nachname) {
		this.vorname= vorname;
		this.nachname= nachname;
		this.matrikelnummer =matrikelnummer;
	}
	//Konstruktoren von löschen
	public Student (String matrikelnummer) {
		 this.matrikelnummer = matrikelnummer;
	 }
	
	public static boolean kontrollieren(String matrikelnummer) {
		for(int i=0 ; i< matrikelnummer.length(); i++) {
			//control of number
			if(matrikelnummer.charAt(i) < '0' && matrikelnummer.charAt(i) > '9') {
				return false;
			}
		}
		//control the number of digit
		if((matrikelnummer.charAt(0)=='0') || (matrikelnummer.length() != 7)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return matrikelnummer +" "+ vorname+" "+nachname.toUpperCase();
	}
	
	public boolean equals(Object o) {
        Student a = (Student) o;
        if (matrikelnummer.equals(a.matrikelnummer)) {
        	return true;
        }
        else {
       	 	return false;
        }
	}

}
