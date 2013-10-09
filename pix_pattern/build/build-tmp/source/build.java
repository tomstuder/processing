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

public void setup(){
	size(800, 800);
	smooth();


for (int x = 0; x <=width; x+=10){
	for (int y = 0; y <=height; y+=10){
		stroke(random(0, 255));
		strokeWeight(random(1,5));
		rect(x, y, 5, 5);
	}

  }
  saveFrame("static.png");

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
