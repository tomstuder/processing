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
size(500, 500);
}

public void draw(){

int s = second();
int m = minute(); 
int h = hour();

String col = "colors " + h + m + s;

background(s + 150,m + 100, h);

for (int x = 0; x <=width; x+=20){
	for (int y = 0; y <=height; y+=20){
		// stroke(s,h,m);
		fill(s+160, m+110, h, random(0, 200));
		stroke(s+100, 0, 0,random(0, 200));
		// strokeWeight(random(1));
		rect(x, y, random(1, 20), random(1, 20));
  }
 }
 // Use MovieMaker in Processing Tools to create .mov file (uncomment saveFrame below)
 // saveFrame("render/line-######.tif");
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
