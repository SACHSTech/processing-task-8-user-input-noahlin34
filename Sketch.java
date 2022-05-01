import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage imgBackground;
  PImage imgCharacter;

  float fltCharacterPosX = 100;
  float fltCharacterPosY = 100;

  boolean boolUpPressed = false;
  boolean boolDownPressed = false;
  boolean boolRightPressed = false;
  boolean boolLeftPressed = false;

  int intBackground = 0;

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    imgBackground = loadImage("cloudsbackground.jpg");
    imgCharacter = loadImage("character.png");

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    

    image(imgBackground, 0, 0);
    if(keyPressed) {
      if(key == 'a' || key == 'A') {
        background(123123);
      }
    }
    
    if(boolUpPressed) {
      fltCharacterPosY = fltCharacterPosY - 2;
    }
    if(boolDownPressed) {
      fltCharacterPosY = fltCharacterPosY + 2;
    }
    if(boolRightPressed) {
      fltCharacterPosX = fltCharacterPosX + 2;
    }
    if(boolLeftPressed) {
      fltCharacterPosX = fltCharacterPosX - 2;
    }

    
    if(mousePressed) {
      imgCharacter.resize(100, 100);
    }else {
      imgCharacter.resize(50, 50);
    }
    image(imgCharacter, fltCharacterPosX, fltCharacterPosY);


    if(mouseX >= width - 5 || mouseX <= 5) {
      background(341);
    }
    if(mouseY >= height - 5 || mouseY <= 5) {
      background(341);
    }


   
  }

 

  public void keyPressed() {
    if(keyCode == UP) {
      boolUpPressed = true;
    }
    else if(keyCode == DOWN) {
      boolDownPressed = true;
    }
    else if(keyCode == RIGHT) {
      boolRightPressed = true;
    } 
    else if(keyCode == LEFT) {
      boolLeftPressed = true;
    }
  }

  public void keyReleased() {
    if(keyCode == UP) {
      boolUpPressed = false;
    }
    else if(keyCode == DOWN) {
      boolDownPressed = false;
    }
    else if(keyCode == RIGHT) {
      boolRightPressed = false;
    } 
    else if(keyCode == LEFT) {
      boolLeftPressed = false;
    }
  }


  public void mousePressed() {
    if(intBackground == 0) {
      imgBackground = loadImage("background2.jpg");
      intBackground = 1; 
    }
    else if (intBackground == 1) {
      imgBackground = loadImage("background3.jpg");
      intBackground = 2;
    }
    else if(intBackground == 2) {
      imgBackground = loadImage("cloudsbackground.jpg");
      intBackground = 0;
    }
  }
  
  // define other methods down here.
}