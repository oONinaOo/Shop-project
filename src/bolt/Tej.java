package bolt;

import java.util.*;

public class Tej {
	private long vonalKod;
	private final int LITER = 4;
	private final int FELLITER = 2;
	private final int POHAR = 1;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 1.5;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;
	
	public Tej (long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}
	
	public long getVonalKod() {
		return vonalKod;
	}
	
	public boolean joMeg() {
        Date today = new Date();
        return today.before(szavatossagiIdo);
	}
	
	public int getUrtartalom(){
		return urtartalom;
	}
	
	public String getGyarto() {
		return gyarto;
	}
	
	public Date getSzavatossagiIdo(){
		return szavatossagiIdo;
		
	}
	
	public double getZsirtartalom(){
		return zsirtartalom;
		
	}
	
	public long getAr(){
		return ar;
		
	}
	
	public String toString() {
		return "" + getGyarto() + getUrtartalom() + getSzavatossagiIdo() + getZsirtartalom();
	}
}
