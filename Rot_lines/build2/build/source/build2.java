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

public class build2 extends PApplet {

int a = 10;
public void setup() {
size(800, 800);
smooth();
background(55);
noStroke();


}
public void draw() {
background(0xff3498db);
  float x = 0.0f;
    // while (x < width) {
    //   float y = 0.0;
    //   while (y < height) {
    //     fill(255);
    //     stroke(0);
    //     rect(x, y, a, a);
    //     y = y + 12;
    //   }
    //   x = x + 12;
    // }


  int f = 0;
while (f < 1600) {
  fill(random(0, 255),random(0, 255),random(0, 255));
  // fill(#8e44ad);
  rotate(random(1, 45));
  noStroke();
  rect(f, f, random(1, 2), random(10, 200));
  f++;
  }
  // saveFrame("line-######.tga");
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
