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

// 01 build.pde
// Create a v with a rect

public void setup(){
	size(600, 600);
	smooth();

for (int i = 0; i<1200; i++){
		noStroke();
		fill(random(0, 255), random(0, 255), random(0, 255));
		rect(i, i, 600, 600);

}


for (int i = 0; i<1000; i++){
		noFill();
		fill(random(0, 255), random(0, 255), random(0, 255));
		rect(width - i, i, 800, 800);

}

for (int i = 0; i>1000; i--){
	noStroke();
	fill(random(0, 255), random(0, 255), random(0, 255));
	rect(200, 200, 200 + i, 200+i);
}



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
