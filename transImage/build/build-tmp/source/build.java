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

PImage bg,one,two,three,four;

public void setup(){
size(600, 600);
bg = loadImage("data/bg.jpg");
image(bg, 0, 0, width, height);
smooth();

for (int i = 0; i<250; i++){
one = loadImage("data/trans.png");
two = loadImage("data/red.png");
three = loadImage("data/redblue.png");
four = loadImage("data/bluex.png");
image(one, random(-10, 600), random(-10, 600), 10, 10);
image(two, random(-10, 600), random(-10, 600), 10, 10);
image(three, random(-10, 600), random(-10, 600), 10,10);
image(four, random(-10, 600), random(-10, 600), 20, 20);
rotate(random(10, 180));
image(four, random(-10, 600), random(-10, 600), 30, 30);
// stroke(random(0, 255), random(10, 150));
noStroke();
fill(random(0, 20), random(0, 50));
rect(random(0, 600), random(0, 600), random(20, 600), random(20, 600));
  }

  saveFrame("random_trans.png");

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
