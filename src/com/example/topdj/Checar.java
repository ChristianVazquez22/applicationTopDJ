package com.example.topdj;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Checar extends Activity {

	private EditText etConClave;
	private TextView tvRcon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		etConClave=(EditText)findViewById(R.id.etConClave);
		tvRcon=(TextView)findViewById(R.id.tvRcon1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consultar, menu);
		return true;
	}
	public void consultar(View v){
		//creacion de la bd
		BaseDatos bd=new BaseDatos(this,"BDUsuarios",null,1);
		//abre la bd para usarla
		SQLiteDatabase bdPadre= bd.getWritableDatabase();
		//guarda el query
		Cursor fila=bdPadre.rawQuery("select * from usuarios where clave="+etConClave.getText().toString(),null);
		//comprueba los datos
		if(fila.moveToFirst()==true){
			String datos="los datos del usuario son: \n";
			datos+=" clave "+fila.getString(0);
			datos+=" \nNombre "+fila.getString(1);
			datos+=" \nA Paterno "+fila.getString(2);
			datos+=" \nA Materno "+fila.getString(3);
			tvRcon.setText(datos);
		}else{
			Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show();
		}
		bdPadre.close();
	}

}