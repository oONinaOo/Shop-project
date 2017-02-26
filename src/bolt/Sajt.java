package bolt;

import java.util.Date;

public class Sajt extends Elelmiszer {
	private double suly;
	private double zsirtartalom;
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		super(vonalKod, gyarto, szavatossagiIdo);
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
	
	public long getVonalKod() {
		return vonalKod;
	}
	
	public String getGyarto(){
		return gyarto;
	}
}


