package bolt.aruk.tej;

import java.util.Date;

import bolt.aruk.Tej;

public class FeltartosTej extends Tej {
	
	private long ar;

	public FeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
		super(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom);
		this.ar = ar;
		}
}
