package com.radson.puzzlemania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class M4 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m4);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		final EditText w = (EditText) findViewById(R.id.editText2);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
				String c =w.getText().toString();
			
					if ((a.equals("54")) && (c.equals("45"))) {
						Toast.makeText(getApplicationContext(),
								"your answer is correct", Toast.LENGTH_SHORT)
								.show();
						Intent b = new Intent(M4.this, M5.class);
						startActivity(b);
						finish();
					} else {
						Toast.makeText(getApplicationContext(),
								"your answer is wrong", Toast.LENGTH_SHORT)
								.show();
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
						"Puzzle of the day:- \n\t  Annie and Jessie are chatting with each other.Annie, you know something funny?If you reverse my age you will get the age of my husband, who is older than me.The difference between our age is 1/11th of their sum.What is my age and that of my husband’s?\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});

	}
}
