package com.learning.listner_1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class Learning_Activity_listners extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.btn1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tst();
				startService(new Intent("running.continues.service"));

			}
		});
        
        findViewById(R.id.btn2).setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				finish();
				return false;
			}
		});        
        
       
    }
    private void tst()
    {
    	Toast.makeText(this, "this is great !", (3*1000)).show();
//		startActivity(new Intent( android.intent.action.VIEW, Uri.parse("content://contacts/people1")));//"geo:48.200927,16.369548") ));			
    	Intent intent = new Intent("applicationB.munch.punch");
    	startActivity(intent);
    	
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	
    }
    }