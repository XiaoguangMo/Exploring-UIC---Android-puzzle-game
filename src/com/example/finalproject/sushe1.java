package com.example.finalproject;
import com.example.finalproject.MainMenu.BtnListener;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class sushe1 extends Activity{
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

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sushe1);

//		main = (RelativeLayout) findViewById(R.id.RelativeLayout1);
//		RelativeLayout.LayoutParams lp=new RelativeLayout.LayoutParams(-1,-1);  
//        main.setLayoutParams(lp); 
		button1 = (Button)this.findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(sushe1.this,menu.class);
				startActivity(intent);
			}
		});		
		
		button2 = (Button)this.findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
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
		button10 = (Button)this.findViewById(R.id.button10);
		button10.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(sushe1.this,map.class);
				startActivity(intent);
			}
		});
		button11 = (Button)this.findViewById(R.id.button11);
		button11.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent(sushe1.this,sushe2.class);
				int[] array = new int[8];
				for(int i=0;i<8;i++){
					array[i]=0;
				}
				intent.putExtra("data",array);
				startActivity(intent);
			}
		});
//		button12 = (Button)this.findViewById(R.id.button12);
//		button12.setOnClickListener(new OnClickListener(){
//			public void onClick(View v){
//				Toast toast2=Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT);  
//				toast2.show();
//			}
//		});
//		button13 = (Button)this.findViewById(R.id.button13);
//		button13.setOnClickListener(new OnClickListener(){
//			public void onClick(View v){
//				
//			}
//		});
		
//		main.addView(button1);
//		main.addView(button2);
//		
//		setContentView(R.layout.shanlu1);
	}
}
