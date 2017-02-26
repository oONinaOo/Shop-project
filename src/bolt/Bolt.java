package bolt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, Boltbejegyzes> elelmiszerpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, Boltbejegyzes> elelmiszerpult){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}
	
	public Bolt(String nev, String cim, String tulajdonos){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}
	
	public String getNev() {
		return nev;
	}
	
	public String getCim() {
		return cim;
	}
	
	public String getTulajdonos() {
		return tulajdonos;
	}
	
	public boolean vanMegAdottAru(Class c) {
		for (Boltbejegyzes boltBejegyzes: elelmiszerpult.values()) {
			Elelmiszer elelmiszer = boltBejegyzes.getElelmiszer();
			if(elelmiszer.getClass().equals(c)) return true;
		}
		return false;
	   }
	
	public boolean vanMegTej() {
		return vanMegAdottAru(Tej.class);
	}
	

	public boolean vanMegSajt() {
		return vanMegAdottAru(Sajt.class);
	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg) {
		while (elelmiszerpult.entrySet().iterator().hasNext()) {
			Map.Entry<Long, Boltbejegyzes> entry = elelmiszerpult.entrySet().iterator().next();
			if(entry.getKey().equals(vonalKod)) {
				entry.getValue().adMennyiseg(mennyiseg);
			}
		}
	}
	
	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		Boltbejegyzes boltBejegyzes = new Boltbejegyzes(e, mennyiseg, ar);
		elelmiszerpult.put(boltBejegyzes.e.getVonalKod(), boltBejegyzes);
	}
	
	public void torolElelmiszert(long vonalKod) {
		Map.Entry<Long, Boltbejegyzes> entry = elelmiszerpult.entrySet().iterator().next();
		if (entry.getKey().equals(vonalKod)) {
			elelmiszerpult.remove(vonalKod);
		}
	}
	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {
		while(elelmiszerpult.entrySet().iterator().hasNext()) {
			Map.Entry<Long, Boltbejegyzes> entry = elelmiszerpult.entrySet().iterator().next();
			if(entry.getKey().equals(vonalKod)) {
				 entry.getValue().levonMennyiseg(mennyiseg);
			}
		}
	}
	
	
	

	
	class Boltbejegyzes{
		private Elelmiszer e;
		private long mennyiseg;
	    private long ar;
		
		public Boltbejegyzes (Elelmiszer e, long mennyiseg, long ar){
			this.e= e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Elelmiszer getElelmiszer(){
			return e;
		}

		public void setElelmiszer(Elelmiszer e) {
			this.e = e;
		}

		public long getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(long mennyiseg) {
			this.mennyiseg = mennyiseg;
		}
		
		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg += mennyiseg;
		}
		
		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}

		public long getAr() {
			return ar;
		}

		public void setAr(long ar) {
			this.ar = ar;
		}
		
	}
}