package com.android_toolbar_demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Toolbar_using_ActionBar extends ActionBarActivity {
	private static Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.toolbar_actionbar);

		// Find the id of toolbar
		toolbar = (Toolbar) findViewById(R.id.toolbar_n_actionbar);

		// Set upon the actionbar
		setSupportActionBar(toolbar);

		// Now use actionbar methods to show navigation icon and title
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		// or

		// toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);

		// Set title
		getSupportActionBar().setTitle("Toolbar using ActionBar");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate menu items
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Show toast when menu items selected
		switch (item.getItemId()) {
		case R.id.call:
			Toast.makeText(Toolbar_using_ActionBar.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.delete:
			Toast.makeText(Toolbar_using_ActionBar.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;

		case R.id.edit:
			Toast.makeText(Toolbar_using_ActionBar.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.share:
			Toast.makeText(Toolbar_using_ActionBar.this, item.getTitle(),
					Toast.LENGTH_SHORT).show();
			break;

		case android.R.id.home:
			// On navigation button pressed finis the activity
			finish();
			break;

		}
		return super.onOptionsItemSelected(item);
	}
}
