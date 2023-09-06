package com.example.topdj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPromo extends Activity {
	private VideoView video;
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_promo);
		video=(VideoView)findViewById(R.id.video);
		video.setVideoPath("/mnt/sdcard/mini.mp4");
		video.setMediaController(new MediaController(this));
		video.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video_promo, menu);
		return true;
	}

}
