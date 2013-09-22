// Adaptation of Tutorial from "Getting Started With Processing" by Casey Reas

float x;
float easingX = 0.01;

float y;
float easingY = 0.01;

void setup(){
	
	size(600, 600);
	smooth();

}

void draw(){

float targetX = mouseX;
float targetY = mouseY;

x += (targetX - x) * easingX;
y += (targetY - y) * easingY;

ellipse(x, y, 12, 12);
		
}