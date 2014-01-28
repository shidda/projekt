package com.example.psp;

import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.content.*;
import android.os.AsyncTask;

public class KursyXMLPomoc extends AsyncTask<Void, Void, Void>{
	
	Context context;
	
	public KursyXMLPomoc(Context context) {
		this.context=context;
		
	}
    
	@Override
    protected Void doInBackground(Void... params) {
		try {
				
				SAXParserFactory saxPF = SAXParserFactory.newInstance();
				SAXParser saxP = saxPF.newSAXParser();
				XMLReader xmlR = saxP.getXMLReader();

				URL url = new URL("http://www.akz.pwr.wroc.pl/katalog_zap.xml"); 

				KursyXMLObsluga myXMLHandler = new KursyXMLObsluga();
				xmlR.setContentHandler(myXMLHandler);
				xmlR.parse(new InputSource(url.openStream()));

		} catch (Exception e) {}
		return (null);
	}
    
    @Override
    protected void onPostExecute(Void result) {
    	Intent i = new Intent(context, KursyWyswielDaneActivity.class);
    	
    	i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    	context.startActivity(i);
    }
}