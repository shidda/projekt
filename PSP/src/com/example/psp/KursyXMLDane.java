package com.example.psp;

import java.util.ArrayList;

import android.util.Log;

public class KursyXMLDane {

	private ArrayList<String> kodKursu = new ArrayList<String>();
	private ArrayList<String> kodGrupy = new ArrayList<String>();
	private ArrayList<String> nazwa = new ArrayList<String>();
	private ArrayList<String> termin = new ArrayList<String>();
	private ArrayList<String> prowadzacy = new ArrayList<String>();
	private ArrayList<String> liczbaMiejsc = new ArrayList<String>();
	private ArrayList<String> zZU = new ArrayList<String>();
	private ArrayList<String> uwagi = new ArrayList<String>();
	private ArrayList<String> oddzial = new ArrayList<String>();


	public ArrayList<String> getKodKursu() {
		return kodKursu;
	}

	public void setKodKursu(String kodKursu) {
		this.kodKursu.add(kodKursu);
	}
	
	public void setKodKursu(int i, String kodKursu) {
		this.kodKursu.set(i,kodKursu);
	}
	
	public ArrayList<String> getKodGrupy() {
		return kodGrupy;
	}

	public void setKodGrupy(String kodGrupy) {
		this.kodGrupy.add(kodGrupy);

	}
	public void setKodGrupy(int i,String kodGrupy) {
		this.kodGrupy.set(i, kodGrupy);

	}
	public ArrayList<String> getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa.add(nazwa);

	}
	
	public void setNazwa(int i, String nazwa) {
		this.nazwa.set(i,nazwa);

	}
	
	public ArrayList<String> getTermin() {
		return termin;
	}

	public String getTermin(int i) {
		return termin.get(termin.size()-1);
	}
	public void setTermin(String termin) {
		this.termin.add(termin);
	}
	
	public void setTermin(int i, String termin) {
		this.termin.set(i, termin);
	}
	public ArrayList<String> getProwadzacy() {
		return prowadzacy;
	}
	public String getProwadzacy(int i) {
		return prowadzacy.get(prowadzacy.size()-1);
	}

	public void setProwadzacy(String prowadzacy) {
		this.prowadzacy.add(prowadzacy);

	}
	public void setProwadzacy(int i, String prowadzacy) {
		this.prowadzacy.set(i, prowadzacy);

	}
	
	public ArrayList<String> getLiczbaMiejsc() {
		return liczbaMiejsc;
	}

	public void setLiczbaMiejsc(String liczbaMiejsc) {
		this.liczbaMiejsc.add(liczbaMiejsc);
	}

	
	public ArrayList<String> getZZU() {
		return zZU;
	}

	public void setZZU(String zZU) {
		this.zZU.add(zZU);

	}
	

	public ArrayList<String> getUwagi() {
		return uwagi;
	}
	
	public String getUwagi(int i) {
		return uwagi.get(uwagi.size()-1);
	}
	public void setUwagi(String uwagi) {
		this.uwagi.add(uwagi);

	}
	
	public void setUwagi(int i,String uwagi) {
		this.uwagi.set(i, uwagi);

	}
	public ArrayList<String> getOddzial() {
		return oddzial;
	}

	public void setOddzial(String oddzial) {
		this.oddzial.add(oddzial);

	}
	
}

