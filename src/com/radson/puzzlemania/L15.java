package com.radson.puzzlemania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class L15 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l15);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		final EditText w = (EditText) findViewById(R.id.editText2);
		final EditText e = (EditText) findViewById(R.id.editText3);
		

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
				String c =w.getText().toString();
				String d =e.getText().toString();

				if ((a.equals("60")) && (c.equals("35"))&& (d.equals("5"))) {
					Toast.makeText(getApplicationContext(),
							"your answer is correct", Toast.LENGTH_SHORT)
							.show();
					Intent bb = new Intent(L15.this, MainActivity.class);
					startActivity(bb);
					Toast.makeText(getApplicationContext(),
							"you have completed Logical puzzle",
							Toast.LENGTH_LONG).show();
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
						"Puzzle of the day:- \n\t A Father, son and grandson are walking in the park.When I asked for their age, The Father replies,My son is as many weeks as my grandson is in days, and my grandson is as many months old as I am in years.We are all 100 years together.Find their ages\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
	}
}
