package bolt;

import java.util.*;

public class Tej {
	private final int LITER = 4;
	private final int FELLITER = 2;
	private final int POHAR = 1;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 1.5;
	private long vonalKod;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	
	public Tej (long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
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
	
	public String toString() {
		return "" + getGyarto() + getUrtartalom() + getSzavatossagiIdo() + getZsirtartalom();
	}
}
