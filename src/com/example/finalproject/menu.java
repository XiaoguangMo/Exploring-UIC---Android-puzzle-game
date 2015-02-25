package com.example.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class menu extends Activity{
	private Button button1=null; 
	private Button button2=null; 

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		button1 = (Button)this.findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(menu.this,sushe1.class);
				startActivity(intent);
			}
		});		
		
		button2 = (Button)this.findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				System.exit(0);
			}
		});
	}
}
