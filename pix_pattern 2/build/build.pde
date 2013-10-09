void setup(){
	size(800, 800);
	smooth();


for (int x = 0; x <=width; x+=20){
	for (int y = 0; y <=height; y+=20){
		stroke(random(0, 255));
		fill(random(0, 255), random(20, 200));
		strokeWeight(random(0,2));
		rect(x, y, random(2, 400), random(2, 400));
	}

  }
  saveFrame("static.png");

}


