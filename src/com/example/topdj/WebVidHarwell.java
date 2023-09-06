package com.example.topdj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WebVidHarwell extends Activity {
	private Spinner spinner1;
	private WebView webView1;
	String url="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_vid_harwell);
		spinner1=(Spinner)findViewById(R.id.spinner1);
		String []opciones={"Seleccionar...","Apollo","Cobra","Spaceman","Jumper","How We Do"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_vid_harwell, menu);
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
		webView1=(WebView)findViewById(R.id.webV2);
		webView1.getSettings().setJavaScriptEnabled(true);
    	if(opcion.equalsIgnoreCase("Apollo")){url="http://www.youtube.com/watch?v=q8kUckZ15fE";}
    	if(opcion.equalsIgnoreCase("Cobra")){url="http://www.youtube.com/watch?v=edAZg_kyrUA";}
    	if(opcion.equalsIgnoreCase("Spaceman")){url="http://www.youtube.com/watch?v=92pR2pxSjh8";}
    	if(opcion.equalsIgnoreCase("Jumper")){url="http://www.youtube.com/watch?v=RCjvvuy-gas";}
    	if(opcion.equalsIgnoreCase("How We Do")){url="http://www.youtube.com/watch?v=NOUyfJMES5s";}
		webView1.setWebViewClient(new miclienteweb());		
		webView1.loadUrl(url);
  	}
}

