package scribee.fish_matcher;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tile extends JButton {
	
	private ImageIcon tileIcon;
	
	/**
	 * Default constructor for new tile.
	 */
	public Tile() {
		super();

		initUI();
	}

	/**
	 * Constructor that sets the icon for a new tile.
	 * 
	 * @param image - image to use as this tile's icon
	 */
	public Tile(Image tileImage) {
		super(new ImageIcon(tileImage));
		
		tileIcon = new ImageIcon(tileImage);
		
		initUI();
	}
	
	private void initUI() {
		setContentAreaFilled(false); // remove default tile background
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setIcon(tileIcon);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
	}
}
