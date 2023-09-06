package com.example.topdj;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ArminVanBuuren extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_armin_van_buuren);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.armin_van_buuren, menu);
		return true;
	}

}
