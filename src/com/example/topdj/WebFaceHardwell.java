package com.example.topdj;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebFaceHardwell extends Activity {
	private WebView web;
	private ProgressDialog dialogo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_face_hardwell);
		String url="https://www.facebook.com/djhardwell?fref=ts";
		web=(WebView)findViewById(R.id.web);
		
			setProgressBarIndeterminateVisibility(true);
			dialogo = ProgressDialog.show(WebFaceHardwell.this, "Cargando la pagina", "Espere unos instantes mientras se carga la pagina");
			web.getSettings().setJavaScriptEnabled(true);
			web.setWebViewClient(new miclienteweb());		
			web.loadUrl(url);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web, menu);
		return true;
	}
	
private class miclienteweb extends WebViewClient {
    	
    	public boolean shouldOverrideUrlLoading(WebView view, String url){
    		view.loadUrl(url);
    		return true;
    	}
    	public void onPageFinished(WebView view, String url){
    		super.onPageFinished(view, url);
    		setProgressBarIndeterminateVisibility(false);
    		dialogo.dismiss();
    	}
    }

}
