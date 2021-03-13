package ibratech.clickableelements;

import processing.core.PApplet;

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

public class ClickableText {

	// myParent is a reference to the parent sketch
	PApplet myParent;

	int myVariable = 0;

	public final static String VERSION = "##library.prettyVersion##";

	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the Library.
	 * 
	 * @example Hello
	 * @param theParent the parent PApplet
	 */
	public ClickableText(PApplet theParent) {
		myParent = theParent;
		welcome();
	}

	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}

	String text; // Variable to store text
	int textPosX; // X-Position of text
	int textPosY; // Y-Position of text
	int textSize; // Text Size
	boolean isCenter; // Whether text is displayed from center

	public boolean isPressed() { // Function to check if the text has been pressed

		if (isCenter) {
			if (myParent.mouseX >= textPosX - ((text.length()) * textSize / 2) / 2
					&& myParent.mouseX <= textPosX + ((text.length()) * textSize / 2) / 2
					&& myParent.mouseY >= textPosY - textSize && myParent.mouseY <= textPosY) {
				return true;
			} else {
				return false;
			}

		} else

		{
			if (myParent.mouseX >= textPosX && myParent.mouseX <= (text.length()) * textSize / 2
					&& myParent.mouseY >= textPosY - textSize && myParent.mouseY <= textPosY) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void drawText() { // Function that draws the text
		myParent.textSize(textSize);
		if (isCenter) {
			myParent.textAlign(3);
		} else {
			myParent.textAlign(0);
		}
		myParent.text(text, textPosX, textPosY);
	}

	public void setText(String tempText) { // Sets text
		text = tempText;
	}

	public void setSize(int size) { // Sets text size
		textSize = size;
	}

	public void setPos(int x, int y) { // Sets text position
		textPosX = x;
		textPosY = y;
	}

	public void setMode(String mode) { // Sets text mode
		if (mode.toUpperCase().equals("CENTER")) {
			isCenter = true;
		} else {
			isCenter = false;
		}
	}

	public int getTextSize() { // Returns text size
		return textSize;
	}

	public int getTextX() { // Returns text X-position
		return textPosX;
	}

	public int getTextY() { // Returns text Y-position
		return textPosY;
	}

	public String getText() {
		return text;
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
