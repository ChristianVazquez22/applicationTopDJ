package com.example.topdj;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SwedishHouseMafia extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swedish_house_mafia);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.swedish_house_mafia, menu);
		return true;
	}

}
