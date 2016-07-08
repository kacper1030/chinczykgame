package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.chinczyk.ChinczykMain;

public class SplashScreen extends AbstractScreen{

	private Texture splashTexture;
	
	public SplashScreen(ChinczykMain game) {
		super(game);
		init();
	}

	private void init() {
		splashTexture = new Texture(""); //TODO SPLASH SCREEN
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		batch.begin();
		
		batch.draw(splashTexture, 0 ,0);
		
		batch.end();
	}

	
}
