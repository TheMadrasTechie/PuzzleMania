package com.radson.puzzlemania;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.radson.puzzlemania.R;


public class M5 extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m5);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final EditText q = (EditText) findViewById(R.id.editText1);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a =q.getText().toString();
			if(a.equals("36"))
			{
			Toast.makeText(getApplicationContext(), "your answer is correct", Toast.LENGTH_SHORT).show();
			Intent b=new Intent(M5.this,M6.class);
			startActivity(b);
			finish();
			}
			else
			{
				Toast.makeText(getApplicationContext(), "your answer is wrong", Toast.LENGTH_SHORT).show();	
			}
			}
		});final Button bt2 = (Button) findViewById(R.id.button2);
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent si = new Intent();
				si.setAction(Intent.ACTION_SEND);
				si.setType("text/plain");
				si.putExtra(
						Intent.EXTRA_TEXT,
						"Puzzle of the day:- \n\t  Robert forgot his 3-digit code of his Travel bag.He remembers that the numbers formed by the first two digits as well as the last two digits are prime.No digit is repeated.  All are natural numbers.What is the maximum number of trials required before he opens the bag?\n\n\n\n\n(source:- https://play.google.com/store/apps/details?id=com.radson.puzzlemania )");
				startActivity(Intent.createChooser(si, "share this puzzle via"));
			}
		});
		}
}