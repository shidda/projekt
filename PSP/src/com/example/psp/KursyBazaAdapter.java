
package com.example.psp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class KursyBazaAdapter extends BaseAdapter {
	private static ArrayList<KursyDaneWyswietlane> searchArrayList;
	 
	private LayoutInflater mInflater;

	public KursyBazaAdapter(Context context, ArrayList<KursyDaneWyswietlane> results) {
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
			convertView = mInflater.inflate(R.layout.kursy_list_view_wiersz, null);
			holder = new ViewHolder();
			holder.txtKodKursu = (TextView) convertView.findViewById(R.id.kursy_kodKursu);
			holder.txtKodGrupy = (TextView) convertView.findViewById(R.id.kursy_kodGrupy);
			holder.txtNazwa = (TextView) convertView.findViewById(R.id.kursy_nazwa);
			holder.txtTermin = (TextView) convertView.findViewById(R.id.kursy_termin);
			holder.txtProwadzacy = (TextView) convertView.findViewById(R.id.kursy_prowadzacy);
			holder.txtLiczbaMiejsc = (TextView) convertView.findViewById(R.id.kursy_wolneMiejsca);
			holder.txtZZU = (TextView) convertView.findViewById(R.id.kursy_ZZU);
			holder.txtUwagi = (TextView) convertView.findViewById(R.id.kursy_uwagi);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
	  
		holder.txtKodKursu.setText(searchArrayList.get(position).getKodKursu());
		holder.txtKodGrupy.setText(searchArrayList.get(position).getKodGrupy());
		holder.txtNazwa.setText(searchArrayList.get(position).getNazwa());
		holder.txtTermin.setText(searchArrayList.get(position).getTermin());
		holder.txtProwadzacy.setText(searchArrayList.get(position).getProwadzacy());
		holder.txtLiczbaMiejsc.setText(searchArrayList.get(position).getLiczbaMiejsc());
		holder.txtZZU.setText(searchArrayList.get(position).getZZU());
		holder.txtUwagi.setText(searchArrayList.get(position).getUwagi());

		return convertView;
	}

	static class ViewHolder {
	  TextView txtKodKursu;
	  TextView txtKodGrupy;
	  TextView txtNazwa;
	  TextView txtTermin;
	  TextView txtProwadzacy;
	  TextView txtLiczbaMiejsc;
	  TextView txtZZU;
	  TextView txtUwagi;
	}
}

