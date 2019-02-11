package com.android_toolbar_demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Toolbar_without_ActionBar extends ActionBarActivity {
	private static Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.toolbar_noactionbar);
		toolbar = (Toolbar) findViewById(R.id.toolbar_noaction);

		// Set toolbar subtitle and color
		// toolbar.setSubtitle("Subtitle");
		// toolbar.setSubtitleTextColor(getResources().getColor(R.color.textColorPrimary));

		// Set toolbar logo
		// toolbar.setLogo(R.drawable.ic_launcher);

		// Inflate menu over toolbar
		toolbar.inflateMenu(R.menu.main);

		// Sett title
		toolbar.setTitle("Toolbar Only");

		// Set navigation back icon
		toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);

		// Implement click listener on navigation icon
		toolbar.setNavigationOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				finish();

			}
		});

		// Implement menu click listener to do something when menu items
		// selected
		toolbar.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				switch (item.getItemId()) {
				case R.id.call:
					Toast.makeText(Toolbar_without_ActionBar.this,
							item.getTitle(), Toast.LENGTH_SHORT).show();
					break;
				case R.id.delete:
					Toast.makeText(Toolbar_without_ActionBar.this,
							item.getTitle(), Toast.LENGTH_SHORT).show();
					break;

				case R.id.edit:
					Toast.makeText(Toolbar_without_ActionBar.this,
							item.getTitle(), Toast.LENGTH_SHORT).show();
					break;

				case R.id.share:
					Toast.makeText(Toolbar_without_ActionBar.this,
							item.getTitle(), Toast.LENGTH_SHORT).show();
					break;

				}
				return false;
			}
		});

	}
}
