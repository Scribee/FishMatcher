package scribee.fish_matcher.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	/**
	 * Returns a BufferedImage created from a specified image file.
	 * 
	 * @param path - path to the image file to be loaded
	 * @return BufferedImage created from a specified image file
	 * @throws IOException if there is an error reading the file 
	 */
	public static BufferedImage loadImage(String path) {
		try {
			BufferedImage image = ImageIO.read(new File(path));

			return image;
		}
		catch (IOException ioex) {
			ioex.printStackTrace();
		}
		
		return null;
	}
}
