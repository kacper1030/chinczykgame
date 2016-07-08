package com.mygdx.chinczyk.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.chinczyk.ChinczykMain;

public class DesktopLauncher extends ChinczykMain{
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.resizable = true;
		config.foregroundFPS = 60;
		
		config.width = WIDTH;
		config.height = HEIGHT;
		config.title = "Chinczyk !";
		
		new LwjglApplication(new ChinczykMain(), config);
	}
}
