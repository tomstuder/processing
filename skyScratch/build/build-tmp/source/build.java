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

PImage bg;


public void setup(){
	size(361, 482);
bg = loadImage("ocean.jpg");
image(bg, 0, 0);


	for (int i = 0; i<150; i++){
		stroke(0xffFFFFFF, 50);
		noFill();
		ellipse(random(-5, 370), random(-5, 490), random(10, 700), random(10, 700));
	}
	for (int i = 0; i<75; i++){
		fill(0xffFFFFFF, 100);
		ellipse(random(0, 490), random(0, 500), 5, 5);
	}
fill(0xff111c72, 65);
noStroke();
rect(100, 400, 261, 50);
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
