package com.learning.services_1;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Learning_service_features extends IntentService {
    /** Called when the activity is first created. */
	private static int i=0;
	
	public Learning_service_features()
	{
		super("Learning_service_features");
	//	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:234-123-1231")));
	}

	  @Override
	  protected void onHandleIntent(Intent intent) {
	      // Normally we would do some work here, like download a file.
	      // For our sample, we just sleep for 5 seconds.
	      long endTime = System.currentTimeMillis() + 2*1000;
    	  Toast.makeText(this, "It is 4 times of running service", 10*1000);
	      while (System.currentTimeMillis() < endTime) {
	          synchronized (this) {
	              try {i++;	              
	                  wait(endTime - System.currentTimeMillis());
	                  if ((i%2)==0) 
	                	  {
	                	  Toast.makeText(this, "It is 4 times of running service", 1*1000);
	                	 // wait (5*1000); stopSelf();
	                	  }
	              } catch (Exception e) {
	              }
	          }
	      }
	  }
	  
	  @Override
	  public int onStartCommand(Intent intent, int flags, int startId) {
		  for (int j=0;j<3;j++){
		synchronized (this) {
			
		  try { Toast.makeText(this, "service starting_1", Toast.LENGTH_SHORT).show();wait(5*1000);} catch (Exception e) {
			// TODO: handle exception
		}}
	      Toast.makeText(this, "service starting_2", Toast.LENGTH_SHORT).show();
		  }   return super.onStartCommand(intent,flags,startId);
	  }
}