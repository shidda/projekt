package com.example.psp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class AktualnosciActivity extends Activity {
	
	Button menu;
	WebView mWebView;

protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aktualnosci);
		mWebView = (WebView) findViewById(R.id.webView1);
		
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new AktualnosciWidokStrony());
        mWebView.loadUrl("http://www.napwr.pl");
		
		menu = (Button) findViewById(R.id.aktualnosci_menu);
		
		OnClickListener oclBtnOk = new OnClickListener(){
			public void onClick(View v){
	
				
				if(R.id.aktualnosci_menu==v.getId()){
					Intent intent = new Intent(getBaseContext(), PSPActivity.class);
					startActivity(intent);
				}
		}
	 };
	
	 menu.setOnClickListener(oclBtnOk);
	}
	
}
