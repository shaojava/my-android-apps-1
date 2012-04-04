package android.learning.activity.intentgenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityIntentGenerator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        int i=0;
        i=getIntent().getIntExtra("counter", i);
        TextView txtv=new TextView(this);
        txtv.setText(String.valueOf(i));
              
        setContentView(txtv);
 /*       
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setAction("newAction");
				intent.addCategory("android.learning.activity.caller.myCategory.new");
				startActivity(intent);
			}
		});
     
       */   

    }
  
    public void activeActivity()
    {
	     startActivity(new Intent(this,SecondActivity.class));
    }

}