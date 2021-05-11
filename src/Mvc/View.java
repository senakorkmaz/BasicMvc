package Mvc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class View extends JFrame {
	private JButton b1 = new JButton("Ogrencileri Listele");
	private JButton b2 = new JButton("Secilen Ogrenciyi Sil");
	private JButton b3 = new JButton("Dersleri Listele");
	private JButton b4 = new JButton("Secilen Dersi Sil");
	private JButton b5 = new JButton("Ogrenci Ekle");
	private JButton b6 = new JButton("Ders Ekle");
	private JList<String> li1 = new JList();
	private JList<String> li2 = new JList();
	private JTextField t1 = new JTextField(15);
	private JTextField t2 = new JTextField(15);
	private JTextField t3 = new JTextField(15);
	private JTextField t4 = new JTextField(15);


	private JLabel l1 = new JLabel("Ogrencinin Bilgilerini Giriniz");
	private JLabel l2 = new JLabel("Adi:");
	private JLabel l22 = new JLabel("Adi:");
	private JLabel l3 = new JLabel("Soyadi:");
	private JLabel l4 = new JLabel("Dersin Bilgilerini giriniz ");
	private JLabel l5 = new JLabel("Kredisi");
	private JLabel l6 = new JLabel("Ogrenci listesi");
	private JLabel l7 = new JLabel("Ders Listesi");
	View(){
		this.setTitle("Ogrenci Ders Programi");
		JTabbedPane sekmeler = new JTabbedPane();
		JPanel p1=new JPanel();
		JPanel p11=new JPanel();
		JPanel p111=new JPanel();
		JPanel p2=new JPanel();
		JPanel p22=new JPanel();
		JPanel p222=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		li1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		li1.setLayoutOrientation(JList.VERTICAL);
	
		 
		li2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		li2.setLayoutOrientation(JList.VERTICAL);
	
		
		
		this.setSize(600,300);
		sekmeler.add("Ogrenci Listele",p1);
		p1.setLayout(new GridLayout(1,2));
		p11.add(l6);
		JScrollPane li11= new JScrollPane(li1);
		 li1.setBounds(100,100, 120,120);
		 li1.setVisible(true);
		p11.add(li11); 
		p111.add(b1);
		p111.add(b2);
		p1.add(p11);
		p1.add(p111);
		sekmeler.add("Ders Listele",p2);
		p2.setLayout(new GridLayout(1,2));
		p22.add(l7);
		JScrollPane li22= new JScrollPane(li2);
		li22.setBounds(100,100,20,20);
		li2.setBounds(100,100, 75,75);
		li2.setVisible(true);
		p22.add(li22);
		p222.add(b3);
		p222.add(b4);
		p2.add(p22);
		p2.add(p222);
		sekmeler.add("Ogrenci Ekle",p3);
		p3.setLayout(new GridLayout(6,1,5,5));
		p3.add(l1);
		p3.add(l2);
		p3.add(t1);
		p3.add(l3);
		p3.add(t2);
		p3.add(b5);
		sekmeler.add("Ders Ekle",p4);
		p4.setLayout(new GridLayout(6,1,5,5));
		p4.add(l4);
		p4.add(l22);
		p4.add(t3);
		p4.add(l5);
		p4.add(t4);
		p4.add(b6);
		this.add(sekmeler);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	public String getT1() {
		return t1.getText();
	}
	public void setT1() {
		t1.setText(null);
	}
	public String getT2() {
		return t2.getText();
	}
	public void setT2() {
		t2.setText(null);
	}
	public String getT3() {
		return t3.getText();
	}
	public void setT3() {
		t3.setText(null);
	}
	public String getT4() {
		return t4.getText();
	}
	public void setT4() {
		t4.setText(null);
	}
	
	public void addButton1Listener(ActionListener actionEvent) {
		 b1.addActionListener(actionEvent);
	 }
	public void addButton2Listener(ActionListener listen) {
		 b2.addActionListener(listen);
	 }
	public void addButton3Listener(ActionListener listen) {
		 b3.addActionListener(listen);
	 }
	public void addButton4Listener(ActionListener listen) {
		 b4.addActionListener(listen);
	 }
	public void addButton5Listener(ActionListener listen) {
		 b5.addActionListener(listen);
	 }
	public void addButton6Listener(ActionListener listen) {
		 b6.addActionListener(listen);
	 }
	
	public int getLi1SelectedIndex() {
		 return li1.getSelectedIndex();
	 }
	public int getLi2SelectedIndex() {
		 return li2.getSelectedIndex();
	 }
	public void setLi1(ArrayList<Ogrenci>  list) {
		String[] list1 = new String[list.size()];
	    for(int i=0 ; i<list.size(); i++) {
	    	list1[i]=""+list.get(i);
	    }
		li1.setListData(list1);
		li1.setVisible(true);
	}
	public void setLi2(ArrayList<Ders>  list) {
		String[] list2 = new String[list.size()];
	    for(int i=0 ; i<list.size(); i++) {
	    	list2[i]=""+list.get(i);
	    }
		li2.setListData(list2);
		li2.setVisible(true);
	}
}
