package com.example.psp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;

public class Plan extends Activity {
	
	Button przegladaj, aktualnosci, plan, mapa, edycja;
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plan);
		
		przegladaj = (Button) findViewById(R.id.przegladaj);
		aktualnosci = (Button) findViewById(R.id.aktualnosci);
		plan = (Button) findViewById(R.id.plan);
		mapa = (Button) findViewById(R.id.mapa);
		edycja = (Button) findViewById(R.id.edycja);
		
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
				if(R.id.edycja==v.getId()){
					Intent intent = new Intent(getBaseContext(), EdycjaPlanu.class);
					startActivity(intent);
				}
	
		

	}
	 };
	 przegladaj.setOnClickListener(oclBtnOk);
	 aktualnosci.setOnClickListener(oclBtnOk);
	 plan.setOnClickListener(oclBtnOk);
	 mapa.setOnClickListener(oclBtnOk);
	 edycja.setOnClickListener(oclBtnOk);
	}
	
}
