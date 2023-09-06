package com.example.topdj;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Hardwell extends Activity {
	
	private MediaPlayer mp;
	private TextView textVista;
	private int posicion=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hardwell);
		textVista=(TextView)findViewById(R.id.textVista2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hardwell, menu);
		return true;
	}
	
	public void iniciar(View v){
		textVista.setText("Play.-Hardwell-Spaceman");
		if(posicion==0){
			mp=MediaPlayer.create(this,R.raw.spaceman);
			mp.start();	
		}
		else{
			mp.start();
		}
		} 
	public void detener(View v){
		if (mp!=null) {
			textVista.setText("Stop");
			mp.stop();
			posicion=0;
		}
	}
		public void pausar(View v){
			if ((mp!=null)&&(mp.isPlaying())) {
				textVista.setText("Pause");
				posicion=mp.getCurrentPosition();
				mp.pause();
			}
		}
		public void facebook(View v){
			Intent intento=new Intent(this,WebFaceHardwell.class);
    		startActivity(intento);
		}
		public void youtube(View v){
			Intent intento=new Intent(this,WebYouHardwell.class);
    		startActivity(intento);
		}
		public void videos(View v){
			Intent intento=new Intent(this,WebVidHarwell.class);
    		startActivity(intento);
		}
		public void bio(View v){
			Intent intento=new Intent(this,WebBioHardwell.class);
    		startActivity(intento);
		}
}
