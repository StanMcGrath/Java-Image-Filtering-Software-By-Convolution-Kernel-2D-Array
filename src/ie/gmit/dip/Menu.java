package ie.gmit.dip;

import java.util.Scanner;
import java.awt.image.BufferedImage;

public class Menu { // this class displays menu options

	private Scanner s;
	private boolean keepRunning = true;
	private boolean keepRunning2 = true;
	private BufferedImage image;

	public Menu() {
		s = new Scanner(System.in);
	}

	public void start() {

		while (keepRunning) {
			show();
			int choice = Integer.parseInt(s.nextLine());

			if (choice == 1) {
				enterImage();
			} else if (choice == 2) {
				selectFilter();
			} else if (choice == 3) {
				System.out.println("Shutting Down.. Please Wait..");
				keepRunning = false;
			} else {
				System.out.println("[Error] Invalid input.");
			}

		}

	}
	//

	public void show() {
		System.out.println("1) Enter Image Filepath"); // Ask user to specify the file to process. Do NOT hardcode paths or file names											
		System.out.println("2) Select a Filter"); // List the set of filters available in the class Kernel.java
		System.out.println("3) Quit"); // Terminate
		System.out.println("\nSelect Option [1-3]>");
	}

	public void enterImage() {
		System.out.println("[INFO] Enter Image to Filter.");
		System.out.println("[INFO] Enter the full path to your image here. (EG: C:/Users/PC/Desktop/melon2.png)");
		System.out.println("Enter Image Filepath Here>");

		try {
			ImageReader ir = new ImageReader();
			image = ir.readImage();
			System.out.println(image);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void selectFilter() {

		System.out.println("[INFO] Select the Filter you wish to apply.");
		System.out.println("1) Edge Detection 1");
		System.out.println("2) Edge Detection 2");
		System.out.println("3) Identity");
		System.out.println("4) Laplacian");
		System.out.println("5) Sharpen");
		System.out.println("6) Vertical Lines");
		System.out.println("7) Horizontal Lines");
		System.out.println("8) Diagonal Lines");
		System.out.println("9) Box Blur");
		System.out.println("10) Sobel Horizontal");
		System.out.println("11) Sobel Vertical");
		System.out.println("12) KEEP THIS FILTERED IMAGE AND PROCEED");
		System.out.println("Select Filter Type>");

		while (keepRunning2) {
			int choice2 = Integer.parseInt(s.nextLine());
			if (choice2 == 1) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter01Edge1 f1 = new Filter01Edge1(image);
					f1.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 2) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter02Edge2 f2 = new Filter02Edge2(image);
					f2.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 3) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter03Identity f3 = new Filter03Identity(image);
					f3.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 4) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter04Laplacian f4 = new Filter04Laplacian(image);
					f4.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 5) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter05Sharpen f5 = new Filter05Sharpen(image);
					f5.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 6) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter06VerticalLines f6 = new Filter06VerticalLines(image);
					f6.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 7) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter07HorizontalLines f7 = new Filter07HorizontalLines(image);
					f7.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 8) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter08Diagonal45Lines f8 = new Filter08Diagonal45Lines(image);
					f8.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 9) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter09BoxBlur f9 = new Filter09BoxBlur(image);
					f9.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 10) {
				try {
					ImageWriter iw = new ImageWriter();
					Filter10SobelHorizontal f10 = new Filter10SobelHorizontal(image);
					f10.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (choice2 == 11) {

				try {
					ImageWriter iw = new ImageWriter();
					Filter11SobelVertical f11 = new Filter11SobelVertical(image);
					f11.Image();
					iw.writeImage(image);
					System.out.println("Your image has been saved as out.png in the source folder.");
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (choice2 == 12) {
				System.out.println(" ************************************************************************* ");
				System.out.println(" @( * O * )@ Thank you for using Crazy Image Filtering System! @( * O * )@ ");
				System.out.println(" ************************************************************************* ");
				System.out.println(" *******You may now quit the program and view your filtered image!******** ");
				System.out.println(" ************************************************************************* ");
				keepRunning2 = false;
			} else {
				System.out.println("[Error] Invalid input.");
			}

		}

	}

}