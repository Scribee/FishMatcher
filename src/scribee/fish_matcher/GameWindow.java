package scribee.fish_matcher;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import scribee.fish_matcher.util.ImageLoader;

/**
 * 
 * 
 * @author Carson Sloan
 *
 * Created 12/14/19
 *
 */
@SuppressWarnings("serial")
public class GameWindow extends JFrame {
	
	public static BufferedImage greenFish;
	public static BufferedImage purpleFish;
	
	public GameWindow(JPanel[] components) {
		initUI(components);
	}
	
	/**
	 * Sets up the game UI.
	 */
	private void initUI(JPanel[] components) {
		loadImages();
		
		add(components[0], BorderLayout.CENTER);
		
		setTitle("Match the fish!");
		setResizable(false);
		pack(); // sets dimensions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // centers window
	}
	
	/**
	 * Fetches fish icons.
	 */
	private void loadImages() {
		greenFish = ImageLoader.loadImage("src/resources/green_fish.png");
		purpleFish = ImageLoader.loadImage("src/resources/purple_fish.png");
	}
}
