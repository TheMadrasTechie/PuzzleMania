package com.radson.puzzlemania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class L9 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l9);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
			
				if ((a.equals("10968")) ) {
					Toast.makeText(getApplicationContext(),
							"your answer is correct", Toast.LENGTH_SHORT)
							.show();
					Intent b = new Intent(L9.this, L10.class);
					startActivity(b);
					finish();
				} else {
					Toast.makeText(getApplicationContext(),
							"your answer is wrong", Toast.LENGTH_SHORT).show();
				}
			}
		});
		final Button bt2 = (Button) findViewById(R.id.button2);
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent si = new Intent();
				si.setAction(Intent.ACTION_SEND);
				si.setType("text/plain");
				si.putExtra(
						Intent.EXTRA_TEXT,
						"Puzzle of the day:- \n\t  Charles bought a car and applied for the license plate.He got the License plate with a five digit number .The  number is still readable when the number plate is turned upside down, but the value had increased by 78633.Can you find out the the original  number?\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
	}
}
