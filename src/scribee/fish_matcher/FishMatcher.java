package scribee.fish_matcher;

import javax.swing.JPanel;

public class FishMatcher {

	public static void main(String[] args) {
		JPanel[] components = {new Level()};
		
		GameWindow game = new GameWindow(components);
		
		game.setVisible(true);
	}
}
