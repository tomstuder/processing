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
  public void setup() {
size(600, 600);
background(255);
float v = 0.0f;
float inc = 0.1f;
noStroke();
noiseSeed(4);

for (int i = 0; i < width; i = i+3) {
	float n = noise(v) * 20;
	fill(200);
	rect(i, 1 + n, 1, height);
	v = v + inc;
}
for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(150);
	rect(i, 10 + n, 1, 450);
	v = v + inc;
}

for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(100);
	rect(i, 0 + n, 1, 150);
	v = v + inc;
}
for (int i = 0; i < width; i = i+5) {
	float n = noise(v) * 70;
	fill(0);
	rect(i, 2 + n, 1, 500);
	v = v + inc;
}
for (int j = 0; j<100; j+=10){
	fill(random(30, 200), 20);
	rect(random(0,500),random(0,500), 200, 200);
}

for (int i = 0; i < 20; i = i+5) {
	float n = noise(v) * 70;
	fill(150);
	rect(i, 8 + n, 2, 30);
	v = v + inc;
}



saveFrame("render.jpg");
    noLoop();
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
