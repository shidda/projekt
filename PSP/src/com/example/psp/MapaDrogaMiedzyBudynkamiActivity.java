package com.example.psp;

import java.util.ArrayList;

import java.util.List;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;



public class MapaDrogaMiedzyBudynkamiActivity extends Activity {
	
	private static final String TAG = PSPActivity.class.getSimpleName();
	Button menu, szukaj;
	Spinner skad, dokad;
	public static KursyDaneSzukane dane = null;
	public static KursyDaneSzukane getDane() {
		return dane;
	}
	public static void setDane(KursyDaneSzukane dane) {
		MapaDrogaMiedzyBudynkamiActivity.dane = dane;
	}
	
	public void addItemsOnSpinner() {
		 Log.i("TEST","tu dziala1");
		skad = (Spinner) findViewById(R.id.miejsce);
		Log.i("TEST","tu dziala2");
		dokad = (Spinner) findViewById(R.id.dokad);
		Log.i("TEST","tu dziala3");
		List<String> lista = new ArrayList<String>();
		Log.i("TEST","tu dziala4");
		lista.add("(A-1) Wybrze¿e Wyspiañskiego 27");
		lista.add("(A-2) ul. £ukasiewicza 2");
		lista.add("(A-3) ul. Smoluchowskiego 23");
		lista.add("(A-4) ul. Smoluchowskiego 21");
		lista.add("(A-5) ul. Smoluchowskiego 19");
		lista.add("(A-6) ul. Norwida 1/3");
		lista.add("(A-7) ul. Norwida 1/3");
		lista.add("(A-8) ul. Norwida 1/3");
		lista.add("(A-9) ul. Norwida 1/3");
		lista.add("(A-10) ul. Norwida 7");
		lista.add("(A-11) ul. Norwida 1/3");
		lista.add("(B-1) ul. Smoluchowskiego 25");
		lista.add("(B-3) ul. Smoluchowskiego 25");
		lista.add("(B-4) ul. £ukasiewicza 5");
		lista.add("(B-5) ul. £ukasiewicza 7/9");
		lista.add("(B-6) ul. £ukasiewicza 7/9");
		lista.add("(B-7) ul. £ukasiewicza 7/9");
		lista.add("(B-8) ul. Smoluchowskiego 48");
		lista.add("(B-9) ul. £ukasiewicza 7/9");
		lista.add("(B-10) ul. Smoluchowskiego 29");
		lista.add("(B-11) ul. Smoluchowskiego 48a");
		lista.add("(C-1) ul. Janiszewskiego 11/17");
		lista.add("(C-2) ul. Janiszewskiego 11/17");
		lista.add("(C-3) ul. Janiszewskiego 11/17");
		lista.add("(C-4) ul. Janiszewskiego 11/17");
		lista.add("(C-5) ul. Janiszewskiego 7/9");
		lista.add("(C-6) ul. Norwida 4/6");
		lista.add("(C-7) plac Grunwaldzki 11");
		lista.add("(C-8) plac Grunwaldzki 11");
		lista.add("(C-11) ul. Janiszewskiego 14a");
		lista.add("(C-13) Wybrze¿e Wyspiañskiego 23-25");
		lista.add("(C-15) ul. Janiszewskiego 11a");
		lista.add("(D-1) plac Grunwaldzki 13");
		lista.add("(D-2) plac Grunwaldzki 9");
		lista.add("(D-3) plac Grunwaldzki 9a");
		lista.add("(D-20) plac Janiszewskiego 8");
		lista.add("(E-1) ul. Prusa 53/55");
		lista.add("(E-3) ul. Chemiczna 4");
		lista.add("(E-4) ul. Prusa 53/55");
		lista.add("(F-1) ul. Gdañska 7/9");
		lista.add("(F-2) ul. Gdañska 7/9");
		lista.add("(F-3) ul. Gdañska 7/9");
		lista.add("(F-4) ul. Gdañska 7/9");
		lista.add("(F-6) ul. Gdañska 7/9");
		lista.add("(F-8) ul. Gdañska 7/9");
		lista.add("(G-4) ul. Sopocka 18");
		lista.add("(G-5) ul. Sopocka 18");
		lista.add("(G-10) ul. Gdañska 13");
		lista.add("(H-3) Wybrze¿e Wyspiañskiego 41");
		lista.add("(H-4) Wybrze¿e Wyspiañskiego 7-8");
		lista.add("(H-5) Wybrze¿e Wyspiañskiego 41");
		lista.add("(H-6) Wybrze¿e Wyspiañskiego 41");
		lista.add("(K-3) plac Teatralny 2");
		lista.add("(M-1) ul. D³uga 61");
		lista.add("(M-3) ul. D³uga 61");
		lista.add("(M-4) ul. D³uga 61");
		lista.add("(M-6) ul. D³uga 61");
		lista.add("(P-2) ul. Che³moñskiego 16");
		lista.add("(P-4) ul. Che³moñskiego 16");
		lista.add("(P-6) ul. Che³moñskiego 12");
		lista.add("(P-14) ul. Braci Gierymskich 164");
		lista.add("(P-20) ul. Che³moñskiego 12");
		lista.add("(S-5) ul. Szymanowskiego 5");
		lista.add("(T-2) ul. Grunwaldzka 59");
		lista.add("(T-3) ul. Grunwaldzka 61");
		lista.add("(T-4) ul. Górnickiego 22");
		lista.add("(T-7) ul. Marii Curie-Sk³odowskiej 89");
		lista.add("(T-9) ul. Powstañców Œl¹skich 137");
		lista.add("(T-14) ul. Pasteura 8");
		lista.add("(T-15) ul. Wittiga 6");
		lista.add("(T-16) ul. Wittiga 4");
		lista.add("(T-17) ul. Wróblewskiego 27");
		lista.add("(T-18) ul. Wróblewskiego 25");
		lista.add("(T-19) ul. Wittiga 8");
		lista.add("(U-7) ul. Kowalska 127a");
		Log.i("TEST","tu dziala5");
			
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				R.layout.spinnertext, lista);
		Log.i("TEST","tu dziala6");
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Log.i("TEST","tu dziala7");
		skad.setAdapter(dataAdapter);
		Log.i("TEST","tu dziala8");
		dokad.setAdapter(dataAdapter);
	}
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		Log.i("TEST","dziala0");
		setContentView(R.layout.activity_mapa_droga_miedzy_budynkami);
		Log.i("TEST","dziala1");
		addItemsOnSpinner();
		Log.i("TEST","dziala2");
		menu = (Button) findViewById(R.id.droga_miedzy_budynkami_menu);
		Log.i("TEST","dziala3");
		szukaj = (Button) findViewById(R.id.szukaj);
		Log.i("TEST","dziala4");
		skad = (Spinner) findViewById(R.id.miejsce);
		Log.i("TEST","dziala5");
		dokad = (Spinner) findViewById(R.id.dokad);
		
		
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				Log.i("TEST","dziala");
				if(R.id.droga_miedzy_budynkami_menu==v.getId()){
					Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
		
				}
				
				if(R.id.szukaj==v.getId()){
					String sSkad,sDokad, skadUlica, doKadUlica;
					String tab[] = null;
					
					sSkad = skad.getSelectedItem().toString();
					sDokad = dokad.getSelectedItem().toString();
					
					tab = sSkad.split(" ");
					if(tab[0].equals("(A-1)") || tab[0].equals("(A-3)") || tab[0].equals("(A-4)") || tab[0].equals("(B-1)") || 
							tab[0].equals("(B-4)") || tab[0].equals("(B-5)") || tab[0].equals("(B-10)") || 
							tab[0].equals("(B-11)") || tab[0].equals("(C-1)") || tab[0].equals("(C-3)") ||
							tab[0].equals("(C-7)") || tab[0].equals("(C-8)") || tab[0].equals("(C-11)") || 
							tab[0].equals("(D-1)")  || tab[0].equals("(D-2)")  ||tab[0].equals("(D-20)") ) {
					
						tab[0]=tab[0].replace("(","=");
						tab[0]=tab[0].replace(")",",");
						sSkad=tab[0];
					
						if(!tab[1].equals("ul."))
							skadUlica= sSkad+ "+" + tab[1] + "+" + tab[2] + ",+Politechnika+Wroc³awska,+Wroc³aw";
						else
							skadUlica= sSkad+ "+" + tab[2] + ",+Politechnika+Wroc³awska,+Wroc³aw";
					
					}
					else{
						if(tab[0].equals("(P-14)") || tab[0].equals("(T-7)") || tab[0].equals("(T-9)") )
							skadUlica= "=" + tab[2] + "+" + tab[3] + "+" + tab[4] + ",+Wroc³aw,+Polska";
						else{
							if(!tab[1].equals("ul."))
								skadUlica= "=" + tab[1] + "+" + tab[2] + "+" + tab[3] + ",+Wroc³aw,+Polska";
							else
								skadUlica= "=" + tab[2] + "+" + tab[3] + ",+Wroc³aw,+Polska";
						}
					
					}
						
					
					tab = sDokad.split(" ");
					if(tab[0].equals("(A-1)") || tab[0].equals("(A-3)") || tab[0].equals("(A-4)") || tab[0].equals("(B-1)") || 
							tab[0].equals("(B-4)") || tab[0].equals("(B-5)") || tab[0].equals("(B-10)") || 
							tab[0].equals("(B-11)") || tab[0].equals("(C-1)") || tab[0].equals("(C-3)") ||
							tab[0].equals("(C-7)") || tab[0].equals("(C-8)") || tab[0].equals("(C-11)") || 
							tab[0].equals("(D-1)")  || tab[0].equals("(D-2)")  ||tab[0].equals("(D-20)") ) {
					
						tab[0]=tab[0].replace("(","=");
						tab[0]=tab[0].replace(")",",");
						sDokad=tab[0];
					
						if(!tab[1].equals("ul."))
							doKadUlica=sDokad+ "+" + tab[1] + "+" + tab[2] + ",+Politechnika+Wroc³awska,+Wroc³aw";
						else
							doKadUlica= sDokad+ "+" + tab[2] + ",+Politechnika+Wroc³awska,+Wroc³aw";
					
					}
					else{
						if(tab[0].equals("(P-14)") || tab[0].equals("(T-7)") || tab[0].equals("(T-9)") )
							doKadUlica= "=" + tab[2] + "+" + tab[3] + "+" + tab[4] + ",+Wroc³aw,+Polska";
						else{
							if(!tab[1].equals("ul."))
								doKadUlica= "=" + tab[1] + "+" + tab[2] + "+" + tab[3] + ",+Wroc³aw,+Polska";
							else
								doKadUlica= "=" + tab[2] + "+" + tab[3] + ",+Wroc³aw,+Polska";
						}
					
					}
										
					String url="http://maps.google.com/maps?"+"saddr" + skadUlica+"&daddr" + doKadUlica;
					final Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
					
					startActivity(intent);
				         
				}
	
		

	}
	 };
	 menu.setOnClickListener(oclBtnOk);
	 szukaj.setOnClickListener(oclBtnOk);
	 skad.setOnItemSelectedListener(new SpinnerItemSelected());
	 dokad.setOnItemSelectedListener(new SpinnerItemSelected());
	}
	
}
