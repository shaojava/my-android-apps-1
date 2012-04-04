package com.learning.game.first;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

public class GameView extends View {
	
	private Bitmap bmp;
	public GameView(Context context){
		super(context);
		
		bmp= BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		
		
	}
	
	

}
