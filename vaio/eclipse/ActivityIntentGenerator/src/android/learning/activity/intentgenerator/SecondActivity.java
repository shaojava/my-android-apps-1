package android.learning.activity.intentgenerator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SecondActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        findViewById(R.id.btnBack).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				startActivity(new Intent(Intent.ACTION_SEND).setData(Uri.parse("mailto:masistani@yahoo.com")));//putExtra(Intent.EXTRA_EMAIL,"masistani@yahoo.com" ));
//						.putExtra(Intent.EXTRA_SUBJECT, "Subject_1").setType("plain/text").putExtra(Intent.EXTRA_TEXT, "Text for test"));
				
			}
		});
    }
}