PImage bg;


void setup(){
	size(361, 482);
bg = loadImage("ocean.jpg");
image(bg, 0, 0);


	for (int i = 0; i<150; i++){
		stroke(#FFFFFF, 50);
		noFill();
		ellipse(random(-5, 370), random(-5, 490), random(10, 700), random(10, 700));
	}
	for (int i = 0; i<75; i++){
		fill(#FFFFFF, 100);
		ellipse(random(0, 490), random(0, 500), 5, 5);
	}
fill(#111c72, 65);
noStroke();
rect(100, 400, 261, 50);
}
