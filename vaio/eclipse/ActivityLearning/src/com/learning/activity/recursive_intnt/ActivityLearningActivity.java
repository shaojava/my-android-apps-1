package com.learning.activity.recursive_intnt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLearningActivity extends Activity {
    /** Called when the activity is first created. */
	Bundle savedBundle;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        int icount=0;
        
        TextView tv = new TextView(this);
        try
        {    icount= getIntent().getIntExtra("icounter", 0); } 
       catch (Exception e) 
        {Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);}
            
            tv.setText(String.valueOf(icount));
            setContentView(tv);
            
            icount++;
            
        if (icount%3==0) Toast.makeText(this, String.valueOf(icount), Toast.LENGTH_SHORT).show();
       if (icount<9) startActivity(new Intent("myAppAction").putExtra("icounter", icount));
    }
    
    @Override
    protected void onRestart(){
    	super.onRestart();
    	Toast.makeText(this, String.valueOf(savedBundle), Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	
//    	Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();    	
    }
    @Override
    protected void onSaveInstanceState(Bundle outstate){};
   
}