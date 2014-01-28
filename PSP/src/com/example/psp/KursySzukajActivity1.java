package com.example.psp;
import com.example.psp.R;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;

public class KursySzukajActivity1 extends Activity {
	
	Button menu, nastepne;
	Spinner oddzial;
	EditText kurs, prowadzacy, grupa;
	CheckBox dlaMezczyzn,dlaKobiet, grupyZablokowane, grupyPelne;
	public static KursyDaneSzukane dane = null;
	public static KursyDaneSzukane getDane() {
		return dane;
	}

	public static void setDane(KursyDaneSzukane dane) {
		KursySzukajActivity1.dane = dane;
	}
	public void addItemsOnSpinner() {
		 
		oddzial = (Spinner) findViewById(R.id.oddzial);
		List<String> lista = new ArrayList<String>();
			lista.add("");
			lista.add("Wydzia³ informatyki i zarz¹dzania");
			lista.add("Studium jêzyków obcych");
			lista.add("Studium wychowania fizycznego");
			lista.add("Studium nauk humanistycznych");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				R.layout.spinnertext, lista);
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		oddzial.setAdapter(dataAdapter);
	}
	
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kursy_szukaj_jeden);
		
		addItemsOnSpinner();

		menu = (Button) findViewById(R.id.kursy_szukaj_jeden_menu);
		nastepne = (Button) findViewById(R.id.wyszukaj);
		oddzial = (Spinner) findViewById(R.id.oddzial);
		

		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				if(R.id.kursy_szukaj_jeden_menu==v.getId()){
					Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
				}
				
				if(R.id.wyszukaj==v.getId()){
					dane = new KursyDaneSzukane();
					kurs = (EditText) findViewById(R.id.kursy_szukaj_jeden_kurs);
					prowadzacy = (EditText) findViewById(R.id.prowadzacy);
					grupa = (EditText) findViewById(R.id.kursy_szukaj_jeden_grupa);
					dlaMezczyzn = (CheckBox) findViewById(R.id.kursy_szukaj_jeden_dlaMezczyzn);
					dlaKobiet = (CheckBox) findViewById(R.id.kursy_szukaj_jeden_dlaKobiet);
					grupyZablokowane = (CheckBox) findViewById(R.id.kursy_szukaj_jeden_grupyZablokowane);
					grupyPelne = (CheckBox) findViewById(R.id.kursy_szukaj_jeden_pelneGrupy);
					
					if (dlaMezczyzn.isChecked()) {
						dane.setDlaMezczyzn(false);
			         }
					if (dlaKobiet.isChecked()) {
						dane.setDlaKobiet(false);
			         }
					if (grupyZablokowane.isChecked()) {
						dane.setGrupyZablokowane(false);
			         }
					if (grupyPelne.isChecked()) {
						dane.setPelneGrupy(false);
			         }
					
					dane.setKurs(kurs.getText().toString());
					dane.setProwadzacy(prowadzacy.getText().toString());
					dane.setGrupa(grupa.getText().toString());
					dane.setOddzial(oddzial.getSelectedItem().toString());
					
					Intent intent = new Intent(getBaseContext(), KursySzukajActivity2.class);
					
					startActivity(intent);
				}
			}
	 };

	 menu.setOnClickListener(oclBtnOk);
	 nastepne.setOnClickListener(oclBtnOk);
	 oddzial.setOnItemSelectedListener(new SpinnerItemSelected());

	}
	
}
