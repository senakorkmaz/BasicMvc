package Mvc;

import java.util.ArrayList;


public class Ogrenci {
	public String ad;
	public String soyad;
	public Ogrenci(String ad, String soyad ) {
		this.ad = ad;
		this.soyad = soyad;
	}
	@Override
	public String toString() {
		
		String Ogr="Ogrenci Adi: " + ad + " Soyadi: " + soyad + "";
		return Ogr;
	}
	
}		
