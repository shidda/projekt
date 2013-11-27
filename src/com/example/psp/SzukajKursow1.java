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
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;

public class SzukajKursow1 extends Activity {
	
	Button przegladaj, aktualnosci, plan, mapa, nastepne;
	Spinner oddzial;
	
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
		setContentView(R.layout.activity_szukaj_kursow_one);
		
		addItemsOnSpinner();

		przegladaj = (Button) findViewById(R.id.przegladaj);
		aktualnosci = (Button) findViewById(R.id.aktualnosci);
		plan = (Button) findViewById(R.id.plan);
		mapa = (Button) findViewById(R.id.mapa);
		nastepne = (Button) findViewById(R.id.nastepne);
		oddzial = (Spinner) findViewById(R.id.oddzial);
		
		
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
					Intent intent = new Intent(getBaseContext(), Plan.class);
					startActivity(intent);
				}
				if(R.id.mapa==v.getId()){
					Intent intent = new Intent(getBaseContext(), Mapa.class);
					startActivity(intent);
				}
				if(R.id.nastepne==v.getId()){
					Intent intent = new Intent(getBaseContext(), SzukajKursow2.class);
					startActivity(intent);
				}
	
		

	}
	 };
	 przegladaj.setOnClickListener(oclBtnOk);
	 aktualnosci.setOnClickListener(oclBtnOk);
	 plan.setOnClickListener(oclBtnOk);
	 mapa.setOnClickListener(oclBtnOk);
	 nastepne.setOnClickListener(oclBtnOk);
	 oddzial.setOnItemSelectedListener(new CustomOnItemSelectedListener());

	}
	
}
