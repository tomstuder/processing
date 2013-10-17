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

// variable setup
int a = 1; // size
int b = 0; // up + down toggle
int scr = 100;
int sz = 50; // total size

public void setup(){
	size(scr, scr);
	smooth();

rectMode(CENTER);
}

public void draw(){
background(200,50,0);

	strokeWeight(1);
	fill(255,25,0);
	rect(width/2, height/2, a, a);
	
	if (a == sz){
		b = 1;
	}else if (a == 0) {
		b = 0;
	}

	if (b == 0){
		a++;
	}else {
		a--;
	}

// saveFrame("render/filename-####.tif");
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
