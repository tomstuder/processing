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

float x,y; 

public void setup() {
  size(600,600);
  background(20);

  x = width/2;
  y = 0;
  smooth();

  // fill(50,100,150,200);
  // noStroke();
  // ellipse(0, 0, 100, 100);


  // fill(50,100,150,100);
  // noStroke();
  // ellipse(0, 0, 200, 200);


  // fill(50,100,150,50);
  // noStroke();
  // ellipse(0, 0, 500, 500);

    fill(50,100,150);
    noStroke();
    for (int i = 0; i<600; i++){
      rotate(5);
   for (int j = 0; j<50; j++){
        ellipse(random(0, 900) ,y, random(1, 5), random(1, 5));
    }
  }


    fill(20,200,50);
    noStroke();
    for (int i = 0; i<300; i++){
      rotate(12);
   for (int k = 0; k<80; k++){
        ellipse(random(0, 900) ,y, random(1, 5), random(1, 5));
    }
  }

saveFrame("burst.png");

}

// For Movement

// void draw() {
//   background(255);
//   // Display the drop
//   fill(50,100,150);
//   noStroke();
//   for (int i = 0; i<400; i++){
//     rotate(10);
//  for (int j = 0; j<20; j++){
//       ellipse(random(0, 400),y,5,5);
//   }
//   }


//     fill(20,200,50);
//   noStroke();
//   for (int i = 0; i<200; i++){
//     rotate(10);
//  for (int k = 0; k<20; k++){
//       ellipse(random(0, 400),y,5,5);
//   }
//   }
 

//   // Move
//   y++ ;
// }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
