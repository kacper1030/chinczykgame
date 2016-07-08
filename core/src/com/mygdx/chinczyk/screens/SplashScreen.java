package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.chinczyk.ChinczykMain;

public class SplashScreen extends AbstractScreen{

	private Texture splashTexture;
	
	public SplashScreen(final ChinczykMain game) {
		super(game);
		init();
		
		Timer.schedule(new Task() {

			@Override
			public void run() {
				game.setScreen(new MenuScreen(game));
			}
		}, 3);
	}

	private void init() {
		splashTexture = new Texture("badlogic.jpg"); //TODO SPLASH SCREEN
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		batch.begin();
		
		batch.draw(splashTexture, 0 ,0);
		
		batch.end();
	}

	
}
