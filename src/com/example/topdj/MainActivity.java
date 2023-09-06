package com.example.topdj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void informacion(View v){
		Intent intento=new Intent(this,Info.class);
		startActivity(intento);					
	}
	
	public void entrada(View v){
		Intent intento=new Intent(this,Principal.class);
		startActivity(intento);					
	}
	public void video(View v){
		Intent intento=new Intent(this,VideoPromo.class);
		startActivity(intento);					
	}
	public void registrar(View v){
		Intent intento=new Intent(this,Usu_registrar.class);
		startActivity(intento);					
	}


}
