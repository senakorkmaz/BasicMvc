package Mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller {
	private View theView;
	private Model theModel;
	Controller(View view, Model model) {
		this.theView=view;
		this.theModel=model;
		this.theView.addButton1Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				theView.setLi1(theModel.getOgrenciler());
			}
			
		});
		
		this.theView.addButton2Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(theView.getLi1SelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null, "Lutfen Bir Ogrenci Seçiniz!!","Hatali Islem", JOptionPane.ERROR_MESSAGE);
				}else {
				theModel.ogrenciSil(theView.getLi1SelectedIndex());
				theView.setLi1(theModel.getOgrenciler());
				JOptionPane.showMessageDialog(null, "Ogrenci Silme Islemi Basarili","Basarili Islem", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			
		});
		this.theView.addButton3Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				theView.setLi2(theModel.getDersler());
				
			}
			
		});
		this.theView.addButton4Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(theView.getLi2SelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null, "Lutfen Bir Ders Seçiniz!!","Hatali Islem", JOptionPane.ERROR_MESSAGE);
				}else {
				theModel.dersSil(theView.getLi2SelectedIndex());
				theView.setLi2(theModel.getDersler());
				JOptionPane.showMessageDialog(null, "Ders Silme Islemi Basarili","Basarili Islem", JOptionPane.INFORMATION_MESSAGE);
				}

			}
			
		});
		this.theView.addButton5Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(theView.getT1().contentEquals("")){
					JOptionPane.showMessageDialog(null,"Lutfen Ogrencini Adini Giriniz!!","Hatali Bilgi Girisi", JOptionPane.ERROR_MESSAGE);
				}
				else if(theView.getT2().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Lutfen Ogrencinini Soyadini Giriniz!!","Hatali Bilgi Girisi", JOptionPane.ERROR_MESSAGE);
				}
				else{
				theModel.ogrenciEkle(theView.getT1(), theView.getT2());
				theView.setT1();
				theView.setT2();
				JOptionPane.showMessageDialog(null, "Ogrenci Ekleme Islemi Basarili","Basarili Islem", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
			
		});
		this.theView.addButton6Listener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(theView.getT3().contentEquals("")){
					JOptionPane.showMessageDialog(null, "Lutfen Dersin Adini Giriniz!!","Hatali Bilgi Girisi", JOptionPane.ERROR_MESSAGE);
				}
				else if(theView.getT4().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Lutfen Dersin Kredisini Giriniz!!","Hatali Bilgi Girisi", JOptionPane.ERROR_MESSAGE);
				}else {
				theModel.dersEkle(theView.getT3(), theView.getT4());
				theView.setT3();
				theView.setT4();
				JOptionPane.showMessageDialog(null, "Ders Ekleme Islemi Basarili","Basarili Islem", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			
		});
	
	}
}
