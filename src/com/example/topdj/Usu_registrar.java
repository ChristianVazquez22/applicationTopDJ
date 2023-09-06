package com.example.topdj;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;

public class Usu_registrar extends Activity {

	//creacion de la bd
		private BaseDatos bd;
		//abre la bd para usarla
		private SQLiteDatabase bdPadre;
		private Activity padre;
		private EditText etClave, etNombre, etPaterno, etMaterno;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_usu_registrar);
			padre=this;
			bd=new BaseDatos(this,"BDUsuarios",null,1);
			bdPadre= bd.getWritableDatabase();

			etClave=(EditText)findViewById(R.id.etClave);
			etClave.setOnKeyListener(new OnKeyListener(){

				@Override
				public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
					// TODO Auto-generated method stub
					if(arg1==KeyEvent.KEYCODE_ENTER){
						String clave=etClave.getText().toString();
						Cursor fila=bdPadre.rawQuery("select * from usuarios where clave="+clave,null);
						if(fila.moveToFirst()){
							Toast.makeText(padre, "Usuario registrado", Toast.LENGTH_SHORT).show();
							etClave.requestFocus();
						}else{
							etNombre.requestFocus();
						}
					}
					return false;
				}});
			etNombre=(EditText)findViewById(R.id.etNombre);
			etPaterno=(EditText)findViewById(R.id.etPaterno);
			etMaterno=(EditText)findViewById(R.id.etMaterno);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.usu_registrar, menu);
			return true;
		}
		public void GuardarUsuario(View v){
			//contendra el registro
			ContentValues registro=new ContentValues();
			//escribir datos al registro
			registro.put("clave", etClave.getText().toString());
			registro.put("nombre", etNombre.getText().toString());
			registro.put("paterno", etPaterno.getText().toString());
			registro.put("materno", etMaterno.getText().toString());
			//guardar los datos a la tabla
			bdPadre.insert("usuarios",null,registro);
			//cierra la bd
			bdPadre.close();
			//mensaje de exito
			Toast.makeText(this, "usuario registrado con éxito", Toast.LENGTH_SHORT).show();
		}

	}

