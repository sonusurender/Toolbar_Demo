package com.android_toolbar_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.toolbar_with_actionbar).setOnClickListener(this);
		findViewById(R.id.toolbar_without_actionbar).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.toolbar_with_actionbar:
			newActivtiy(Toolbar_using_ActionBar.class);
			break;

		case R.id.toolbar_without_actionbar:
			newActivtiy(Toolbar_without_ActionBar.class);

			break;
		}

	}

	// Intent method
	void newActivtiy(Class<?> activity) {

		startActivity(new Intent(MainActivity.this, activity));

	}

}
