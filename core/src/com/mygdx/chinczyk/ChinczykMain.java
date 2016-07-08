package com.mygdx.chinczyk;

import com.badlogic.gdx.Game;

public class ChinczykMain extends Game {
	public static final int WIDTH = 480;
	public final static int HEIGHT = 800;

	private boolean paused;
	
	
	
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	@Override
	public void create() {
		
	}

	
}
