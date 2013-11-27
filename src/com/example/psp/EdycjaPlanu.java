package com.example.psp;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;

public class EdycjaPlanu extends Activity {
	
	Button przegladaj, aktualnosci, plan, mapa;
	Spinner spinDni, spinOdGodz, spinOdMin, spinDoGodz,  spinDoMin;
	
	
	public void addItemsOnSpinner() {
		 
		spinDni = (Spinner) findViewById(R.id.spinDni);
		spinOdGodz = (Spinner) findViewById(R.id.spinOdGodz);
		spinOdMin = (Spinner) findViewById(R.id.spinOdMin);
		spinDoGodz = (Spinner) findViewById(R.id.spinDoGodz);
		spinDoMin = (Spinner) findViewById(R.id.spinDoMin);
		List<String> dni = new ArrayList<String>();
			dni.add("Poniedzia³ek");
			dni.add("Wtorek");
			dni.add("Œroda");
			dni.add("Czwartek");
			dni.add("Pi¹tek");
			dni.add("Sobota");
			dni.add("Niedziela");
		List<String> godziny = new ArrayList<String>();
		List<String> minuty = new ArrayList<String>();
		for(int i=7; i<23; i++)
			godziny.add(Integer.toString(i));
		minuty.add("00");
		minuty.add("05");
		for(int i=10; i<56; i=i+5)
			minuty.add(Integer.toString(i));
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				R.layout.spinnertext, dni);
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
				R.layout.spinnertext, godziny);
		ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
				R.layout.spinnertext, minuty);
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinDni.setAdapter(dataAdapter);
		spinOdGodz.setAdapter(dataAdapter2);
		spinOdMin.setAdapter(dataAdapter3);
		spinDoGodz.setAdapter(dataAdapter2);
		spinDoMin.setAdapter(dataAdapter3);
	}	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edytuj_plan);
		addItemsOnSpinner();
		przegladaj = (Button) findViewById(R.id.przegladaj);
		aktualnosci = (Button) findViewById(R.id.aktualnosci);
		plan = (Button) findViewById(R.id.plan);
		mapa = (Button) findViewById(R.id.mapa);
		spinOdGodz = (Spinner) findViewById(R.id.spinOdGodz);
		spinOdMin = (Spinner) findViewById(R.id.spinOdMin);
		spinDoGodz = (Spinner) findViewById(R.id.spinDoGodz);
		spinDoMin = (Spinner) findViewById(R.id.spinDoMin);
		spinOdGodz = (Spinner) findViewById(R.id.spinOdGodz);
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				if(R.id.przegladaj==v.getId()){
					Intent intent = new Intent(getBaseContext(), Kursy.class);
					startActivity(intent);
				}
				if(R.id.aktualnosci==v.getId()){
					Intent intent = new Intent(getBaseContext(), Aktualnosci.class);
					startActivity(intent);
		
				}
				if(R.id.plan==v.getId()){
					Intent intent = new Intent(getBaseContext(), EdycjaPlanu.class);
					startActivity(intent);
				}
				if(R.id.mapa==v.getId()){
					Intent intent = new Intent(getBaseContext(), Mapa.class);
					startActivity(intent);
				}
	
		

	}
	 };
	 przegladaj.setOnClickListener(oclBtnOk);
	 aktualnosci.setOnClickListener(oclBtnOk);
	 plan.setOnClickListener(oclBtnOk);
	 mapa.setOnClickListener(oclBtnOk);
	 spinOdGodz.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	
}
