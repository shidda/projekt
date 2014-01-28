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
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;

public class KursySzukajActivity2 extends Activity {
	
	Button menu, szukaj;
	int licznik=0;
	Spinner spinOdGodz1, spinOdMin1, spinDoGodz1, spinDoMin1, 
			spinOdGodz2, spinOdMin2, spinDoGodz2, spinDoMin2, 
			spinOdGodz3, spinOdMin3, spinDoGodz3, spinDoMin3, 
			spinOdGodz4, spinOdMin4, spinDoGodz4, spinDoMin4,
			spinOdGodz5, spinOdMin5, spinDoGodz5, spinDoMin5,
			spinOdGodz6, spinOdMin6, spinDoGodz6, spinDoMin6;
	CheckBox poniedzialek, wtorek, sroda, czwartek, piatek, sobota, niedziela;
	public static KursyDaneSzukane dane = null;
	public static KursyDaneSzukane getDane() {
		return dane;
	}
	
	public void addItemsOnSpinner2() {
		 
		spinOdGodz1 = (Spinner) findViewById(R.id.spinOdGodz1);
		spinOdMin1 = (Spinner) findViewById(R.id.spinOdMin1);
		spinDoGodz1 = (Spinner) findViewById(R.id.spinDoGodz1);
		spinDoMin1 = (Spinner) findViewById(R.id.spinDoMin1);
		spinOdGodz2 = (Spinner) findViewById(R.id.spinOdGodz2);
		spinOdMin2 = (Spinner) findViewById(R.id.spinOdMin2);
		spinDoGodz2 = (Spinner) findViewById(R.id.spinDoGodz2);
		spinDoMin2 = (Spinner) findViewById(R.id.spinDoMin2);
		spinOdGodz3 = (Spinner) findViewById(R.id.spinOdGodz3);
		spinOdMin3 = (Spinner) findViewById(R.id.spinOdMin3);
		spinDoGodz3 = (Spinner) findViewById(R.id.spinDoGodz3);
		spinDoMin3 = (Spinner) findViewById(R.id.spinDoMin3);
		spinOdGodz4 = (Spinner) findViewById(R.id.spinOdGodz4);
		spinOdMin4 = (Spinner) findViewById(R.id.spinOdMin4);
		spinDoGodz4 = (Spinner) findViewById(R.id.spinDoGodz4);
		spinDoMin4 = (Spinner) findViewById(R.id.spinDoMin4);
		spinOdGodz5 = (Spinner) findViewById(R.id.spinOdGodz5);
		spinOdMin5 = (Spinner) findViewById(R.id.spinOdMin5);
		spinDoGodz5 = (Spinner) findViewById(R.id.spinDoGodz5);
		spinDoMin5 = (Spinner) findViewById(R.id.spinDoMin5);

		
		List<String> godziny = new ArrayList<String>();
		List<String> minuty = new ArrayList<String>();
		for(int i=7; i<23; i++)
			godziny.add(Integer.toString(i));
		minuty.add("00");
		minuty.add("05");
		for(int i=10; i<56; i=i+5)
			minuty.add(Integer.toString(i));
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				R.layout.spinnertext, godziny);
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
				R.layout.spinnertext, minuty);
			dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinOdGodz1.setAdapter(dataAdapter);
		spinOdMin1.setAdapter(dataAdapter2);
		spinDoGodz1.setAdapter(dataAdapter);
		spinDoMin1.setAdapter(dataAdapter2);
		spinOdGodz2.setAdapter(dataAdapter);
		spinOdMin2.setAdapter(dataAdapter2);
		spinDoGodz2.setAdapter(dataAdapter);
		spinDoMin2.setAdapter(dataAdapter2);
		spinOdGodz3.setAdapter(dataAdapter);
		spinOdMin3.setAdapter(dataAdapter2);
		spinDoGodz3.setAdapter(dataAdapter);
		spinDoMin3.setAdapter(dataAdapter2);
		spinOdGodz4.setAdapter(dataAdapter);
		spinOdMin4.setAdapter(dataAdapter2);
		spinDoGodz4.setAdapter(dataAdapter);
		spinDoMin4.setAdapter(dataAdapter2);
		spinOdGodz5.setAdapter(dataAdapter);
		spinOdMin5.setAdapter(dataAdapter2);
		spinDoGodz5.setAdapter(dataAdapter);
		spinDoMin5.setAdapter(dataAdapter2);
		//spinOdGodz6.setAdapter(dataAdapter);
		//spinOdMin6.setAdapter(dataAdapter2);
		//spinDoGodz6.setAdapter(dataAdapter);
		//spinDoMin6.setAdapter(dataAdapter2);
		
	  }
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kursy_szukaj_dwa);
				
		addItemsOnSpinner2();
		menu= (Button) findViewById(R.id.kursy_szukaj_dwa_menu);
		szukaj = (Button) findViewById(R.id.wyszukaj);
		spinOdGodz1 = (Spinner) findViewById(R.id.spinOdGodz1);
		spinOdMin1 = (Spinner) findViewById(R.id.spinOdMin1);
		spinDoGodz1 = (Spinner) findViewById(R.id.spinDoGodz1);
		spinDoMin1 = (Spinner) findViewById(R.id.spinDoMin1);
		spinOdGodz2 = (Spinner) findViewById(R.id.spinOdGodz2);
		spinOdMin2 = (Spinner) findViewById(R.id.spinOdMin2);
		spinDoGodz2 = (Spinner) findViewById(R.id.spinDoGodz2);
		spinDoMin2 = (Spinner) findViewById(R.id.spinDoMin2);
		spinOdGodz3 = (Spinner) findViewById(R.id.spinOdGodz3);
		spinOdMin3 = (Spinner) findViewById(R.id.spinOdMin3);
		spinDoGodz3 = (Spinner) findViewById(R.id.spinDoGodz3);
		spinDoMin3 = (Spinner) findViewById(R.id.spinDoMin3);
		spinOdGodz4 = (Spinner) findViewById(R.id.spinOdGodz4);
		spinOdMin4 = (Spinner) findViewById(R.id.spinOdMin4);
		spinDoGodz4 = (Spinner) findViewById(R.id.spinDoGodz4);
		spinDoMin4 = (Spinner) findViewById(R.id.spinDoMin4);
		spinOdGodz5 = (Spinner) findViewById(R.id.spinOdGodz5);
		spinOdMin5 = (Spinner) findViewById(R.id.spinOdMin5);
		spinDoGodz5 = (Spinner) findViewById(R.id.spinDoGodz5);
		spinDoMin5 = (Spinner) findViewById(R.id.spinDoMin5);
	
		poniedzialek = (CheckBox) findViewById(R.id.kursy_szukaj_dwa_poniedzialek);
		wtorek = (CheckBox) findViewById(R.id.kursy_szukaj_dwa_wtorek);
		sroda = (CheckBox) findViewById(R.id.kursy_szukaj_dwa_sroda);
		czwartek = (CheckBox) findViewById(R.id.kursy_szukaj_dwa_czwartek);
		piatek = (CheckBox) findViewById(R.id.kursy_szukaj_dwa_piatek);
	
		
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				
				if(R.id.kursy_szukaj_dwa_menu==v.getId()){
					
					Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
		
				}
				
				if(R.id.wyszukaj==v.getId()){
					
					String sPnOdGodz, sPnOdMin, sPnDoGodz, sPnDoMin, sWtOdGodz, sWtOdMin, sWtDoGodz, sWtDoMin,
					sSrOdGodz, sSrOdMin, sSrDoGodz, sSrDoMin, sCzwOdGodz, sCzwOdMin, sCzwDoGodz, sCzwDoMin, sPtOdGodz, sPtOdMin, 
					sPtDoGodz, sPtDoMin, sSobOdGodz, sSobOdMin, sSobDoGodz, sSobDoMin, sNiedOdGodz, sNiedOdMin, sNiedDoGodz, sNiedDoMin;
					
					
					sPnOdGodz = spinOdGodz1.getSelectedItem().toString();
					sPnOdMin = spinOdMin1.getSelectedItem().toString();
					sPnDoGodz = spinDoGodz1.getSelectedItem().toString();
					sPnDoMin = spinDoMin1.getSelectedItem().toString(); 
					sWtOdGodz = spinOdGodz2.getSelectedItem().toString(); 
					sWtOdMin = spinOdMin2.getSelectedItem().toString(); 
					sWtDoGodz = spinDoGodz2.getSelectedItem().toString(); 
					sWtDoMin = spinDoMin2.getSelectedItem().toString();
					sSrOdGodz = spinOdGodz3.getSelectedItem().toString(); 
					sSrOdMin = spinOdMin3.getSelectedItem().toString(); 
					sSrDoGodz = spinDoGodz3.getSelectedItem().toString(); 
					sSrDoMin = spinDoMin3.getSelectedItem().toString(); 
					sCzwOdGodz = spinOdGodz4.getSelectedItem().toString(); 
					sCzwOdMin = spinOdMin4.getSelectedItem().toString(); 
					sCzwDoGodz = spinDoGodz4.getSelectedItem().toString(); 
					sCzwDoMin = spinDoGodz4.getSelectedItem().toString(); 
					sPtOdGodz = spinOdGodz5.getSelectedItem().toString(); 
					sPtOdMin = spinOdMin5.getSelectedItem().toString(); 
					sPtDoGodz = spinDoGodz5.getSelectedItem().toString(); 
					sPtDoMin = spinDoMin5.getSelectedItem().toString(); 

					dane = new KursyDaneSzukane();
					if(poniedzialek.isChecked())
						dane.setPoniedzialek(true);
					if(wtorek.isChecked())
						dane.setWtorek(true);
					if(sroda.isChecked())
						dane.setSroda(true);
					if(czwartek.isChecked())
						dane.setCzwartek(true);
					if(piatek.isChecked())
						dane.setPiatek(true);

					dane.setPnOdGodz(sPnOdGodz);
					dane.setPnOdMin(sPnOdMin);
					dane.setPnDoGodz(sPnDoGodz);
					dane.setPnDoMin(sPnDoMin);
					
					dane.setWtOdGodz(sWtOdGodz);
					dane.setWtOdMin(sWtOdMin);
					dane.setWtDoGodz(sWtDoGodz);
					dane.setWtDoMin(sWtDoMin);
					
					dane.setSrOdGodz(sSrOdGodz);
					dane.setSrOdMin(sSrOdMin);
					dane.setSrDoGodz(sSrDoGodz);
					dane.setSrDoMin(sSrDoMin);
					
					dane.setCzwOdGodz(sCzwOdGodz);
					dane.setCzwOdMin(sCzwOdMin);
					dane.setCzwDoGodz(sCzwDoGodz);
					dane.setCzwDoMin(sCzwDoMin);
					
					dane.setPtOdGodz(sPtOdGodz);
					dane.setPtOdMin(sPtOdMin);
					dane.setPtDoGodz(sPtDoGodz);
					dane.setPtDoMin(sPtDoMin);
					
					
					new KursyXMLPomoc(getBaseContext()).execute();
					
				}
	
		

	}
	 };
	 menu.setOnClickListener(oclBtnOk);	 
	 szukaj.setOnClickListener(oclBtnOk);
	 spinOdGodz1.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdMin1.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoGodz1.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoMin1.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdGodz2.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdMin2.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoGodz2.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoMin2.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdGodz3.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdMin3.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoGodz3.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoMin3.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdGodz4.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdMin4.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoGodz4.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoMin4.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdGodz5.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinOdMin5.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoGodz5.setOnItemSelectedListener(new SpinnerItemSelected());
	 spinDoMin5.setOnItemSelectedListener(new SpinnerItemSelected());

	}
	
}
