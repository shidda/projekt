package com.example.psp;

import java.util.ArrayList;

public class KursyDaneSzukane {
	private String oddzial, kurs, prowadzacy,grupa;
	private boolean pelneGrupy=true, grupyZablokowane=true, dlaMezczyzn=true, dlaKobiet=true, poniedzialek=false, wtorek=false,
					sroda=false,czwartek=false, piatek=false, sobota=false, niedziela=false; 
	private String pnOdGodz, pnOdMin, pnDoGodz, pnDoMin, wtOdGodz, wtOdMin, wtDoGodz, wtDoMin,
					srOdGodz, srOdMin, srDoGodz, srDoMin, czwOdGodz, czwOdMin, czwDoGodz, czwDoMin, ptOdGodz, ptOdMin, 
					ptDoGodz, ptDoMin, sobOdGodz="", sobOdMin="", sobDoGodz="", sobDoMin="", niedOdGodz, niedOdMin, niedDoGodz, niedDoMin;
	
	
	
	public String getOddzial() {
		return oddzial;
	}
	public void setOddzial(String oddzial) {
		this.oddzial=oddzial;
	}
	
	public String getKurs() {
		return kurs;
	}
	public void setKurs(String kurs) {
		this.kurs=kurs;
	}
	
	public String getProwadzacy() {
		return prowadzacy;
	}
	public void setProwadzacy(String prowadzacy) {
		this.prowadzacy=prowadzacy;
	}
	
	public String getGrupa() {
		return grupa;
	}
	public void setGrupa(String grupa) {
		this.grupa=grupa;
	}
	
	public boolean getPelneGrupy() {
		return pelneGrupy;
	}
	public void setPelneGrupy(boolean pelneGrupy) {
		this.pelneGrupy=pelneGrupy;
	}
	
	public boolean getGrupyZablokowane() {
		return grupyZablokowane;
	}
	public void setGrupyZablokowane(boolean grupyZablokowane) {
		this.grupyZablokowane=grupyZablokowane;
	}
	
	public boolean getDlaMezczyzn() {
		return dlaMezczyzn;
	}
	public void setDlaMezczyzn(boolean dlaMezczyzn) {
		this.dlaMezczyzn=dlaMezczyzn;
	}
	
	public boolean getDlaKobiet() {
		return dlaKobiet;
	}
	public void setDlaKobiet(boolean dlaKobiet) {
		this.dlaKobiet=dlaKobiet;
	}
		
	
	//poniedzialek
	public boolean getPoniedzialek(){
		return poniedzialek;
	}
	
	public void setPoniedzialek(boolean poniedzialek){
		this.poniedzialek=poniedzialek;
	}
	
	public String  getPnOdGodz(){
		return pnOdGodz;
	}
	
	public void setPnOdGodz(String pnOdGodz){
		this.pnOdGodz = pnOdGodz;
	}
	
	public String  getPnOdMin(){
		return pnOdMin;
	}
	
	public void setPnOdMin(String pnOdMin){
		this.pnOdMin = pnOdMin;
	}
	
	public String  getPnDoGodz(){
		return pnDoGodz;
	}
	
	public void setPnDoGodz(String pnDoGodz){
		this.pnDoGodz = pnDoGodz;
	}
	public String  getPnDoMin(){
		return pnDoMin;
	}
	
	public void setPnDoMin(String pnDoMin){
		this.pnDoMin = pnDoMin;
	}
	//wtorek
	
	public boolean getWtorek(){
		return wtorek;
	}
	
	public void setWtorek(boolean wtorek){
		this.wtorek=wtorek;
	}
	public String  getWtOdGodz(){
		return wtOdGodz;
	}
	
	public void setWtOdGodz(String wtOdGodz){
		this.wtOdGodz = wtOdGodz;
	}
	
	public String  getWtOdMin(){
		return wtOdMin;
	}
	
	public void setWtOdMin(String wtOdMin){
		this.wtOdMin = wtOdMin;
	}
	
	public String  getWtDoGodz(){
		return wtDoGodz;
	}
	
	public void setWtDoGodz(String wtDoGodz){
		this.wtDoGodz = wtDoGodz;
	}
	public String  getWtDoMin(){
		return wtDoMin;
	}
	
	public void setWtDoMin(String wtDoMin){
		this.wtDoMin = wtDoMin;
	}
	
	//sroda
	public boolean getSroda(){
		return sroda;
	}
	
	public void setSroda(boolean sroda){
		this.sroda=sroda;
	}
	public String  getSrOdGodz(){
		return srOdGodz;
	}
	
	public void setSrOdGodz(String srOdGodz){
		this.srOdGodz = srOdGodz;
	}
	
	public String  getSrOdMin(){
		return srOdMin;
	}
	
	public void setSrOdMin(String srOdMin){
		this.srOdMin = srOdMin;
	}
	
	public String  getSrDoGodz(){
		return srDoGodz;
	}
	
	public void setSrDoGodz(String srDoGodz){
		this.srDoGodz = srDoGodz;
	}
	public String  getSrDoMin(){
		return srDoMin;
	}
	
	public void setSrDoMin(String srDoMin){
		this.srDoMin = srDoMin;
	}
	
	//czwartek
	
	public boolean getCzwartek(){
		return czwartek;
	}
	
	public void setCzwartek(boolean czwartek){
		this.czwartek=czwartek;
	}
	
	public String  getCzwOdGodz(){
		return czwOdGodz;
	}
	
	public void setCzwOdGodz(String czwOdGodz){
		this.czwOdGodz = czwOdGodz;
	}
	
	public String  getCzwOdMin(){
		return czwOdMin;
	}
	
	public void setCzwOdMin(String czwOdMin){
		this.czwOdMin = czwOdMin;
	}
	
	public String  getCzwDoGodz(){
		return czwDoGodz;
	}
	
	public void setCzwDoGodz(String czwDoGodz){
		this.czwDoGodz = czwDoGodz;
	}
	public String  getCzwDoMin(){
		return czwDoMin;
	}
	
	public void setCzwDoMin(String czwDoMin){
		this.czwDoMin = czwDoMin;
	}
	
	//piatek
	
	public boolean getPiatek(){
		return piatek;
	}
	
	public void setPiatek(boolean piatek){
		this.piatek=piatek;
	}
	
	public String  getPtOdGodz(){
		return ptOdGodz;
	}
	
	public void setPtOdGodz(String ptOdGodz){
		this.ptOdGodz = ptOdGodz;
	}
	
	public String  getPtOdMin(){
		return ptOdMin;
	}
	
	public void setPtOdMin(String ptOdMin){
		this.ptOdMin = ptOdMin;
	}
	
	public String  getPtDoGodz(){
		return ptDoGodz;
	}
	
	public void setPtDoGodz(String ptDoGodz){
		this.ptDoGodz = ptDoGodz;
	}
	public String  getPtDoMin(){
		return ptDoMin;
	}
	
	public void setPtDoMin(String ptDoMin){
		this.ptDoMin = ptDoMin;
	}
	
	//sobota
	
	public boolean getSobota(){
		return sobota;
	}
	
	public void setSobota(boolean sobota){
		this.sobota=sobota;
	}
	
	public String  getSobOdGodz(){
		return sobOdGodz;
	}
	
	public void setSobOdGodz(String sobOdGodz){
		this.sobOdGodz = sobOdGodz;
	}
	
	public String  getSobOdMin(){
		return sobOdMin;
	}
	
	public void setSobOdMin(String sobOdMin){
		this.sobOdMin = sobOdMin;
	}
	
	public String  getSobDoGodz(){
		return sobDoGodz;
	}
	
	public void setSobDoGodz(String sobDoGodz){
		this.sobDoGodz = sobDoGodz;
	}
	public String  getSobDoMin(){
		return sobDoMin;
	}
	
	public void setSobDoMin(String sobDoMin){
		this.sobDoMin = sobDoMin;
	}
	
	//niedziela
	
	public boolean getNiedziela(){
		return niedziela;
	}
	
	public void setNiedziela(boolean niedziela){
		this.niedziela=niedziela;
	}
	
	public String  getNiedzOdGodz(){
		return niedOdGodz;
	}
	
	public void setNiedzOdGodz(String niedOdGodz){
		this.niedOdGodz = niedOdGodz;
	}
	
	public String  getNiedzOdMin(){
		return niedOdMin;
	}
	
	public void setNiedzOdMin(String niedOdMin){
		this.niedOdMin = niedOdMin;
	}
	
	public String  getNiedzDoGodz(){
		return niedDoGodz;
	}
	
	public void setNiedzDoGodz(String niedDoGodz){
		this.niedDoGodz = niedDoGodz;
	}
	public String  getNiedzDoMin(){
		return niedDoMin;
	}
	
	public void setNiedzDoMin(String niedDoMin){
		this.niedDoMin = niedDoMin;
	}
	
}
