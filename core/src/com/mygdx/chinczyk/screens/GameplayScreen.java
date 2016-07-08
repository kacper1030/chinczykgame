package com.mygdx.chinczyk.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.chinczyk.ChinczykMain;
import com.mygdx.chinczyk.obj.GameObject;

public class GameplayScreen extends AbstractScreen{

	private Texture texture;
	private Texture player_red_1_tex;
	private GameObject player_red_1;
	
	public GameplayScreen(ChinczykMain game) {
		super(game);
		init();
		
	}
	private void init() {
		
		player_red_1_tex = new Texture("img/playerred.png");
		player_red_1 = new GameObject(player_red_1_tex);
		
		player_red_1.x = 500;
		player_red_1.y = 500;
		
	}
	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		batch.begin();
		
		batch.draw(player_red_1.getTexturePlayer(), player_red_1.x, player_red_1.y);
		
		batch.end();
		
	}
	private void update() {
//		if()
	}

}
