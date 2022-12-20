package ie.gmit.dip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Arrays;

public class Filter07HorizontalLines {

	private BufferedImage image;

	public Filter07HorizontalLines(BufferedImage buffered) {
		image = buffered;
	}

	
	private int[] getFilteredRGB(int[][] matrix, int i, int j, double[][] kernel) {

		int[] colors = { 0, 0, 0 };

		for (int row = 0; row < kernel.length; row++) {
			for (int col = 0; col < kernel[row].length; col++) {

				try {

					colors[0] += ((matrix[i + (row - 1)][j + (col - 1)] >> 16) & 0xff) * kernel[row][col];
					colors[1] += ((matrix[i + (row - 1)][j + (col - 1)] >> 8) & 0xff) * kernel[row][col];
					colors[2] += (matrix[i + (row - 1)][j + (col - 1)] & 0xff) * kernel[row][col];

				} catch (Exception e) {
					int[] array = { (matrix[i][j] >> 16) & 0xff, (matrix[i][j] >> 8) & 0xff, matrix[i][j] & 0xff };
					return array;
				}
			}
		}
		return colors;
	}

	public BufferedImage Image() throws Exception {

		int[][] matrix = new int[image.getWidth()][image.getHeight()];

		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				int pixel = image.getRGB(x, y);

				matrix[x][y] = pixel;
			}
		}

		int[] newRGB = new int[3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				newRGB = getFilteredRGB(matrix, i, j, Kernel.HORIZONTAL_LINES);

				if (newRGB[0] < 0 || newRGB[0] > 255) {
					newRGB[0] = (matrix[i][j] >> 16) & 0xff;
				}
				if (newRGB[1] < 0 || newRGB[1] > 255) {
					newRGB[1] = (matrix[i][j] >> 8) & 0xff;
				}
				if (newRGB[2] < 0 || newRGB[2] > 255) {
					newRGB[2] = matrix[i][j] & 0xff;
				}

				Color color = new Color(newRGB[0], newRGB[1], newRGB[2]);

				int originalColor = color.getRGB();

				image.setRGB(i, j, originalColor);
			
				
			}
		}

		return image;
		
	}

}