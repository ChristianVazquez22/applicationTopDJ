package com.example.topdj;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper{

	public BaseDatos(Context contexto, String nombre, CursorFactory factory, int version) {
		super(contexto, nombre, factory, version);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table usuarios(clave integer primary key, nombre text, paterno text, materno text)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		db.execSQL("drop table if exists usuarios");
		db.execSQL("create table usuarios(clave integer primary key, nombre text, paterno text, materno text)");
	}

}
