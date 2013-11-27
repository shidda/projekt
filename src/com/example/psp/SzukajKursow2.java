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

public class SzukajKursow2 extends Activity {
	
	Button przegladaj, aktualnosci, plan, mapa;
	Spinner spinOdGodz1, spinOdMin1, spinDoGodz1, spinDoMin1, 
			spinOdGodz2, spinOdMin2, spinDoGodz2, spinDoMin2, 
			spinOdGodz3, spinOdMin3, spinDoGodz3, spinDoMin3, 
			spinOdGodz4, spinOdMin4, spinDoGodz4, spinDoMin4,
			spinOdGodz5, spinOdMin5, spinDoGodz5, spinDoMin5,
			spinOdGodz6, spinOdMin6, spinDoGodz6, spinDoMin6 
			;
	
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
		spinOdGodz6 = (Spinner) findViewById(R.id.spinOdGodz6);
		spinOdMin6 = (Spinner) findViewById(R.id.spinOdMin6);
		spinDoGodz6 = (Spinner) findViewById(R.id.spinDoGodz6);
		spinDoMin6 = (Spinner) findViewById(R.id.spinDoMin6);
		
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
		spinOdGodz6.setAdapter(dataAdapter);
		spinOdMin6.setAdapter(dataAdapter2);
		spinDoGodz6.setAdapter(dataAdapter);
		spinDoMin6.setAdapter(dataAdapter2);
		
	  }
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_szukaj_kursow_two);
		
		addItemsOnSpinner2();
		przegladaj = (Button) findViewById(R.id.przegladaj);
		aktualnosci = (Button) findViewById(R.id.aktualnosci);
		plan = (Button) findViewById(R.id.plan);
		mapa = (Button) findViewById(R.id.mapa);
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
		spinOdGodz6 = (Spinner) findViewById(R.id.spinOdGodz6);
		spinOdMin6 = (Spinner) findViewById(R.id.spinOdMin6);
		spinDoGodz6 = (Spinner) findViewById(R.id.spinDoGodz6);
		spinDoMin6 = (Spinner) findViewById(R.id.spinDoMin6);
		
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
	
		

	}
	 };
	 przegladaj.setOnClickListener(oclBtnOk);
	 aktualnosci.setOnClickListener(oclBtnOk);
	 plan.setOnClickListener(oclBtnOk);
	 mapa.setOnClickListener(oclBtnOk);
	 spinOdGodz1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdGodz2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdGodz3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin3.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdGodz4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin4.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdGodz5.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin5.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz5.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin5.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdGodz6.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinOdMin6.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoGodz6.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	 spinDoMin6.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	
}
