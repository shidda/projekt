package com.example.psp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PlanDodajActivity extends Activity  {
        
	Button menu, dodaj, anuluj;
	Spinner spinDni, spinOdGodz, spinOdMin, spinDoGodz,  spinDoMin;
	EditText sala, budynek, prowadzacy, kurs, typZajec;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_dodaj);
        ustawDane();
               
        OnClickListener oclBtnOk = new OnClickListener(){
        	public void onClick(View v) {
        		
        		if(v.getId() == R.id.plan_dodaj_menu){
        			Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
        		}
        		
                if(v.getId() == R.id.plan_dodaj_anuluj)
                        finish();
                
                if(v.getId() == R.id.plan_dodaj_dodaj){
                	dodajZajecie(pobierzDane());
                    przekaz();
                }
                
               
        	}
        };
        anuluj.setOnClickListener(oclBtnOk);
        menu.setOnClickListener(oclBtnOk);
        dodaj.setOnClickListener(oclBtnOk);
        spinOdGodz.setOnItemSelectedListener(new SpinnerItemSelected());
        spinOdMin.setOnItemSelectedListener(new SpinnerItemSelected());
        spinDoGodz.setOnItemSelectedListener(new SpinnerItemSelected());
        spinDoMin.setOnItemSelectedListener(new SpinnerItemSelected());  
    }
	
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
    
	public void dodajZajecie(PlanDane searchResultsObj){
		//getBaseContext().deleteDatabase("undergraduate_gpa_db");
        PlanSQLite androidOpenDbHelperObj = new PlanSQLite(this);
        
        SQLiteDatabase sqliteDatabase = androidOpenDbHelperObj.getWritableDatabase();
        sqliteDatabase.insert(PlanSQLite.TABELA_PLAN_ZAJEC, null, zawartosc(searchResultsObj));
        sqliteDatabase.close();
        Toast.makeText(this, "Element zosta³ dodany", Toast.LENGTH_SHORT).show();
	}
        
        
        PlanDane pobierzDane(){
        	
        	String sDzien, sGodzRozp,sMinRozp, sGodzZak, sMinZak, sSala, sBudynek, sProwadzacy, sKurs, sTypZajec;
			
        	sDzien = spinDni.getSelectedItem().toString();
        	sGodzRozp = spinOdGodz.getSelectedItem().toString();
			sMinRozp = spinOdMin.getSelectedItem().toString();
			sGodzZak = spinDoGodz.getSelectedItem().toString();
			sMinZak = spinDoMin.getSelectedItem().toString();
			Log.i("minuty1",sMinZak);
			sSala = sala.getText().toString();
			sBudynek = budynek.getText().toString();
			sProwadzacy = prowadzacy.getText().toString();
			sKurs = kurs.getText().toString();
			sTypZajec = typZajec.getText().toString();
        	
            
            PlanDane searchResultsObj = new PlanDane();
            searchResultsObj.setDzien(sDzien);
            searchResultsObj.setGodzRozp(sGodzRozp);
            searchResultsObj.setMinRozp(sMinRozp);
            searchResultsObj.setGodzZak(sGodzZak);
            searchResultsObj.setMinZak(sMinZak);
            searchResultsObj.setSala(sSala);
            searchResultsObj.setBudynek(sBudynek);
            searchResultsObj.setProwadzacy(sProwadzacy);
            searchResultsObj.setKurs(sKurs);
            searchResultsObj.setTypZajec(sTypZajec);
			return searchResultsObj;
        	
        }
        
        void przekaz(){
	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
	        intent.putExtra("dane","Poniedzia³ek");    
	        startActivity(intent);
        }
		void ustawDane(){
        	 addItemsOnSpinner();
     		menu = (Button) findViewById(R.id.plan_dodaj_menu);
     		dodaj = (Button) findViewById(R.id.plan_dodaj_dodaj);
     		anuluj = (Button) findViewById(R.id.plan_dodaj_anuluj);
     		spinDni = (Spinner) findViewById(R.id.spinDni);
     		spinOdGodz = (Spinner) findViewById(R.id.spinOdGodz);
     		spinOdMin = (Spinner) findViewById(R.id.spinOdMin);
     		spinDoGodz = (Spinner) findViewById(R.id.spinDoGodz);
     		spinDoMin = (Spinner) findViewById(R.id.spinDoMin);
     		spinOdGodz = (Spinner) findViewById(R.id.spinOdGodz);
     		sala = (EditText) findViewById(R.id.sala);
     		budynek = (EditText) findViewById(R.id.etbudynek);
     		prowadzacy = (EditText) findViewById(R.id.prowadzacy);
     		kurs = (EditText) findViewById(R.id.kurs);
     		typZajec = (EditText) findViewById(R.id.etTypZajec);
     		     		
     		
        }
        ContentValues zawartosc(PlanDane searchResultsObj){
        	
        	ContentValues contentValues = new ContentValues();
        	contentValues.put(PlanSQLite.KOLUMNA_DZIEN, searchResultsObj.getDzien());
            contentValues.put(PlanSQLite.KOLUMNA_GODZ_ROZP, Integer.parseInt(searchResultsObj.getGodzRozp()));
            contentValues.put(PlanSQLite.KOLUMNA_MIN_ROZP, Integer.parseInt(searchResultsObj.getMinRozp()));
            contentValues.put(PlanSQLite.KOLUMNA_GODZ_ZAK, Integer.parseInt(searchResultsObj.getGodzZak()));
            contentValues.put(PlanSQLite.KOLUMNA_MIN_ZAK, Integer.parseInt(searchResultsObj.getMinZak()));
            contentValues.put(PlanSQLite.KOLUMNA_SALA, searchResultsObj.getSala());
            contentValues.put(PlanSQLite.KOLUMNA_BUDYNEK, searchResultsObj.getBudynek());
            contentValues.put(PlanSQLite.KOLUMNA_PROWADZACY, searchResultsObj.getProwadzacy());
            contentValues.put(PlanSQLite.KOLUMNA_KURS, searchResultsObj.getKurs());
            contentValues.put(PlanSQLite.KOLUMNA_TYP_ZAJEC, searchResultsObj.getTypZajec());
			return contentValues;
		}
        
        
}
