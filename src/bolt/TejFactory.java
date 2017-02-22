package bolt;

import java.util.Date;

import Tej.FeltartosTej;
import Tej.TartosTej;

public abstract class TejFactory {

		public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom, ar);
		}
		
		public Tej ujFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom, ar);
		}
}
