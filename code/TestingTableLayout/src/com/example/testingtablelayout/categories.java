package com.example.testingtablelayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class categories extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categories);
		
		TextView welcome_text = (TextView)findViewById(R.id.select_category);
		welcome_text.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i4 = new Intent(getApplicationContext(), categories.class);
				startActivity(i4);
				 
			}
		});}}