package ibratech.clickableelements;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package
 * 'template' to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder
 * 'examples' will automatically include the example in the javadoc.)
 *
 * @example Hello
 */

public class ClickableImage {

	// myParent is a reference to the parent sketch
	PApplet myParent;

	int myVariable = 0;

	public final static String VERSION = "##library.prettyVersion##";

	public ClickableImage(PApplet theParent) {
		myParent = theParent;
		welcome();
	}

	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}

	PImage img; // Image to be displayed
	int picPosX; // X-Position of image
	int picPosY; // Y-Position of image
	int picSizeX; // X-Size of image
	int picSizeY; // Y Size of image
	boolean isCenter; // Whether or not the image is displayed in mode center

	public boolean isPressed() { // Function that returns whether or not the element is pressed
		if (isCenter) { // If the image is displayed in center mode
			if (myParent.mouseX >= picPosX - picSizeX && myParent.mouseX <= picPosX + picSizeX
					&& myParent.mouseY >= picPosY - picSizeY && myParent.mouseY <= picPosY + picSizeY) {
				return true;
			} else {
				return false;
			}
		} else { // Otherwise proceed normally
			if (myParent.mouseX >= picPosX && myParent.mouseX <= picPosX + picSizeX && myParent.mouseY >= picPosY
					&& myParent.mouseY <= picPosY + picSizeY) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void setImg(PImage temp) { // Function to set the image
		img = temp; // Set the image
		picSizeX = img.width; // Default the X and Y size to the image default.
		picSizeY = img.height;
	}

	public void drawImage() { // Function to display the image
		if (isCenter) {
			myParent.imageMode(3);
		} else {
			myParent.imageMode(0);
		}
		myParent.image(img, picPosX, picPosY, picSizeX, picSizeY);
	}

	public void setSizeX(int size) { // Function to set X-size of image
		picSizeX = size;
	}

	public void setSizeY(int size) { // Function to set Y-size of image
		picSizeY = size;
	}

	public void setPos(int x, int y) { // Function to set position of image
		picPosX = x;
		picPosY = y;
	}

	public void setMode(String mode) {
		if (mode.toUpperCase().equals("CENTER")) {
			isCenter = true;
		} else {
			isCenter = false;
		}
	}

	public int getPicSizeX() { // Return X size of picture
		return picSizeX;
	}

	public int getPicSizeY() { // Return Y size of picture
		return picSizeY;
	}

	public int getPicX() { // Returns X-position of image
		return picPosX;
	}

	public int getPicY() { // Returns Y-position of image
		return picPosY;
	}

	/**
	 * return the version of the Library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}
}
