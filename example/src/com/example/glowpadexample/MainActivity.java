package com.example.glowpadexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fima.glowpadview.GlowPadView;
import com.fima.glowpadview.GlowPadView.OnTriggerListener;

public class MainActivity extends Activity implements OnTriggerListener {

	private GlowPadView mGlowPadView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mGlowPadView = (GlowPadView) findViewById(R.id.glow_pad_view);

		mGlowPadView.setOnTriggerListener(this);
		
		// uncomment this to make sure the glowpad doesn't vibrate on touch
		// mGlowPadView.setVibrateEnabled(false);
		
		// uncomment this to hide targets
		mGlowPadView.setShowTargetsOnIdle(true);
	}

	@Override
	public void onGrabbed(View v, int handle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onReleased(View v, int handle) {
		mGlowPadView.ping();

	}

	@Override
	public void onTrigger(View v, int target) {
		final int resId = mGlowPadView.getResourceIdForTarget(target);
		if(resId == R.drawable.ic_item_lighting)
			Toast.makeText(this, "Lighting Control", Toast.LENGTH_SHORT).show();
		else if (resId == R.drawable.ic_item_radiation)
			Toast.makeText(this, "Radiation Levels", Toast.LENGTH_SHORT).show();
		else if (resId == R.drawable.ic_item_personal)
			Toast.makeText(this, "Personal Information", Toast.LENGTH_SHORT).show();
		else if (resId == R.drawable.ic_item_ucservice)
			Toast.makeText(this, "Unified Communication", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onGrabbedStateChange(View v, int handle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinishFinalAnimation() {
		// TODO Auto-generated method stub

	}

}
