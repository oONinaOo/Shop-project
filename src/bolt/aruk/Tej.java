package bolt.aruk;

import java.util.*;

public abstract class Tej extends Elelmiszer{
	private final int LITER = 4;
	private final int FELLITER = 2;
	private final int POHAR = 1;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 1.5;
	private int urtartalom;
	private double zsirtartalom;
	
	public Tej (long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}
	
	public int getUrtartalom(){
		return urtartalom;
	}
	
	public double getZsirtartalom(){
		return zsirtartalom;
		
	}
	
	public String toString() {
		return "" + getGyarto() + getUrtartalom() + getSzavatossagiIdo() + getZsirtartalom();
	}
}
