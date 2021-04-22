
public class Dozent {

	//Dozenten Attribute
	private String dozentid = " ";
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
	
	public String getDozentid() { 
		return dozentid;
	}
	public void setDozentid(String dozentid) {
		this.dozentid = dozentid;
	}
	
	//Konstruktoren von hinzuf�gen
	public Dozent (String dozentid, String vorname, String nachname) {
		this.vorname= vorname;
		this.nachname= nachname;
		this.dozentid =dozentid;
	}
		 
	public Dozent(String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}
	//Konstruktoren von l�schen
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