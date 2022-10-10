package com.radson.puzzlemania;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class L3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l3);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
				if (a.equals("3")) {
					Toast.makeText(getApplicationContext(),
							"your answer is correct", Toast.LENGTH_SHORT)
							.show();
					Intent b = new Intent(L3.this, L4.class);
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
						"Puzzle of the day:- \n\t  Miller’s favourite colours are red and blue.In his drawer, there are six pairs of red socks and six pairs of blue socks , all mixed up. How many trials Miller should make in order to get one pair of socks without looking into the drawer?\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
	}
}
