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

	size(600, 600);


	for (int i = 0; i<6; i++){
		pushMatrix();
		translate(300, 300);
		rotate(i);
		fill(10+i, 65+i, 50+i, 100);
		rect(0, 0, 600, 600);
		popMatrix();

	}


	for (int i = 0; i<6; i++){
		pushMatrix();
		translate(300, 300);
		rotate(i);
		fill(15+i, 70+i, 50+i, 100);
		rect(0, 0, 500, 500);
		popMatrix();

	}

		for (int i = 0; i<20; i++){
		pushMatrix();
		translate(300, 300);
		rotate(i);
		fill(12 +i, 15+i, 60+i, 100);
		rect(0, 0, 300, 300);
		popMatrix();

	}

		for (int i = 0; i<30; i++){
		pushMatrix();
		translate(300, 300);
		rotate(i);
		fill(20+i, 0+i, 50+i, 100);

		rect(0, 0, 150, 150);
		popMatrix();

	}

		for (int i = 0; i<6; i++){
		pushMatrix();
		translate(300, 300);
		rotate(i);
		fill(10+i, 0, 30+i, 100);

		rect(0, 0, 50, 50);
		popMatrix();

	}
	saveFrame("render.jpg");

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
