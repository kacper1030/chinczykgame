package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.chinczyk.ChinczykMain;

public abstract class AbstractScreen implements Screen{
	
	protected Stage stage;
	
	protected ChinczykMain game;
	private OrthographicCamera camera;
	protected SpriteBatch batch;
	
	public AbstractScreen(ChinczykMain game){
		this.game = game;
		createCamera();
		batch = new SpriteBatch();
		stage = new Stage(new StretchViewport(ChinczykMain.WIDTH, ChinczykMain.HEIGHT));
		Gdx.input.setInputProcessor(stage);
	}

	private void createCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, ChinczykMain.WIDTH,ChinczykMain.HEIGHT);
		camera.update();
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		clearScreen();
		camera.update();
		batch.setProjectionMatrix(camera.combined);
	}

	private void clearScreen() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		game.setPaused(true);
	}

	@Override
	public void resume() {
		game.setPaused(false);
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		game.dispose();
	}
	
}
