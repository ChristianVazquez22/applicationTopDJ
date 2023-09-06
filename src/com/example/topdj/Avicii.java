package com.example.topdj;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Avicii extends Activity {
	
	private MediaPlayer mp;
	private TextView textVista;
	private int posicion=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_avicii);
		textVista=(TextView)findViewById(R.id.textVista1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.avicii, menu);
		return true;
	}
	
	public void iniciar(View v){
		textVista.setText("Play.-Avicii-You Make me");
		if(posicion==0){
			mp=MediaPlayer.create(this,R.raw.youmakeme);
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
			Intent intento=new Intent(this,WebFaceAvicii.class);
    		startActivity(intento);
		}
		public void youtube(View v){
			Intent intento=new Intent(this,WebYouAvicii.class);
    		startActivity(intento);
		}
		public void videos(View v){
			Intent intento=new Intent(this,WebVidAvicii.class);
    		startActivity(intento);
		}
		public void bio(View v){
			Intent intento=new Intent(this,WebBioAvicii.class);
    		startActivity(intento);
		}
}
