package com.shz.activity;

import com.shz.nfcexchange.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);
		
		TextView title = (TextView) findViewById(R.id.title);
		title.setText(R.string.tab_three);

	}
}
