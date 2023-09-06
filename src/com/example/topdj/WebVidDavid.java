package com.example.topdj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WebVidDavid extends Activity {
	private Spinner spinner1;
	private WebView webView1;
	String url="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_vid_david);
		spinner1=(Spinner)findViewById(R.id.spinner1);
		String []opciones={"Seleccionar...","Play Hard","Titanium","She Wolf","Where Them Girls","I Can Only Imagine"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_face_david, menu);
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
    	}
    }

public void buscar(View view){
		
		String opcion=spinner1.getSelectedItem().toString();
		setProgressBarIndeterminateVisibility(true);
		webView1=(WebView)findViewById(R.id.webView1);
		webView1.getSettings().setJavaScriptEnabled(true);
		if(opcion.equalsIgnoreCase("Play Hard")){url="http://www.youtube.com/watch?v=5dbEhBKGOtY";}
		if(opcion.equalsIgnoreCase("Titanium")){url="http://www.youtube.com/watch?v=JRfuAukYTKg";}
		if(opcion.equalsIgnoreCase("She Wolf")){url="http://www.youtube.com/watch?v=PVzljDmoPVs";}
		if(opcion.equalsIgnoreCase("Where Them Girls")){url="http://www.youtube.com/watch?v=p4kVWCSzfK4";}
		if(opcion.equalsIgnoreCase("I Can Only Imagine")){url="http://www.youtube.com/watch?v=TSNerxNwWtU";}
		webView1.setWebViewClient(new miclienteweb());		
		webView1.loadUrl(url);
  	}
}