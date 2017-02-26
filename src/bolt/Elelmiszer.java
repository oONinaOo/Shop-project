package bolt;

import java.util.Date;

public class Elelmiszer {
	private long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Elelmiszer (long vonalKod, String gyarto, Date szavatossagiIdo){
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
	}
	
	public long getVonalKod(){
		return vonalKod;
	}
	
	public boolean joMeg() {
		Date today = new Date();
		return today.before(szavatossagiIdo);
	}
	
	public String getGyarto(){
		return gyarto;
	}
	
	public Date getSzavatossagiIdo(){
		return szavatossagiIdo;
	}
	
	public String toString() {
		return "" + getVonalKod() + getGyarto() + getSzavatossagiIdo();
	}
}
