package bolt;

import java.util.Hashtable;
import java.util.Map;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, Tej> tejpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, Tej> tejpult){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
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
	
	public boolean vanMegTej() {
		return (tejpult.size() > 0);
	}
	
	public Tej vasarolTej(long vonalKod) {
	    while (tejpult.entrySet().iterator().hasNext()) {
	        Map.Entry<Long, Tej> entry =tejpult.entrySet().iterator().next();
	        if (entry.getKey().equals(vonalKod)){
	        	tejpult.remove(vonalKod);
	        	return entry.getValue();
	        }	        	
		} return null;
	}
	public void feltoltTej (Tej m){
		tejpult.put(m.getVonalKod(), m);
	}
}