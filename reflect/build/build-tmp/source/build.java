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


PShape s;

public void setup(){
size(394, 500, P3D);
s = loadShape("test.svg");

pushMatrix();
translate(0, 0);
shape(s, 0, 0);
popMatrix();

// flippin images!!!
pushMatrix();
translate(394, 0);
scale(-1,1);
shape(s, 0, 0);
popMatrix();

saveFrame("saveImage/flippin_image2.png");
	
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
