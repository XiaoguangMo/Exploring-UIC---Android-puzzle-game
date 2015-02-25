package com.example.finalproject;

import com.example.finalproject.MainMenu.BtnListener;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class sushe3 extends Activity{
	private Button button1=null; 
	private Button button2=null; 
	private Button button3=null; 
	private Button button4=null; 
	private Button button5=null; 
	private Button button6=null; 
	private Button button7=null; 
	private Button button8=null; 
	private Button button9=null; 
	private Button button10=null; 
	private Button button11=null; 
	private Button button12=null; 
	private Button button13=null; 
	private RelativeLayout main=null;
	int[] array=null;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sushe3);

//		main = (RelativeLayout) findViewById(R.id.RelativeLayout1);
//		RelativeLayout.LayoutParams lp=new RelativeLayout.LayoutParams(-1,-1);  
//        main.setLayoutParams(lp); 
		button1 = (Button)this.findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(sushe3.this,menu.class);
				startActivity(intent);
				
			}
		});		
		
		button2 = (Button)this.findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Toast toast2=Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT);  
				toast2.show();  
			}
		});
		
		
		button3 = (Button)this.findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button4 = (Button)this.findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button5 = (Button)this.findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button6 = (Button)this.findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button7 = (Button)this.findViewById(R.id.button7);
		button7.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button8 = (Button)this.findViewById(R.id.button8);
		button8.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		button9 = (Button)this.findViewById(R.id.button9);
		button9.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
			}
		});
		Intent intent = this.getIntent();
		array = intent.getIntArrayExtra("data");
		if(array[0]==1){
			button2.setBackgroundResource(R.drawable.longzhu1);
		}
		if(array[1]==1){
			button3.setBackgroundResource(R.drawable.longzhu2);
		}
		if(array[2]==1){
			button4.setBackgroundResource(R.drawable.longzhu3);
		}
		if(array[3]==1){
			button5.setBackgroundResource(R.drawable.longzhu4);
		}
		if(array[4]==1){
			button6.setBackgroundResource(R.drawable.longzhu5);
		}
		if(array[5]==1){
			button7.setBackgroundResource(R.drawable.longzhu6);
		}
		if(array[6]==1){
			button8.setBackgroundResource(R.drawable.yaoshi);
		}
		if(array[7]==1){
			button9.setBackgroundResource(R.drawable.shuzhi);
		}
		button10 = (Button)this.findViewById(R.id.button10);
		button10.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(sushe3.this,map.class);
				startActivity(intent);
				
			}
		});
		button11 = (Button)this.findViewById(R.id.button11);
		button11.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Toast toast2=Toast.makeText(getApplicationContext(), "It is all black, can't go there.", Toast.LENGTH_SHORT);  
				toast2.show();  
			}
		});
		button12 = (Button)this.findViewById(R.id.button12);
		button12.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				MediaPlayer mediaPlayer01;
				mediaPlayer01 = MediaPlayer.create(sushe3.this, R.raw.sound);
				mediaPlayer01.start();
				Intent intent=new Intent(sushe3.this,sushe4.class);
				intent.putExtra("data",array);
				startActivity(intent);
			}
		});
		button13 = (Button)this.findViewById(R.id.button13);
		button13.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				MediaPlayer mediaPlayer01;
				mediaPlayer01 = MediaPlayer.create(sushe3.this, R.raw.sound);
				mediaPlayer01.start();
				Intent intent=new Intent(sushe3.this,sushe2.class);
				intent.putExtra("data",array);
				startActivity(intent);
			}
		});
		
//		main.addView(button1);
//		main.addView(button2);
//		
//		setContentView(R.layout.shanlu1);
	}
}
