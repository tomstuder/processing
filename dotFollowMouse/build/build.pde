void setup(){
	size(600, 600);
	fill(255,0,0);
	smooth();
	noStroke();
}

void draw(){
	frameRate(10);
	background(204);
	ellipse(mouseX, mouseY, 10, 10);
		
}