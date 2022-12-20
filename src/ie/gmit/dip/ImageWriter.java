package ie.gmit.dip;
import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;


public class ImageWriter {
	
	public BufferedImage writeImage(BufferedImage image) {
		
		try {
			ImageIO.write(image, "png", new File("out.png"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return image;
	}
	
	
}
	

