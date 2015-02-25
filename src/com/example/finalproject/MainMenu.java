package com.example.finalproject;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.*;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainMenu extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new BtnListener());
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new BtnListener2());
    }
    class BtnListener implements  OnClickListener{
    	public void onClick(View v) {
    		// TODO Auto-generated method stub
    		Intent intent = new Intent();
    		intent.setClass(MainMenu.this, sushe1.class);
    		startActivity(intent);
  
    	}
 }

    class BtnListener2 implements  OnClickListener{
    	public void onClick(View v) {
    		// TODO Auto-generated method stub
    	    System.exit(0);
    	  
    	}
    }
}
