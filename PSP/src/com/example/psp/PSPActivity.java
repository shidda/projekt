package com.example.psp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
import android.view.View.OnClickListener;

public class PSPActivity extends Activity {
	private static final String TAG = PSPActivity.class.getSimpleName();
	//Log.d(TAG, "TEST");
	EditText tekst;
	Button przegladaj, aktualnosci, plan, mapa;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_psp);
		
		przegladaj = (Button) findViewById(R.id.przegladaj);
		aktualnosci = (Button) findViewById(R.id.aktualnosci);
		plan = (Button) findViewById(R.id.plan);
		mapa = (Button) findViewById(R.id.mapa);
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				if(R.id.przegladaj==v.getId()){
					Intent intent = new Intent(getBaseContext(), KursySzukajActivity1.class);
					startActivity(intent);
					
					
				}
				if(R.id.aktualnosci==v.getId()){
					Intent intent = new Intent(getBaseContext(), AktualnosciActivity.class);
					startActivity(intent);
		
				}
				if(R.id.plan==v.getId()){
					String przekaz;
	    	        przekaz="Poniedzia³ek";
	    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
	    	        intent.putExtra("dane",przekaz);    
	    	        startActivity(intent);
				}
				if(R.id.mapa==v.getId()){
					Intent intent = new Intent(getBaseContext(), MapaActivity.class);
					startActivity(intent);
				}
			}
		};
		przegladaj.setOnClickListener(oclBtnOk);
		aktualnosci.setOnClickListener(oclBtnOk);
		plan.setOnClickListener(oclBtnOk);
		mapa.setOnClickListener(oclBtnOk);
	}
}
