
public class Dozent extends Person {

	//Dozenten Attribute
	private String dozentid = " ";
		
	//get-set functions
	public String getDozentid() { 
		return dozentid;
	}
	public void setDozentid(String dozentid) {
		this.dozentid = dozentid;
	}
	
	//Konstruktoren von hinzufügen
	public Dozent (String dozentid, String vorname, String nachname) {
		this.vorname= vorname;
		this.nachname= nachname;
		this.dozentid =dozentid;
	}
		 
	public Dozent(String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}
	//Konstruktoren von löschen
	public Dozent (String dozentid) {
		this.dozentid = dozentid;
	}
	
	@Override
	public String toString() {
		return dozentid+" "+vorname+" "+nachname.toUpperCase();
	}
	
	public boolean equals(Object o) {
		Dozent a = (Dozent) o;
	   	if (dozentid.equals(a.dozentid)) {
	        return true;
	    }
	    else {
	       return false;
	    }
	}
}