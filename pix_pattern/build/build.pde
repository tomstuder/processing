void setup(){
	size(800, 800);
	smooth();


for (int x = 0; x <=width; x+=10){
	for (int y = 0; y <=height; y+=10){
		stroke(random(0, 255));
		strokeWeight(random(1,5));
		rect(x, y, 5, 5);
	}

  }
  saveFrame("static.png");

}


