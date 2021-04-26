
public class LVA {
	
	//LVAen Attribute
	private String name = " ";
	private String derskodu = " ";
	
	//get-set functions
	public String getDerskodu() {
		  return derskodu;
	 }
	public void setDerskodu(String derskodu) {
		this.derskodu = derskodu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	//Konstruktoren von hinzufügen
    public LVA (String derskodu, String name) {
    	this.derskodu= derskodu;
    	this.name=name;
    }
    //Konstruktoren von löschen
    public LVA (String derskodu) {
    	this.derskodu=derskodu;
    }
    
	@Override 
	public String toString() {
		return derskodu +" "+ name;
	}
	 
	public boolean equals(Object o) {
    	LVA a = (LVA) o;
        if (derskodu.equals(a.derskodu)) {
        	return true;
        }
        else {
        	return false;
        }
	}
}
