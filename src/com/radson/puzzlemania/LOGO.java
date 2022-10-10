package com.radson.puzzlemania;


import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.InterstitialAd;
import com.radson.puzzlemania.R;
import com.radson.puzzlemania.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LOGO extends Activity implements AdListener{
	private InterstitialAd interstitialAds;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
	    this.interstitialAds =new InterstitialAd(this," ca-app-pub-2805037520028203/1037069575");
	    this.interstitialAds.setAdListener(this);
	    AdRequest adr = new AdRequest();
	    interstitialAds.loadAd(adr);
        new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent a=new Intent(getApplicationContext(),MainActivity.class);
				startActivity(a);
			}
		}, 3000);

}
	@Override
	public void onDismissScreen(Ad arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onLeaveApplication(Ad arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onPresentScreen(Ad arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onReceiveAd(Ad arg0) {
		// TODO Auto-generated method stub
		
	}
}