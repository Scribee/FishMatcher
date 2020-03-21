package scribee.fish_matcher;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Level extends JPanel {
		
	public Level() {
		
	}
	
	@Override
    public void addNotify() {
		super.addNotify();
		
        initUI();
    }
	
	/**
	 * Sets up game UI
	 */
	private void initUI() {
		int width = 7;
		int height = 7;
		
		setLayout(new GridLayout(width, height, 3, 3)); // create a grid of the specified dimensions to arrange the tiles
		setBorder(BorderFactory.createEmptyBorder()); // remove default grid borders
		
		populateBoard(width * height, 0);
	}
	
	/**
	 * Populates Level with numTiles number of randomly colored fish.
	 * 
	 * @param numTiles - number of fish to generate
	 */
	private void populateBoard(int numTiles, int specialTileChance) {
		for (int i = 0; i < numTiles; i++) {
			double rand = Math.random();
			
			if (rand < specialTileChance) {
				add(new SpecialTile());
			}
			else if (rand >= 0.5) {
				add(new FishTile(GameWindow.greenFish));
			}
			else {
				add(new FishTile(GameWindow.purpleFish));
			}
		}
	}
}
