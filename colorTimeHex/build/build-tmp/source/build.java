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
	smooth();
}

public void draw(){

int h = hour();   // 0 - 24
int m = minute(); // 0 - 59 
int s = second(); // 0 - 59 

// create a string of numbers from the time (combined)
String t = "" + h + m + s;

// create integer from combined hour + minute + second
int n = PApplet.parseInt(t);	

background(n); // uses parsed string as color value
println(n);
}

// issues: if time is 12:03:05, the int value will appear as 1235
// Intent is to have a smooth transition between color values
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
