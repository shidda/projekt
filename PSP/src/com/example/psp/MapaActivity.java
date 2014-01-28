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
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;

public class MapaActivity extends Activity {
	
	Button menu, miedzyBudynkami, budynek;
	
	
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mapa);
		
		menu = (Button) findViewById(R.id.mapa_menu);
		miedzyBudynkami = (Button) findViewById(R.id.miedzyBudynkami);
		budynek = (Button) findViewById(R.id.budynek);
			
		
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
				
				
				if(R.id.mapa_menu==v.getId()){
					Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
		
				}
				
				if(R.id.miedzyBudynkami==v.getId()){
					Intent intent = new Intent(getBaseContext(), MapaDrogaMiedzyBudynkamiActivity.class);
					startActivity(intent);
				}
				
				
				if(R.id.budynek==v.getId()){
					Intent intent = new Intent(getBaseContext(), MapaPolozenieBudynkuActivity.class);
					startActivity(intent);
				}
	
		

	}
	 };
	
	 menu.setOnClickListener(oclBtnOk);
	 miedzyBudynkami.setOnClickListener(oclBtnOk);
	 budynek.setOnClickListener(oclBtnOk);
	}
	
}
