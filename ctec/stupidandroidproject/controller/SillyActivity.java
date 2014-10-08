package ctec.stupidandroidproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	int BackgroundChangerCounter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);

		// Gives you access to a button or any View object
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.SillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		setListeners();
	}

	private void setListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				if (BackgroundChangerCounter != 4)
				{	
				BackgroundChangerCounter++;
				}
				
				else
				{
					BackgroundChangerCounter = 0;
				}
				
				if (BackgroundChangerCounter == 1)
				{
					appLayout.setBackgroundResource(R.color.White);
				}
				else if (BackgroundChangerCounter == 2)
				{
					appLayout.setBackgroundResource(R.color.UglyRed);
				}
				else if (BackgroundChangerCounter == 3)
				{
					appLayout.setBackgroundResource(R.color.Black);
				}
				else if (BackgroundChangerCounter == 4)
				{
					appLayout.setBackgroundResource(R.color.uglyGreen);
				}
			}
		});
		
	}
}
