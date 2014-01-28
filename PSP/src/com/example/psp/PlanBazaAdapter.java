package com.example.psp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PlanBazaAdapter extends BaseAdapter {
	 private static ArrayList<PlanDane> searchArrayList;
	 
	 private LayoutInflater mInflater;

	 public PlanBazaAdapter(Context context, ArrayList<PlanDane> results) {
	  searchArrayList = results;
	  mInflater = LayoutInflater.from(context);
	 }

	 public int getCount() {
	  return searchArrayList.size();
	 }

	 public Object getItem(int position) {
	  return searchArrayList.get(position);
	 }

	 public long getItemId(int position) {
	  return position;
	 }

	 public View getView(int position, View convertView, ViewGroup parent) {
	  ViewHolder holder;
	  if (convertView == null) {
	   convertView = mInflater.inflate(R.layout.plan_list_view_wiersz, null);
	   holder = new ViewHolder();
	   holder.txtGodziny = (TextView) convertView.findViewById(R.id.godzina);
	   holder.txtMiejsce = (TextView) convertView.findViewById(R.id.miejsceZajec);
	   holder.txtProwadzacy = (TextView) convertView.findViewById(R.id.nauczyciel);
	   holder.txtKurs = (TextView) convertView.findViewById(R.id.przedmiot);
	   holder.txtTypZajec = (TextView) convertView.findViewById(R.id.typZajec);

	   convertView.setTag(holder);
	  } else {
	   holder = (ViewHolder) convertView.getTag();
	  }
	  
	  holder.txtGodziny.setText(searchArrayList.get(position).getGodzRozp() + 
			  ":" + searchArrayList.get(position).getMinRozp() + 
			  "-" + searchArrayList.get(position).getGodzZak() + 
			  ":" + searchArrayList.get(position).getMinZak());
	 
	  holder.txtMiejsce.setText(searchArrayList.get(position).getSala() + " " + searchArrayList.get(position).getBudynek());
	  holder.txtProwadzacy.setText(searchArrayList.get(position).getProwadzacy());
	  holder.txtTypZajec.setText(searchArrayList.get(position).getTypZajec());
	  holder.txtKurs.setText(searchArrayList.get(position).getKurs());

	  return convertView;
	 }

	 static class ViewHolder {
	  //TextView txtDzien;
	  TextView txtGodziny;
	  TextView txtMiejsce;
	  TextView txtProwadzacy;
	  TextView txtKurs;
	  TextView txtTypZajec;
	  
	 }
	}
