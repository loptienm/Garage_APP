package com.example.garageapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class GarageHomeActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.garageapp2.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_garage_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.garage_home, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle presses on the action bar items
		switch (item.getItemId()) {
		case R.id.parking_help:
//			openParkingHelp();
			return true;
		case R.id.action_settings:
			openSettings();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	/** Called when the user clicks the settings menu item */
	public void openSettings() {
		/* Decide which activity to start and declare intent */
		Intent intent = new Intent (this, CoreSettingsActivity.class);
		
		/* Start the activity */
		startActivity(intent);
	}
	
	/** Called when the user clicks the Send button */
	public void sendMessage (View view) {
		Intent intent = new Intent (this, DisplayMessageActivity.class);
		
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

}
