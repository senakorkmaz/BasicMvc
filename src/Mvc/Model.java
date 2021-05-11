package Mvc;

import java.util.ArrayList;

public class Model {
	private ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
	private ArrayList<Ders> dersler = new ArrayList<Ders>();
	private int ogrenci_indexi=0;
	private int ders_indexi=0;
	public void ogrenciEkle(String ad, String soyad) {
		this.ogrenciler.add(new Ogrenci(ad,soyad));
		this.ogrenci_indexi++;
	}
	public void ogrenciSil(int index) {
		this.ogrenciler.remove(index);
		this.ogrenci_indexi--;
	}
	public void dersEkle(String ad,String kredi) {
		this.dersler.add(new Ders(ad,kredi));
		this.ders_indexi++;
		
	}
	public void dersSil(int index) {
		this.dersler.remove(index);
		this.ders_indexi--;
	}
	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	public ArrayList<Ders> getDersler() {
		return dersler;
	}
	

}
