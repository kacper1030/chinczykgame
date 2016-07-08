package com.mygdx.chinczyk.obj;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GameObject extends Rectangle{

	private Texture texturePlayer;
	
	public GameObject(Texture texturePlayer){
		this.texturePlayer = texturePlayer;
		this.height = 35;
		this.width = 35;
	}

	public Texture getTexturePlayer() {
		return texturePlayer;
	}
	
}
