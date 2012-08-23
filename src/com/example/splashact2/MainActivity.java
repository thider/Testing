package com.example.splashact2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash); 
	
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					int logoTimer = 0;
					while(logoTimer <5000){
						sleep(100);
						logoTimer = logoTimer +100;
					}
					startActivity(new Intent("com.example.splashact.CLEARSCREEN"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				finally{
					finish();
				}
				
				}
			};
			logoTimer.start();
		}
}
 