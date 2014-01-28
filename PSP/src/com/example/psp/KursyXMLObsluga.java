package com.example.psp;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.util.Log;

public class KursyXMLObsluga extends DefaultHandler {

	String zawartosc = null;
	String jednostka="", kod="",nazwa="",zzu="";
	Boolean elementDodany = false;
	boolean bKodGrupy= false, bTermin=false, bProwadzacy=false, bLiczbaMiejsc=false, bUwagi=false;
	boolean missUwagi=false, missTermin=false, missProwadzacy=false;
	 int mCurrentIndex = -1;
	public static KursyXMLDane data = null;

	public static KursyXMLDane getXMLData() {
		return data;
	}

	public static void setXMLData(KursyXMLDane data) {
		KursyXMLObsluga.data = data;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		elementDodany = true;
		
		if (localName.equals("katalog")) {
			data = new KursyXMLDane();
		}
		
		else if (localName.equals("jednostka")) {
			jednostka=attributes.getValue("nazwa");
		}
		
		else if (localName.equals("kurs")) {

			kod=attributes.getValue("kod");
			nazwa=attributes.getValue("nazwa");
			zzu=attributes.getValue("zzu");

		}
		else if (localName.equals("grupa")){
			mCurrentIndex++;
			data.setTermin("");
			data.setUwagi("");
			data.setProwadzacy("");
			
		}
		
		else if (localName.equalsIgnoreCase("kod_grupy")){
			bKodGrupy=true;
		}
		
		else if (localName.equalsIgnoreCase("termin")){
			bTermin=true;
		}
		
		else if (localName.equalsIgnoreCase("prowadzacy")){
			bProwadzacy=true;
		}
		
		else if (localName.equalsIgnoreCase("liczba_miejsc")){
			bLiczbaMiejsc=true;
		}
			
		else if (localName.equalsIgnoreCase("uwagi")){
			bUwagi=true;
		}
	}


	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		if (localName.equalsIgnoreCase("kod_grupy")){
			bKodGrupy=false;
		}
		
		else if (localName.equalsIgnoreCase("termin")){
			bTermin=false;
			missTermin=false;
		}
		else if (localName.equalsIgnoreCase("prowadzacy")){
			bProwadzacy=false;
			missProwadzacy=false;
		}
		else if (localName.equalsIgnoreCase("liczba_miejsc")){
			bLiczbaMiejsc=false;
		}
		else if (localName.equalsIgnoreCase("uwagi")){
			bUwagi=false;
			missUwagi=false;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {

		if (bKodGrupy) {
			data.setKodGrupy(new String(ch, start, length));
			data.setOddzial(jednostka);
			data.setKodKursu(kod);
			data.setNazwa(nazwa);
			data.setZZU(zzu);
			
		}
		else if(bTermin){
			if(!missTermin){
				data.setTermin(mCurrentIndex, new String(ch, start, length));
			}
			else
				data.setTermin(mCurrentIndex,data.getTermin(1)+new String(ch, start, length));
			missTermin=true;
		}
		else if(bProwadzacy){
			if(!missProwadzacy)
				data.setProwadzacy(mCurrentIndex,new String(ch, start, length));
			else
				data.setProwadzacy(mCurrentIndex,data.getProwadzacy(1)+new String(ch, start, length));
			missProwadzacy=true;
		}
		else if(bLiczbaMiejsc){
			data.setLiczbaMiejsc(new String(ch, start, length));
		}
		else if(bUwagi){
			if(!missUwagi){
				data.setUwagi(mCurrentIndex,new String(ch, start, length));
}
			else
				data.setUwagi(mCurrentIndex,data.getUwagi(1)+
                 new String(ch, start, length));
			
			missUwagi=true;
		}

	}

}

