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

		public Tej ujFelzsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, Tej.FELZSIROS);
		}
		
		public Tej ujZsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, Tej.ZSIROS);
		}
		
		public Tej ujFelzsirosFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, Tej.FELZSIROS);
		}
		
		public Tej ujZsirosFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatosagiIdo, Tej.ZSIROS);
		}
		
		public Tej ujFelzsirosLiteresTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, Tej.LITER, gyarto, szavatosagiIdo, Tej.FELZSIROS);
		}
		
		public Tej ujZsirosLiteresTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new TartosTej(vonalKod, Tej.LITER, gyarto, szavatosagiIdo, Tej.ZSIROS);
		}
		
		public Tej ujFelzsirosLiteresFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatosagiIdo, Tej.FELZSIROS);
		}
		
		public Tej ujZsirosLiteresFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatosagiIdo, double zsirtartalom, long ar){
			return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatosagiIdo, Tej.ZSIROS);
		}		
		
		public Sajt ujSajt(double suly, double zsirtartalom, Long vonalKod, String gyarto, Date szavatossagiIdo){
			return new Sajt(suly, zsirtartalom, vonalKod, gyarto, szavatossagiIdo);
		}
		
		public Szappan ujSzappan(Long vonalKod, String gyarto, char mosohatas){
			return new Szappan(vonalKod, gyarto, mosohatas);
		}
}
