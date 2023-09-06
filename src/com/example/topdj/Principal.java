package com.example.topdj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends Activity {
	
	private Spinner spinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		spinner=(Spinner)findViewById(R.id.spinner);
		String []opciones={"Seleccionar...","Hardwell","Avicii","David Guetta","Dj Tiesto","Armin van Buuren","Skrillex","Swedish House Mafia","Nicky Romero","Calvin Harris","Afrojack"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(adapter);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
	
	public void buscar(View view){
		
		String opcion=spinner.getSelectedItem().toString();
    	if(opcion.equalsIgnoreCase("Hardwell")){
    			Intent intento=new Intent(this,Hardwell.class);
    			startActivity(intento);					
    	}
    	if(opcion.equalsIgnoreCase("Avicii")){
    			Intent intento=new Intent(this,Avicii.class);
    			startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("David Guetta")){
    			Intent intento=new Intent(this,DavidGuetta.class);
    			startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("Dj Tiesto")){
    			Intent intento=new Intent(this,DjTiesto.class);
    			startActivity(intento);
    	}
        if(opcion.equalsIgnoreCase("Armin van Buuren")){
        		Intent intento=new Intent(this,ArminVanBuuren.class);
        		startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("Skrillex")){
    			Intent intento=new Intent(this,Skrillex.class);
    			startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("Swedish House Mafia")){
    			Intent intento=new Intent(this,SwedishHouseMafia.class);
    			startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("Nicky Romero")){
    			Intent intento=new Intent(this,NickyRomero.class);
    			startActivity(intento);
    	}
        if(opcion.equalsIgnoreCase("Calvin Harris")){
        		Intent intento=new Intent(this,CalvinHarris.class);
        		startActivity(intento);
    	}
    	if(opcion.equalsIgnoreCase("Afrojack")){
    			Intent intento=new Intent(this,Afrojack.class);
    			startActivity(intento);
    	}
	}
}
