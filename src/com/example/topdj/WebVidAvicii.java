package com.example.topdj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WebVidAvicii extends Activity {
	private Spinner spinner1;
	private WebView webView1;
	String url="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_vid_avicii);
		spinner1=(Spinner)findViewById(R.id.spinner1);
		String []opciones={"Seleccionar...","You Make Me","Silhouettes","Levels","X You","Wake Me Up"};
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
		webView1=(WebView)findViewById(R.id.webView1);
		webView1.getSettings().setJavaScriptEnabled(true);
		if(opcion.equalsIgnoreCase("You Make Me")){url="http://www.youtube.com/watch?v=Wb5VOQexMBU";}
		if(opcion.equalsIgnoreCase("Silhouettes")){url="http://www.youtube.com/watch?v=6VJBBUqr1wM";}
		if(opcion.equalsIgnoreCase("Levels")){url="http://www.youtube.com/watch?v=_ovdm2yX4MA";}
		if(opcion.equalsIgnoreCase("X You")){url="http://www.youtube.com/watch?v=LpKyzSxVhk4";}
		if(opcion.equalsIgnoreCase("Wake Me Up")){url="http://www.youtube.com/watch?v=IcrbM1l_BoI";}
		webView1.setWebViewClient(new miclienteweb());		
		webView1.loadUrl(url);
  	}
}