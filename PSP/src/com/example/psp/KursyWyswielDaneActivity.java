package com.example.psp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class KursyWyswielDaneActivity extends Activity {

	KursyXMLDane data;
	KursyDaneSzukane dane,dane2;
	private ListView listView;
	String kodKursu="",kodGrupy="", nazwa="", termin="", prowadzacy="",
			iloscMiejsc="", zzu="", Uwagi="", nazwaOddzialu="";
	boolean dlaMezczyzn, dlaKobiet, grupyZablokowane, grupyPelne, poniedzialek, wtorek, sroda, czwartek, piatek,sobota, niedziela;
	private ArrayList<KursyDaneWyswietlane>  szukaneDane=null;
	private static final String TAG = PSPActivity.class.getSimpleName();
		
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("TEST","tu jesten1");
		setContentView(R.layout.activity_kursy_wyswietlanie);
		Log.i("TEST","tu jesten2");
		listView=(ListView) findViewById(R.id.kursy_listView);
		Log.i("TEST","tu jesten3");
		data = KursyXMLObsluga.data;
		dane = KursySzukajActivity1.dane;
		dane2 = KursySzukajActivity2.dane;
		Log.i("TEST","tu jesten4");
		nazwaOddzialu = dane.getOddzial();
		nazwa = dane.getKurs();
		kodGrupy = dane.getGrupa();
		prowadzacy = dane.getProwadzacy();
		dlaMezczyzn= dane.getDlaMezczyzn();
		dlaKobiet = dane.getDlaKobiet(); 
		grupyZablokowane = dane.getGrupyZablokowane();
		grupyPelne = dane.getPelneGrupy();
		poniedzialek = dane2.getPoniedzialek();
		wtorek = dane2.getWtorek();
		sroda = dane2.getSroda();
		czwartek = dane2.getCzwartek();
		piatek = dane2.getPiatek();
		sobota = dane2.getSobota();
		
		Log.i("rozmiar",Integer.toString(data.getKodGrupy().size()));
		szukaneDane = new ArrayList<KursyDaneWyswietlane>();
		for (int i = 0; i < 734; i++) {
			
			
			boolean istnieje=false;
			if(nazwaOddzialu.equals("") && nazwa.equals("") && prowadzacy.equals("") && kodGrupy.equals("") && dlaMezczyzn &&
					dlaKobiet && grupyZablokowane && grupyPelne && !poniedzialek && !wtorek && !sroda && !czwartek && !piatek ){
				istnieje=true;
			}

			boolean istniejeOddzial=false, istniejeKurs=false, istniejeProwadzacy=false, istniejeKodGrupy=false,
					istniejeDlaMezczyzn=false, istniejeDlaKobiet=false, istniejeGrupyZablokowane=false, istniejeGrupyPelne=false,
					istniejeGrupyZablokowaneCzesc=false, istniejePoniedzialek=false, istniejeWtorek=false, istniejeSroda=false,
					istniejeCzwartek=false, istniejePiatek=false;
			if(!istnieje){
				istnieje=false;
				
				if(nazwaOddzialu.equals(""))
					istniejeOddzial=true;
				if(nazwa.equals(""))
					istniejeKurs=true;
				if(prowadzacy.equals(""))
					istniejeProwadzacy=true;
				if(kodGrupy.equals(""))
					istniejeKodGrupy=true;
				if(dlaMezczyzn)
					istniejeDlaMezczyzn=true;
				if(dlaKobiet)
					istniejeDlaKobiet=true;
				if(grupyZablokowane){
					istniejeGrupyZablokowane=true;
				}
				if(grupyPelne)
					istniejeGrupyPelne=true;
				if(!poniedzialek)
					istniejePoniedzialek=true;
				if(!wtorek)
					istniejeWtorek=true;
				if(!sroda)
					istniejeSroda=true;
				if(!czwartek)
					istniejeCzwartek=true;
				if(!piatek)
					istniejePiatek=true;
				
				
				String max="";
				       	max=data.getOddzial().get(i);
				
				       	if(max.length()<data.getNazwa().get(i).length())
	        				max=data.getNazwa().get(i);
				       	
				       	if(max.length()<data.getKodGrupy().get(i).length())
	        				max=data.getKodGrupy().get(i);				       	
				       	
				       	if(max.length()<data.getProwadzacy().get(i).length())
	        				max=data.getProwadzacy().get(i);
				       
				       	if(max.length()<data.getUwagi().get(i).length())
	        				max=data.getUwagi().get(i);
	        			
				       	if(max.length()<data.getTermin().get(i).length())
	        				max=data.getTermin().get(i);
	        
				for(int j=0; j<max.length();j++){
					if(!istniejeOddzial)
						if(j+nazwaOddzialu.length()<=data.getOddzial().get(i).length()){
							if(nazwaOddzialu.equalsIgnoreCase(data.getOddzial().get(i).substring(j, j+nazwaOddzialu.length()))){
								istniejeOddzial=true;
								Log.i("znalazl sie", data.getOddzial().get(i).substring(j, j+nazwaOddzialu.length()));
								
							}
						}
						
					if(!istniejeKurs)
						if(j+nazwa.length()<=data.getNazwa().get(i).length()){
							if(nazwa.equalsIgnoreCase(data.getNazwa().get(i).substring(j, j+nazwa.length()))){
								istniejeKurs=true;
							
								
							}
						}
					if(!istniejeProwadzacy)	
						if(j+prowadzacy.length()<=data.getProwadzacy().get(i).length())
							if(prowadzacy.equalsIgnoreCase(data.getProwadzacy().get(i).substring(j, j+prowadzacy.length()))){
								istniejeProwadzacy=true;
							
							
							}
					
					if(!istniejeKodGrupy)
						if(j+kodGrupy.length()<=data.getKodGrupy().get(i).length())
							if(kodGrupy.equalsIgnoreCase(data.getKodGrupy().get(i).substring(j, j+kodGrupy.length()))){
								istniejeKodGrupy=true;
							
								
							}
					
					if(!istniejeDlaMezczyzn)
						if(!data.getUwagi().get(i).startsWith("[Uwaga: grupa przeznaczona tylko dla mê¿czyzn]"))
							istniejeDlaMezczyzn=true;
					
					if(!istniejeDlaKobiet)
						if(!data.getUwagi().get(i).startsWith("[Uwaga: grupa przeznaczona tylko dla kobiet]"))
							istniejeDlaKobiet=true;
					
					if(!istniejeGrupyZablokowane && !istniejeGrupyZablokowaneCzesc){
						String przydatnosc="O przydatnoœci do sekcji decyduje trener";
						if(j+przydatnosc.length()<=data.getUwagi().get(i).length())
							if(przydatnosc.equalsIgnoreCase(data.getUwagi().get(i).substring(j, j+przydatnosc.length()))){
								Log.i("przytanosc",data.getUwagi().get(i).substring(j, j+przydatnosc.length()));
								istniejeGrupyZablokowaneCzesc=true;
							}
					}
				
					
						
					
				}
				
				if(!istniejeGrupyPelne)
					if(!data.getLiczbaMiejsc().get(i).equals("0")&&!data.getLiczbaMiejsc().get(i).equals("00"))
						istniejeGrupyPelne=true;
				
				if(!istniejePoniedzialek){
					istniejePoniedzialek=sprawdzDzien(i,"PN",dane2.getPnOdGodz(),dane2.getPnOdMin(),dane2.getPnDoGodz(),dane2.getPnDoMin());
				}
				
				if(!istniejeWtorek){
					istniejeWtorek=sprawdzDzien(i,"WT",dane2.getWtOdGodz(),dane2.getWtOdMin(),dane2.getWtDoGodz(),dane2.getWtDoMin());
				}
				
				if(!istniejeSroda){
					istniejeSroda=sprawdzDzien(i,"ŒR",dane2.getSrOdGodz(),dane2.getSrOdMin(),dane2.getSrDoGodz(),dane2.getSrDoMin());
				}
				if(!istniejeCzwartek){
					istniejeCzwartek=sprawdzDzien(i,"CZ",dane2.getCzwOdGodz(),dane2.getCzwOdMin(),dane2.getCzwDoGodz(),dane2.getCzwDoMin());
				}
				if(!istniejePiatek){
					istniejePiatek=sprawdzDzien(i,"PT",dane2.getPtOdGodz(),dane2.getPtOdMin(),dane2.getPtDoGodz(),dane2.getPtDoMin());
				}
			}
			Log.i("test",Boolean.toString(istniejeDlaKobiet));

			if(istniejeGrupyZablokowaneCzesc)
				istniejeGrupyZablokowane=false;
			else
				istniejeGrupyZablokowane=true;
			
	      if(istnieje || (istniejeOddzial && istniejeKurs && istniejeProwadzacy && istniejeKodGrupy && istniejeDlaMezczyzn
	    		  && istniejeDlaKobiet && istniejeGrupyZablokowane && istniejeGrupyPelne && istniejePoniedzialek && istniejeWtorek
	    		  && istniejeSroda && istniejeCzwartek && istniejePiatek))  {

	    	  KursyDaneWyswietlane daneWyswietlane = new KursyDaneWyswietlane();

	    	  daneWyswietlane.setKodKursu(data.getKodKursu().get(i));

	    	  daneWyswietlane.setKodGrupy(data.getKodGrupy().get(i));
	    	  
	    	  daneWyswietlane.setNazwa(data.getNazwa().get(i));
	    	  daneWyswietlane.setTermin(data.getTermin().get(i));
	    	  daneWyswietlane.setProwadzacy(data.getProwadzacy().get(i));
	    	  daneWyswietlane.setLiczbaMiejsc(data.getLiczbaMiejsc().get(i));
	    	  daneWyswietlane.setZZU(data.getZZU().get(i));
	    	  daneWyswietlane.setUwagi(data.getUwagi().get(i));
	    	  szukaneDane.add(daneWyswietlane);
	      }
		}
		Log.i("TEST","tu jesten1");
		listView.setAdapter(new KursyBazaAdapter(this, szukaneDane));
		Log.i("TEST","tu jestem11");
	}		
	boolean sprawdzDzien(int i, String dzien, String godzOd, String minOd, String godzDo, String minDo){
		String tab[]=null, tabela[]=null;
		tabela=data.getTermin().get(i).split(";");
		for(int indeks = 0; indeks<tabela.length; indeks++){
		tab=tabela[indeks].split(" ");
		for(int k=0; k<tab.length; k++)
			if(tab[k].equals(dzien)){
				if(tab[k+1].equals("(TP)")||tab[k+1].equals("(TN)"))
					tab=tab[k+2].split("-");
				else 
					tab=tab[k+1].split("-");
				String tab1[]=null;
				tab1=tab[0].split(":");
				if(tab[1].equals("00"))
					tab[1]="0";
				else if (tab[1].equals("05"))
					tab[1]="5";
				if(Integer.parseInt(godzOd)<Integer.parseInt(tab1[0])||
						(Integer.parseInt(godzOd)==Integer.parseInt(tab1[0]))&&Integer.parseInt(minOd)<=Integer.parseInt(tab1[1])){			
					tab1=tab[1].split(":");
					if(tab[1].equals("00"))
						tab[1]="0";
					else if (tab[1].equals("05"))
						tab[1]="5";
					if(Integer.parseInt(godzDo)>Integer.parseInt(tab1[0])||(
						Integer.parseInt(godzDo)==Integer.parseInt(tab1[0])&&Integer.parseInt(minDo)>=Integer.parseInt(tab1[1]))){
									
						return false;
				
					}
				}
			}
		}
		return true;
	}
}