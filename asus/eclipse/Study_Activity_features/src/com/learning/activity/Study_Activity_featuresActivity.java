package com.learning.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Study_Activity_featuresActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
//        TextView txt_1=new TextView(this);
        
//        txt_1.setText("This is test");
       
        char chr[] ={'A','B','C','D'};
        for (int i=0;i<10;i++)
        	for(int j=0;j<10;j++)
        		for (char chr_1 : chr ) if (chr_1=='B' || chr_1=='C'); // System.out.println(m++);
//        Intent intent=new Intent(this, ActivityNoGUI.class); 
//        startActivity(intent);
        setContentView(R.layout.main);
/*        
        findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tst();
			}
		});
*/       tst();  
        startActivity(new Intent("com.learning.listener.newlistner.allone").addCategory("android.intent.category.DEFAULT"));
       
    }
    private void tst()
    {
    	Toast.makeText(this, "this is great !", (3*1000)).show();
    }
//        startService(new Intent("com.learning.service_1.learning_service_features.ACTION_MAIN"));
//        startService(new Intent("com.android.demo.notepad1.MAIN"));
//        startActivity(new Intent( com.android.demo.notepadv1, Notepadv1.class));
//        Button btn_1=(Button) findViewById(R.id.btn);
/*        findViewById(R.id.btn).setOnClickListener (new OnClickListener() {
			
        	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_CALL ,Uri.parse("tel:4433")));
			}
		});import android.content.Intent;
import android.net.Uri;

 */       
       
//        startActivity(new Intent(intent.ACTION_CALL ,Uri.parse("tel:4433")));
 //       this.finish();
    }
