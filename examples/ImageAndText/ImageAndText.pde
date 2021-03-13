PImage testl;
import ibratech.clickableelements.*;

ClickableText test = new ClickableText(this);

ClickableImage testPic = new ClickableImage(this);

void setup() {
  size(500, 500);
  testl = loadImage("Linux.png");
  test.setText("Testing");
  test.setPos(250, 250);
  test.setSize(50);
  test.setMode("center");

  testPic.setPos(250, 250);
  testPic.setImg(testl);
}

void draw() {
  testPic.drawImage();
  test.drawText();
}

void mousePressed() {
  if (testPic.isPressed()) {
    println("The picture was pressed");
  }
  if (test.isPressed()) {
    println("The text was pressed");
  }
}
