package com.example.psp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class PlanSQLite extends SQLiteOpenHelper {
        
        public static final String DB_NAME = "undergraduate_gpa_db";
        public static final int DB_VERSION = 1;
        
       
        public static final String TABELA_PLAN_ZAJEC = "plan";
        public static final String KOLUMNA_DZIEN = "dzien";
        public static final String KOLUMNA_GODZ_ROZP = "godz_rozpoczecia";
        public static final String KOLUMNA_MIN_ROZP = "min_rozpoczecia";
        public static final String KOLUMNA_GODZ_ZAK = "godz_zakonczenia";
        public static final String KOLUMNA_MIN_ZAK = "min_zakonczenia";
        public static final String KOLUMNA_SALA = "sala";
        public static final String KOLUMNA_BUDYNEK = "budynek";
        public static final String KOLUMNA_PROWADZACY = "prowadzacy";
        public static final String KOLUMNA_KURS = "kurs";
        public static final String KOLUMNA_TYP_ZAJEC = "typ_zajec";

        public PlanSQLite(Context context) {
                super(context, DB_NAME, null, DB_VERSION);

        }

        
        @Override
        public void onCreate(SQLiteDatabase db) {
        	
        	String sqlTabela = "create table if not exists " + TABELA_PLAN_ZAJEC 
        						+ " ( " + BaseColumns._ID + " integer primary key autoincrement, "
        																							+ KOLUMNA_DZIEN + " text not null, "
                                                                                                    + KOLUMNA_GODZ_ROZP + " integer not null, "
                                                                                                    + KOLUMNA_MIN_ROZP + " integer not null, "
                                                                                                    + KOLUMNA_GODZ_ZAK + " integer not null, "
                                                                                                    + KOLUMNA_MIN_ZAK + " integer not null, "
                                                                                                    + KOLUMNA_SALA + " text not null, "
                                                                                                    + KOLUMNA_BUDYNEK + " text not null, "
                                                                                                    + KOLUMNA_PROWADZACY + " text not null, "
                                                                                                    + KOLUMNA_KURS + " text not null, "
                                                                                                    + KOLUMNA_TYP_ZAJEC + " text not null);";
        	db.execSQL(sqlTabela);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                if(oldVersion == 1 && newVersion == 2){

                }                
        }
}