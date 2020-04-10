package ooga.view.engine.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import java.util.Map;
import ooga.view.engine.utils.ImageLoader;
import ooga.view.engine.utils.SpriteSheet;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.BufferedImageUtil;

public class Material {
	private String path;
	private Texture texture;
	private float width, height;
	private int textureID;
	
	public Material(String path) {
		this.path = path;
	}

	/**
	 * Read texture image as a whole
	 */
	public void createTexture() {
		try {
			texture = TextureLoader.getTexture(path.split("[.]")[1], Material.class.getResourceAsStream(path), GL11.GL_NEAREST);
			width = texture.getWidth();
			height = texture.getHeight();
			textureID = texture.getTextureID();
		} catch (IOException e) {
			System.err.println("Can't find texture at " + path);
		}
	}

	/**
	 * Read texture as titles
	 */
	public void createTitledTexture(int x, int y, int textureWidth, int textureHeight){
		SpriteSheet Titles = new SpriteSheet(ImageLoader.loadImage(path));
		BufferedImage croppedImage = Titles.crop(x,y,textureWidth, textureHeight);

		try{
				texture = BufferedImageUtil.getTexture("", croppedImage);
				width = texture.getWidth();
				height = texture.getHeight();
				textureID = texture.getTextureID();
		} catch (IOException e){
			System.err.println("Can't find texture at " + path);
		}

	}

	/**
	 * Read texture as sprites
	 */
	public void createSpriteTexture(int y, int cnt){
		BufferedImage sheet = ImageLoader.loadImage(path);
		int textureWidth = sheet.getWidth() / cnt;
		int textureHeight = sheet.getHeight();
		SpriteSheet Titles = new SpriteSheet(ImageLoader.loadImage(path));
		createTitledTexture(0, y, textureWidth, textureHeight);
	}
	
	public void destroy() {
		GL13.glDeleteTextures(textureID);
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public int getTextureID() {
		return textureID;
	}

	public void bind(){
		GL13.glActiveTexture(GL13.GL_TEXTURE0);
		GL13.glBindTexture(GL11.GL_TEXTURE_2D, textureID);
	}
}