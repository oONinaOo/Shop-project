package bolt;

import bolt.aruk.Sajt;
import bolt.aruk.Szappan;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import.bolt.aruk.Tej;

import java.util.Date;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public abstract class BoltFactory {

		public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom, ar);
		}
		
		public Tej ujFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, zsirtartalom, ar);
		}
		
		public Sajt ujSajt(double suly, double zsirtartalom, Long vonalKod, String gyarto, Date szavatossagiIdo){
			return new Sajt(suly, zsirtartalom, vonalKod, gyarto, szavatossagiIdo);
		}
		
		public Szappan ujSzappan(Long vonalKod, String gyarto, char mosohatas){
			return new Szappan(vonalKod, gyarto, mosohatas);
		}
}
