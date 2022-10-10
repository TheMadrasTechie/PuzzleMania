package com.radson.puzzlemania;

import android.animation.IntArrayEvaluator;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class M1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m1);
		final Button bt1 = (Button) findViewById(R.id.button1);

		final EditText q = (EditText) findViewById(R.id.editText1);
		final EditText w = (EditText) findViewById(R.id.et2);
		final EditText e = (EditText) findViewById(R.id.et3);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
				String b =w.getText().toString();
				String c =e.getText().toString();
				if ((a.equals("4")) && (b.equals("5")) && (c.equals("6"))) {

					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();
					Intent m2 = new Intent(M1.this, M15.class);
					startActivity(m2);
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
						"Puzzle of the day:- \n\t  The product of three consecutive positive numbers when divided by each of them in turn,then the resulting three quotients will add up to 74.   what are the numbers ?\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
	}
}