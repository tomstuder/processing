import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

// Adaptation of Tutorial from "Getting Started With Processing" by Casey Reas

float x;
float easingX = 0.01f;

float y;
float easingY = 0.01f;

public void setup(){
	
	size(600, 600);
	smooth();

}

public void draw(){

float targetX = mouseX;
float targetY = mouseY;

x += (targetX - x) * easingX;
y += (targetY - y) * easingY;

ellipse(x, y, 12, 12);
		
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
