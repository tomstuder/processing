// Tutorial from Getting Started With Processing pg. 55 by Casey Reas
void setup(){
	size(600, 600);
	stroke(0, 120);
	smooth();
}

void draw(){
float weight = dist(mouseX, mouseY, pmouseX, pmouseY);
strokeWeight(weight);
line(mouseX, mouseY, pmouseX, pmouseY);
		
}