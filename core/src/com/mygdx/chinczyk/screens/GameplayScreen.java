package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.chinczyk.ChinczykMain;

public class GameplayScreen extends AbstractScreen{

	private Texture texture;
	
	public GameplayScreen(ChinczykMain game) {
		super(game);
		init();
		
	}
	private void init() {
		texture = new Texture("badlogic.jpg");
	}
	@Override
	public void render(float delta) {
		super.render(delta);
		
		batch.begin();
		
		batch.draw(texture, 100, 100);
		
		batch.end();
		
		
		
	}

}
