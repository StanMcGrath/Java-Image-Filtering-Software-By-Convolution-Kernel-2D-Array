package ie.gmit.dip;

import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class ImageReader {
	
private Scanner s2;

public BufferedImage readImage() throws Exception {
	s2 = new Scanner(System.in);
	String userPath = s2.nextLine();
	File f = getFile(userPath);
	
	BufferedImage image = ImageIO.read(f);
	return image;
	
}

private File getFile(String userPath) throws Exception{
	  File f = new File(userPath);
		
	  if (f.exists()){
	    return f;
	  }else{
	    throw new Exception("Invalid file path...!" +userPath);
	  }
	}
}