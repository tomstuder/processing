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

PImage pt1, pt2, pt3, pt4;

public void setup(){
size(800, 800);
background(0xffE2E2E2);

// tint(10, 0, 50, 255);
pt1 = loadImage("pt1.png");

// tint(255, 100, 75, 255);
pt2 = loadImage("pt2.png");

// tint(255, 100, 75, 255);
pt3 = loadImage("pt3.png");

// tint(255, 100, 75, 255);
// pt4 = loadImage("pt4.png");

smooth();

		// for (int i = 0; i<10; i++){
		// pushMatrix();
		// translate(400, 400);
		// rotate(i * 45);
		// image(pt4, 0, 0, 125, 125);
		// popMatrix();

		// }


	pushMatrix();
	translate(400, 400);
	noFill();
	strokeWeight(1);
	stroke(200,200,200);
	ellipse(0, 0, 280, 280);
	popMatrix();

	pushMatrix();
	translate(400, 400);
	noStroke();
	fill(150, 150, 150);
	ellipse(0, 0, 228, 228);
	popMatrix();


		for (int i = 0; i<32; i++){
		pushMatrix();
		translate(400, 400);
		rotate(radians(i * 20));
		image(pt1, 0, 0, 100, 100);
		popMatrix();
		}

	pushMatrix();
	translate(400, 400);
	noFill();
	stroke(200,200,200);
	strokeWeight(2);
	ellipse(0, 0, 228, 228);
	popMatrix();


	pushMatrix();
	translate(400, 400);
	noFill();
	stroke(200,200,200);
	strokeWeight(1);
	ellipse(0, 0, 212, 212);
	popMatrix();

	pushMatrix();
	translate(400, 400);
	noFill();
	stroke(200,200,200);
	strokeWeight(1);
	ellipse(0, 0, 200, 200);
	popMatrix();


	pushMatrix();
	translate(400, 400);
	noStroke();
	fill(150, 150, 150);
	ellipse(0, 0, 120, 120);
	popMatrix();

		for (int i = 0; i<11; i++){
		pushMatrix();
		translate(400, 400);
		rotate(i * 20);
		image(pt2, 0, 0, 50, 50);
		popMatrix();

		}

		for (int i = 0; i<18; i++){
		pushMatrix();
		translate(400, 400);
		rotate(radians(i * 20));
		image(pt3, 0, 0, 100, 100);
		popMatrix();
		}



	pushMatrix();
	translate(400, 400);
	noStroke();
	fill(100,100,100);
	ellipse(0, 0, 20, 20);
	popMatrix();


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
