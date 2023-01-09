# Java-Image-Filtering-Software-By-Convolution-Kernel-2D-Array
This programme filters images by convolution kernel matrices using 2D arrays in Java.

This folder contains the SRC and bin folders of the project in which reside the Java classes and code.

This programme displays a moderate although not ideal degree of OOP practise, including encapsulation and delegation. However, there are classes which contain duplicate code (see TO DO section). 

The Menu class contains Menu functionality to prompt the user and read user input, and calls the relevant methods from other classes based on that input.

The ImageReader class reads in the user specified image as a BufferedImage.

The ImageWriter class writes out the filtered image as a .png file. 

The Kernel Class specifies the Matrixes for each type of filter as 2D arrays.

The Filter Image class was created to apply convolution kernel logic to the pixels of the user-inputted image via 2D Array with filter type as parameter. However, we violate the SRP and re-use the same code in each Filter class. This was a design choice due to time limitations when the author was still learning good OOP practise.

Each Filter Class implements the code of the above class with different parameters for each filter.  

//////////////

HOW TO RUN

//////////////

Via the command prompt on your OS (cmd on Windows), navigate to the bin directory of the Programme and run the following command to excecute the JAR file:

java -cp ./ImageFilter.jar ie.gmit.hdip.Runner

//////////////

TO DO

//////////////

This Programme represented an introductory venture into a Java OOP Project of larger scale. As such, it contains much duplicate code (each of the Kernel classes hold the same code apart from their specific convolution kernel matrices). These classes should be re-done to contain only the kernel code which is to be passed in as parameter to a single Kernel Class, in adherance to stronger OOP abstraction principles.

/
