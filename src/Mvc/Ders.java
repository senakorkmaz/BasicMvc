package Mvc;

public class Ders {
	
		public String ad;
		public String kredi;
		public Ders(String ad,String kredi) {
			this.ad = ad;
			this.kredi=kredi;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Ders Adi: "+ad+" Kredisi: " + kredi+"";
		}
		
		
}
