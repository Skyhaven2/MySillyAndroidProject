package ctec.stupidandroidproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity
{
	private Button appButton;
	private Button haButton;
	private Button mysteryButton;
	private TextView appText;
	private TextView hiText;
	private ImageView stupidImageView;
	private RelativeLayout appLayout;
	boolean notFirstClick = false;
	boolean pastSecondClick = false;
	int y = 10;
	int BackgroundChangerCounter = 0;
	int TextTalkerCounter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);

		// Gives you access to a button or any View object
		appButton = (Button) findViewById(R.id.firstButton);
		haButton = (Button) findViewById(R.id.haButton);
		appText = (TextView) findViewById(R.id.SillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		hiText = (TextView) findViewById(R.id.hiText);
		mysteryButton = (Button) findViewById(R.id.mysteryButton);
		stupidImageView = (ImageView) findViewById(R.id.stupidImageView);
		setListeners();
	}

	private void setListeners()
	{
		mysteryButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				if (!notFirstClick)
				{
					stupidImageView.setVisibility(View.VISIBLE);
					notFirstClick = true;
				}
				else
				{
					if (notFirstClick)
					{
						stupidImageView.setX(10);
						pastSecondClick = true;
					}
				}
				if(pastSecondClick)
				{
					stupidImageView.setY(y + 10);
					y = y + 10;
				}
			}
		});
		haButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				if (TextTalkerCounter == 0)
				{
					hiText.setVisibility(View.VISIBLE);
					hiText.setText("Hi");
					TextTalkerCounter++;
				}
				else
				{
					if (TextTalkerCounter == 1)
					{
						hiText.setText("My name is Dave");
						TextTalkerCounter++;
					}
					else
					{
						if (TextTalkerCounter == 2)
						{
							hiText.setText("I like to tell stories");
							TextTalkerCounter++;
						}
						else
						{
							if (TextTalkerCounter == 3)
							{
								hiText.setText("Once, I was at the park");
								TextTalkerCounter++;
							}
							else
							{
								if (TextTalkerCounter == 4)
								{
									hiText.setText("There was a man at this park");
									TextTalkerCounter++;
								}
								else
								{
									if (TextTalkerCounter == 5)
									{
										hiText.setText("and he said:");
										TextTalkerCounter = 0;
									}
								}
							}
						}
					}
				}
			}

		});

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
					BackgroundChangerCounter = 1;
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
