package bolt;

import java.util.Date;

public class Sajt {
	private double suly;
	private double zsirtartalom;
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
	}
	
	public double getSuly() {
		return suly;
	}
	
	public double getZsirtartalom() {
		return zsirtartalom;
	}
	
	public String toString (){
		return "" + getSuly() + getZsirtartalom() + getSzavatossagiIdo() + getVonalKod() + getGyarto() ;
	}
	
	public boolean joMeg() {
        Date today = new Date();
        return today.before(szavatossagiIdo);		
	}
	
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}
	
	public Long getVonalKod() {
		return vonalKod;
	}
	
	public String getGyarto(){
		return gyarto;
	}
}


