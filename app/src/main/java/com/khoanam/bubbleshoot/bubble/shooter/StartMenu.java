package com.khoanam.bubbleshoot.bubble.shooter;

import com.khoanam.bubbleshoot.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartMenu  extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.start_menu);
		super.onCreate(savedInstanceState);

		System.out.println(Math.cos((double)('o' / 10 * 4)));
	}
	
	public void playButton(View v){
		Intent intent = new Intent(this,LevelSelectMenu.class);
		startActivity(intent);
	}
	public void optionButton(View v){
		startActivity(new Intent(this,Options.class));
	}
}
