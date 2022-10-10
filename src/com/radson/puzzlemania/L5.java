package com.radson.puzzlemania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class L5 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l5);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a = (q.getText().toString());
				if (a.equals("Friday")) {
					Toast.makeText(getApplicationContext(),
							"your answer is correct", Toast.LENGTH_SHORT)
							.show();
					Intent b = new Intent(L5.this, L6.class);
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
						"Puzzle of the day:- \n\t  There are 3 painters and they paint together only once in a week.No painter is called to paint for 3 consecutive days.painter 1 is off on Tuesday, Thursday and Sunday.painter 2 is off on Saturday.painter 3 is off on Thursday, Sunday. No two painters are off more than once a week.Find the day on which all the 3 painters are at paint.\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
	}
}
