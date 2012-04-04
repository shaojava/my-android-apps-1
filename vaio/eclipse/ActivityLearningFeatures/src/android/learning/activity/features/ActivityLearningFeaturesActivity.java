package android.learning.activity.features;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class ActivityLearningFeaturesActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
 //       startActivity(new Intent().setComponent(new ComponentName("android.learning.activity.intentgenerator/.ActivityIntentGenerator")));
        
 //       finish();
    }
}