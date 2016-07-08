package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.chinczyk.ChinczykMain;

public class MenuScreen extends AbstractScreen{

	private Button buttonPlay;
	private Button buttonExit;
	
	public MenuScreen(ChinczykMain game) {
		super(game);
		init();
		buttons();
	}

	private void buttons() {
		buttonPlay();
		buttonExit();
	}

	private void buttonExit() {
		buttonExit = new Button(new ButtonStyle());
		buttonExit.setX(50);
		buttonExit.setY(80);
		buttonExit.setWidth(400);
		buttonExit.setHeight(100);
		buttonExit.setDebug(true);
		
		stage.addActor(buttonExit);
		
		buttonExit.addListener(new ClickListener(){
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {

					Gdx.app.exit();
				
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	private void buttonPlay() {
		buttonPlay = new Button(new ButtonStyle());
		buttonPlay.setX(50);
		buttonPlay.setY(450);
		buttonPlay.setWidth(400);
		buttonPlay.setHeight(100);
		buttonPlay.setDebug(true);
		
		stage.addActor(buttonPlay);
		
		buttonPlay.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {

					showGameplayScreen();
				
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	protected void showGameplayScreen() {
		game.setScreen(new GameplayScreen(game));
	}

	private void init() {
		buttonPlay = new Button(new ButtonStyle());
		buttonExit = new Button(new ButtonStyle());
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		batch.begin();
		
		stage.draw();
		
		batch.end();
	}

	private void update() {
		stage.act();
	}
	@Override
	public void dispose() {
		super.dispose();
		stage.dispose();
	}
	
}
