package Tej;

import java.util.Date;

import bolt.Tej;

public class TartosTej extends Tej {
	
	private long ar;

	public TartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
		super(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom);
		this.ar = ar;
	}

}
