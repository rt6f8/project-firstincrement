package com.example.testingtablelayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomePageActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_layout);
		
		TextView welcome_text = (TextView)findViewById(R.id.welcome_text);
		welcome_text.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2 = new Intent(getApplicationContext(), categories.class);
				startActivity(i2);
				 
			}
		});

}
}
