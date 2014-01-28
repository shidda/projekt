package com.example.psp;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PlanActivity extends Activity implements OnClickListener, OnItemClickListener {
        
        private ListView lv1;
        Button poniedzialek,wtorek,sroda, czwartek, piatek, sobota, niedziela, menu, edycja;
    	TextView dzien;
    	String przekazanytekst="Poniedzia³ek";
       
        private ArrayList<PlanDane> pojoArrayList;
        
    @SuppressLint("CutPasteId")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        
        Bundle przekazanedane = getIntent().getExtras();
        Log.i(PlanActivity.class.getSimpleName(), "tez dzial");
        przekazanytekst = przekazanedane.getString("dane");
        Log.i("dzien przek", przekazanytekst);
        poniedzialek = (Button) findViewById(R.id.poniedzialek);
        wtorek = (Button) findViewById(R.id.wtorek);
        sroda = (Button) findViewById(R.id.sroda);
        czwartek = (Button) findViewById(R.id.czwartek);
        piatek = (Button) findViewById(R.id.piatek);
        sobota = (Button) findViewById(R.id.sobota);
        niedziela = (Button) findViewById(R.id.niedziela);
        menu = (Button) findViewById(R.id.plan_menu);
        edycja = (Button) findViewById(R.id.edycja);
        dzien = (TextView) findViewById(R.id.dzien);
        dzien.setText(przekazanytekst);
        edycja = (Button) findViewById(R.id.edycja);
        edycja.setOnClickListener(this);
       // getBaseContext().deleteDatabase("undergraduate_gpa_db");
        pojoArrayList = new ArrayList<PlanDane>();

        lv1 = (ListView) findViewById(R.id.plan_listView);
        Log.i("dzien p", przekazanytekst);
        lv1.setAdapter(new PlanBazaAdapter(this, populateList(przekazanytekst)));

        lv1.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    
                    Toast.makeText(getApplicationContext(), "Wybrano :" + arg2, Toast.LENGTH_SHORT).show();
                    
                   
                    Intent updateDeleteUgraduateIntent = new Intent(getBaseContext(), PlanUsunUaktualnijActivity.class);
                    
                    
                    PlanDane clickedObject = pojoArrayList.get(arg2);
                    
                   
                    Bundle dataBundle = new Bundle();
                    dataBundle.putString("dzien", clickedObject.getDzien());
                    dataBundle.putString("godzOd", clickedObject.getGodzRozp());
                    Log.i("nacisniete",clickedObject.getGodzRozp());
                    dataBundle.putString("minOd", clickedObject.getMinRozp());
                    dataBundle.putString("godzDo", clickedObject.getGodzZak());
                    dataBundle.putString("minDo", clickedObject.getMinZak());
                    dataBundle.putString("sala", clickedObject.getSala());
                    
                    dataBundle.putString("budynek", clickedObject.getBudynek());
                    dataBundle.putString("prowadzacy", clickedObject.getProwadzacy());
                    dataBundle.putString("kurs", clickedObject.getKurs());
                    dataBundle.putString("typZajec", clickedObject.getTypZajec());

                    updateDeleteUgraduateIntent.putExtras(dataBundle);

                    startActivity(updateDeleteUgraduateIntent);
                    
            }
            }
        );
    OnClickListener oclBtnOk = new OnClickListener(){
		public void onClick(View v){
						
			if(R.id.poniedzialek==v.getId()){
				String przekaz;
    	        przekaz="Poniedzia³ek";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.wtorek==v.getId()){
				String przekaz;
    	        przekaz="Wtorek";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
	
			}
			if(R.id.sroda==v.getId()){
				String przekaz;
    	        przekaz="Œroda";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.czwartek==v.getId()){
				String przekaz;
    	        przekaz="Czwartek";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.piatek==v.getId()){
				String przekaz;
    	        przekaz="Pi¹tek";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.sobota==v.getId()){
				String przekaz;
    	        przekaz="Sobota";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.niedziela==v.getId()){
				String przekaz;
    	        przekaz="Niedziela";
    	        Intent intent = new Intent(getBaseContext(), PlanActivity.class);
    	        intent.putExtra("dane",przekaz);    
    	        startActivity(intent);
			}
			if(R.id.edycja==v.getId()){
				
				
				Intent intent = new Intent(getBaseContext(), PlanDodajActivity.class);
				startActivity(intent);
			}
			if(R.id.plan_menu==v.getId()){
				Intent intent = new Intent(getBaseContext(), PSPActivity.class);
				startActivity(intent);
			}
                
        }
		
    };
    poniedzialek.setOnClickListener(oclBtnOk);
	 wtorek.setOnClickListener(oclBtnOk);
	 sroda.setOnClickListener(oclBtnOk);
	 czwartek.setOnClickListener(oclBtnOk);
	 piatek.setOnClickListener(oclBtnOk);
	 sobota.setOnClickListener(oclBtnOk);
	 niedziela.setOnClickListener(oclBtnOk);
	 menu.setOnClickListener(oclBtnOk);
	 edycja.setOnClickListener(oclBtnOk);
}
        
        @SuppressWarnings("deprecation")
		public ArrayList<PlanDane> populateList(String dzienTygodnia){
        	
                Log.i("COS","udalo sie");
                PlanSQLite openHelperClass = new PlanSQLite(this);
               
                SQLiteDatabase sqliteDatabase = openHelperClass.getReadableDatabase();
                
                String cos= sqliteDatabase.getPath();
                Log.i("sciezka",cos);
                Cursor cursor = sqliteDatabase.query(PlanSQLite.TABELA_PLAN_ZAJEC, null,"dzien=?", new String[]{dzienTygodnia}, null, null, "godz_rozpoczecia ASC");
                //swapCursor(cursor);
                Log.i("dzien ost", dzienTygodnia);
                startManagingCursor(cursor);
                

                while (cursor.moveToNext()) {

                        String dzien = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_DZIEN));
                        Log.i("czy dziala", dzien);
                        String godzRozp = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_GODZ_ROZP));
                        String minRozp = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_MIN_ROZP));
                        String godzZak = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_GODZ_ZAK));
                        String minZak = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_MIN_ZAK));
                        Log.i("minuty3",minZak);
                        String sala = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_SALA));
                        String budynek = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_BUDYNEK));
                        String prowadzacy = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_PROWADZACY));
                        String kurs = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_KURS));
                        String typZajec = cursor.getString(cursor.getColumnIndex(PlanSQLite.KOLUMNA_TYP_ZAJEC));
                         PlanDane ugPojoClass = new PlanDane();
                        ugPojoClass.setDzien(dzien);
                        ugPojoClass.setGodzRozp(godzRozp);
                        if(minRozp.equals("0"))
                        	minRozp="00";
                        if(minRozp.equals("5"))
                        	minRozp="05";
                        ugPojoClass.setMinRozp(minRozp);
                        ugPojoClass.setGodzZak(godzZak);
                        if(minZak.equals("0"))
                        	minZak="00";
                        if(minZak.equals("5"))
                        	minZak="05";
                        ugPojoClass.setMinZak(minZak);
                        Log.i("minuty4",ugPojoClass.getMinZak());
                        ugPojoClass.setSala(sala);
                        ugPojoClass.setBudynek(budynek);
                        ugPojoClass.setProwadzacy(prowadzacy);
                        ugPojoClass.setKurs(kurs);
                        ugPojoClass.setTypZajec(typZajec);
                                      
                       pojoArrayList.add(ugPojoClass);


                }
                //cursor.close();
                stopManagingCursor(cursor);
                sqliteDatabase.close();

                
                return pojoArrayList;
        }

       @Override
        protected void onResume() {
                super.onResume();
                Log.i("RESEUME", "ja tu jestem");
                pojoArrayList = new ArrayList<PlanDane>();
                
                lv1.setAdapter(new PlanBazaAdapter(this, populateList(przekazanytekst)));
        }
       
        @Override
        protected void onStart() {
                super.onStart();
                pojoArrayList = new ArrayList<PlanDane>();
                lv1.setAdapter(new PlanBazaAdapter(this, populateList(przekazanytekst)));     
        }

		

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		} 
		

        // On ListView you just see the name of the undergraduate, not any other details
        // Here we provide the solution to that. When the user click on a list item, he will redirect to a page where
        //he can see all the details of the undergraduate

        
        
}