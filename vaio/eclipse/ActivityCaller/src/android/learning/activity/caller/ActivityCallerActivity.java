package android.learning.activity.caller;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ActivityCallerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.btnBack).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
//			startActivity(new Intent().setComponent(new ComponentName("android.learning.activity.features", ActivityLearningFEaturesActivity.class)));
				
			
			
		    Intent intent = new Intent();//"android.intent.action.MAIN");
		    intent.setAction("ActivityIntent.learning.action.main");
//		    intent.setComponent(new ComponentName("android.learning.activity.intentgenerator","android.learning.activity.intentgenerator.ActivityIntentGenerator"));

		    //		    intent.setComponent(ComponentName.unflattenFromString("android.learning.activity.intentgenerator/.ActivityIntentGenerator"));
//		    intent.addCategory("android.intent.category.LAUNCHER");
		    intent.putExtra("counter",10 );
		    startActivity(intent);
			}
		});
        
        findViewById(R.id.btnExit).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
        
    }
}