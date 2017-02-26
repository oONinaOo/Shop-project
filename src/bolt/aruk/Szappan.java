package bolt.aruk;

import bolt.Aru;

public class Szappan extends Aru{
	
	long vonalKod;
	String gyarto;
	char mosohatas;
	
	public Szappan(Long vonalKod, String gyarto, char mosohatas){
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.mosohatas = mosohatas;
	}

}
